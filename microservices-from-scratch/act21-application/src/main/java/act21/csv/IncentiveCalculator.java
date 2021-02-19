package act21.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import act21.model.Employee;
import act21.model.Fraud;
import act21.model.SampleOutput;
import act21.model.Transaction;

public class IncentiveCalculator {

	public static void main(String[] args) {

		CSVFileReader csvReader = new CSVFileReader();
		
		@SuppressWarnings("unchecked")
		List<Employee> employeeList = (List<Employee>) csvReader.read("D:\\Act21-Assignment/employee.csv", "employee");
		System.out.println(employeeList);
		
		@SuppressWarnings("unchecked")
		List<Transaction> transactionList = (List<Transaction>) csvReader.read("D:\\Act21-Assignment/transaction.csv", "transaction");
		System.out.println(transactionList);
		
		@SuppressWarnings("unchecked")
		List<Fraud> fraudList = (List<Fraud>) csvReader.read("D:\\Act21-Assignment/fraud.csv", "fraud");
		System.out.println(fraudList);
		
		/**
		 1.Filter all fraud employees from output . 
		 Incentive calculation should not be done for fraud employees & should be skipped in output file.
		 */
		List<Employee> filteredEmployeeList = new ArrayList<Employee>(employeeList.size());
		List<Integer>fraudEmpList = new ArrayList<Integer>(fraudList.size());
		for(Fraud f:fraudList) {
			fraudEmpList.add(f.getEmpId());
		}
		for(Employee e:employeeList) {
			if(!fraudEmpList.contains(e.getEmpId())) {
				filteredEmployeeList.add(e);
			}
		}
		/**
		2.Incentive Amount Calculation for each transaction
		 A)Product Type based amount mapping -
		
		LOAN - 100
		FD - 50
		RD - 60
		SA - 40
		Any other - 10 
		B)If priority is true then amount should be 200 , this will supersede product logic
		
		C)If transaction is cancelled or if trans_type is cancel , amount should be zero . Cancel of any transaction is represented as another transaction with trans_type as CANCEL.
		
		For ex. Below data is representing the cancellation of transaction 7075
		trans_id,trans_product_type,trans_type,trans_amount,trans_parent_id,priority,emp_id
		7079,LOAN,CANCEL,819,7075,,1235  
		
		For Both 7079 & 7075 amount should be 0.

		 */
		List<SampleOutput> sampleOutputList = new ArrayList<SampleOutput>();
		for(int i=0;i<filteredEmployeeList.size();i++) {
			for(int j=i;j<=i;j++) {
				SampleOutput sample = new SampleOutput();

				sample.setEmpId(filteredEmployeeList.get(i).getEmpId());
				sample.setEmpName(filteredEmployeeList.get(i).getName());
					
				if(transactionList.get(j).getTransProductType().equals("LOAN")) {
					if(transactionList.get(j).isPriority().equals("TRUE")) {
						sample.setAmount(200);
					}else {
						sample.setAmount(100);
					}
					
				}else if(transactionList.get(j).getTransProductType().equals("FD")) {
					if(transactionList.get(j).isPriority().equals("TRUE")) {
						sample.setAmount(200);
					}else {
						sample.setAmount(50);
					}
				}else if(transactionList.get(j).getTransProductType().equals("RD")) {
					if(transactionList.get(j).isPriority().equals("TRUE")) {
						sample.setAmount(200);
					}else {
						sample.setAmount(60);
					}
				}else if(transactionList.get(j).getTransProductType().equals("SA")) {
					if(transactionList.get(j).isPriority().equals("TRUE")) {
						sample.setAmount(200);
					}else {
						sample.setAmount(40);
					}
				}else {
					sample.setAmount(10);
				}
				if(transactionList.get(j).getTransType().equals("CANCEL")) {
					if(transactionList.get(j).getEmpId()==709 || transactionList.get(j).getEmpId()==705) {
						sample.setAmount(0);
					}else {
						sample.setAmount(0);
					}
				}
				/**
				 For Both 7079 & 7075 amount should be 0.
				3.	Incentive Amount Calculation on the basis of Employee Location Category 
				Extra incentive will be given on the basis of location , location incentive will be added to amount previously calculated.
				
				Note - In case employee earned 0 incentive for transactions this will also be 0 I.e no location based incentive to be given in this scenario.
				
				Category - CATA
				If location is Delhi,Punjab,Maharashtra
				Amount - 10
				
				Category - CATB
				If location is Haryana,Gujarat
				Amount - 5
				
				Category - CATC
				For any other location
				Amount - 0

				 */
				List<String> categoryCATA = Arrays.asList("Delhi","Punjab","Maharashtra");
				List<String> categoryCATB = Arrays.asList("Haryana","Gujarat");
				if(categoryCATA.contains(filteredEmployeeList.get(i).getLocation())) {
					sample.setLocationCategory("CATA");
					sample.setAmount(10);
				}else if(categoryCATB.contains(filteredEmployeeList.get(i).getLocation())) {
					sample.setLocationCategory("CATB");
					sample.setAmount(5);
				}else {
					sample.setLocationCategory("CATC");
					sample.setAmount(0);
				}
					sampleOutputList.add(sample);
				
			}
		}
		
		System.out.println("sampleOutputList:"+sampleOutputList);
		String csvFilePath = "D:\\Act21-Assignment/sampleOutput.csv";
	    
	    if (sampleOutputList.size() != 0) {
			generateCSVFile(sampleOutputList,csvFilePath);
		}
		
	}

	private static void generateCSVFile(List<SampleOutput> sampleOutputList,String csvFilePath) {
			//Delimiter used in CSV file
		    final String COMMA_DELIMITER = ",";
		    final String NEW_LINE_SEPARATOR = "\n";
		     
		    //CSV file header
		    final String FILE_HEADER = "emp_id,emp_name,location_category,amount";
	         
	        FileWriter fileWriter = null;
	                 
	        try {
	            fileWriter = new FileWriter(csvFilePath);
	 
	            //Write the CSV file header
	            fileWriter.append(FILE_HEADER.toString());
	             
	            //Add a new line separator after the header
	            fileWriter.append(NEW_LINE_SEPARATOR);
	             
	            //Write a new student object list to the CSV file
	            for (SampleOutput row : sampleOutputList) {
	                fileWriter.append(String.valueOf(row.getEmpId()));
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(row.getEmpName());
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(row.getLocationCategory());
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(String.valueOf(row.getAmount()));
	                fileWriter.append(NEW_LINE_SEPARATOR);
	            }
	            System.out.println("CSV file was created successfully !!!");
	             
	        } catch (Exception e) {
	            System.out.println("Error in CsvFileWriter !!!");
	            e.printStackTrace();
	        } finally {
	             
	            try {
	                fileWriter.flush();
	                fileWriter.close();
	            } catch (IOException e) {
	                System.out.println("Error while flushing/closing fileWriter !!!");
	                e.printStackTrace();
	            }
	             
	        }
		
	}

}
