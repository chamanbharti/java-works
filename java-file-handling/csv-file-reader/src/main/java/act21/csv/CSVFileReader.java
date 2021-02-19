//package act21.csv;
//
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.opencsv.CSVReader;
//
//import act21.model.Employee;
//import act21.model.Fraud;
//import act21.model.Transaction;
//
//public class CSVFileReader {
//
//	public List<?> read(String filePath, String fileType) {
//		List<Employee> empList = new ArrayList<Employee>();
//		List<Transaction> transactionList = new ArrayList<Transaction>();
//		List<Fraud> fraudList = new ArrayList<Fraud>();
//		try {
//				CSVReader reader = new CSVReader(new FileReader(filePath));
//				String[] nextLine;
//				if (fileType.equals("employee")) {
//					while ((nextLine = reader.readNext()) != null) {
//						String[] row = nextLine;
//						Employee employee = new Employee();
//						employee.setEmpId(Integer.valueOf(row[0]));
//						employee.setName(row[1]);
//						employee.setLocation(row[2]);
//						empList.add(employee);
//					}
//				}else if(fileType.equals("transaction")){
//					while ((nextLine = reader.readNext()) != null) {
//						String[] row = nextLine;
//						Transaction transaction = new Transaction();
//						transaction.setTransId(Integer.valueOf(row[0]));
//						transaction.setTransProductType(row[1]);
//						transaction.setTransType(row[2]);
//						transaction.setTransAmount(row[3]);
//						transaction.setTransParentId(row[4]);
//						transaction.setPriority(row[5]);
//						transaction.setEmpId(Integer.valueOf(row[6]));
//						transactionList.add(transaction);
//					}
//					
//				}else if(fileType.equals("fraud")){
//					while ((nextLine = reader.readNext()) != null) {
//						String[] row = nextLine;
//						Fraud fraud = new Fraud();
//						fraud.setEmpId(Integer.valueOf(row[0]));
//						fraudList.add(fraud);
//					}
//					
//				}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		if(fileType.equals("employee")) {
//			return empList; 
//		}else if(fileType.equals("transaction")) {
//			return transactionList;
//		}else {
//			return fraudList;	
//		}
//		
//	}
//}

package act21.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

import act21.model.Employee;
import act21.model.Fraud;
import act21.model.Transaction;

public class CSVFileReader {

	public List<?> read(String filePath, String fileType) {
		List<Employee> empList = new ArrayList<Employee>();
		List<Transaction> transactionList = new ArrayList<Transaction>();
		List<Fraud> fraudList = new ArrayList<Fraud>();
		String line = "";
		try {
				BufferedReader reader = new BufferedReader(new FileReader(filePath));
				//Read the CSV file header to skip it
	            reader.readLine();
				if (fileType.equals("employee")) {
					while ((line = reader.readLine()) != null) {
						String[] row = line.split(",");
						if(row.length > 0) {
							Employee employee = new Employee();
							employee.setEmpId(Integer.valueOf(row[0]));
							employee.setName(row[1]);
							employee.setLocation(row[2]);
							empList.add(employee);
						}
					}
				}else if(fileType.equals("transaction")){
					while ((line = reader.readLine()) != null) {
						String[] row = line.split(",");
						if(row.length > 0) {
							Transaction transaction = new Transaction();
							transaction.setTransId(Integer.valueOf(row[0]));
							transaction.setTransProductType(row[1]);
							transaction.setTransType(row[2]);
							transaction.setTransAmount(row[3]);
							transaction.setTransParentId(row[4]);
							transaction.setPriority(row[5]);
							transaction.setEmpId(Integer.valueOf(row[6]));
							transactionList.add(transaction);
						}
					}
					
				}else if(fileType.equals("fraud")){
					while ((line = reader.readLine()) != null) {
						String[] row = line.split(",");
						if(row.length > 0) {
							Fraud fraud = new Fraud();
							fraud.setEmpId(Integer.valueOf(row[0]));
							fraudList.add(fraud);
						}
					}
					
				}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(fileType.equals("employee")) {
			return empList; 
		}else if(fileType.equals("transaction")) {
			return transactionList;
		}else {
			return fraudList;	
		}
		
	}
}

