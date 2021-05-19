package com.xlsx;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import com.model.Book;
import com.model.Product;

public class Test2 {
	
	private static String produceCsvData(Object[] data) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
	    if(data.length==0)
	    {
	        return "";
	    }

	    Class<?> classType = data[0].getClass();
	    StringBuilder builder = new StringBuilder();

	    Method[] methods = classType.getDeclaredMethods();

	    for(Method m : methods)
	    {
	        if(m.getParameterTypes().length==0)
	        {
	            if(m.getName().startsWith("get"))
	            {
	                builder.append(m.getName().substring(3)).append(',');
	            }
	            else if(m.getName().startsWith("is"))
	            {
	                builder.append(m.getName().substring(2)).append(',');
	            }

	        }

	    }
	    builder.deleteCharAt(builder.length()-1);
	    builder.append('\n');
	    for(Object d : data)
	    {
	        for(Method m : methods)
	        {
	            if(m.getParameterTypes().length==0)
	            {
	                if(m.getName().startsWith("get") || m.getName().startsWith("is"))
	                {
	                    System.out.println(m.invoke(d).toString());
	                    builder.append(m.invoke(d).toString()).append(',');
	                }
	            }
	        }
	        builder.append('\n');
	    }
	    builder.deleteCharAt(builder.length()-1);
	    return builder.toString();
	}

	public static boolean generateCSV(File csvFileName,Object[] data)
	{
	    FileWriter fw = null;
	    try
	    {
	        fw = new FileWriter(csvFileName);
	        if(!csvFileName.exists())
	            csvFileName.createNewFile();
	        fw.write(produceCsvData(data));
	        fw.flush();
	    }
	    catch(Exception e)
	    {
	        System.out.println("Error while generating csv from data. Error message : " + e.getMessage());
	        e.printStackTrace();
	        return false;
	    }
	    finally
	    {
	        if(fw!=null)
	        {
	            try
	            {
	                fw.close();
	            }
	            catch(Exception e)
	            {
	            }
	            fw=null;
	        }
	    }
	    return true;
	}
	/*
	//European countries use ";" as 
    //CSV separator because "," is their digit separator
	   private static final String CSV_SEPARATOR = ",";
	    private static void writeToCSV(ArrayList<Product> productList)
	    {
	        try
	        {
	        	FileOutputStream fos = new FileOutputStream("products.csv");
	        	OutputStreamWriter osw =new OutputStreamWriter(fos, "UTF-8");
	            BufferedWriter bw = new BufferedWriter(osw);
	            for (Product product : productList)
	            {
	                StringBuffer oneLine = new StringBuffer();
	                oneLine.append(product.getId() <=0 ? "" : product.getId());
	                oneLine.append(CSV_SEPARATOR);
	                oneLine.append(product.getName().trim().length() == 0? "" : product.getName());
	                oneLine.append(CSV_SEPARATOR);
	                oneLine.append(product.getCostPrice() < 0 ? "" : product.getCostPrice());
	                oneLine.append(CSV_SEPARATOR);
	                oneLine.append(product.isVatApplicable() ? "Yes" : "No");
	                bw.write(oneLine.toString());
	                bw.newLine();
	            }
	            bw.flush();
	            bw.close();
	        }
	        catch (UnsupportedEncodingException e) {}
	        catch (FileNotFoundException e){}
	        catch (IOException e){}
	    }
	    
	    public <T> void writeCSV(List<T> listBook, String csvFilePath) {
			
			try {
					FileOutputStream fos = new FileOutputStream(csvFilePath);
		        	OutputStreamWriter osw =new OutputStreamWriter(fos, "UTF-8");
		            BufferedWriter bw = new BufferedWriter(osw);
				    Object[] a = listBook.toArray();
				    String[] headers = new String[]{ "Book Name", "Author Name", "Book Price" };
				    for (int i=0;i<a.length;i++) {
				    	Book aBook = (Book) a[i];
				    	
				    	StringBuffer oneLine = new StringBuffer();
		                oneLine.append(aBook.getTitle());
		                oneLine.append(CSV_SEPARATOR);
		                oneLine.append(aBook.getAuthor());
		                oneLine.append(CSV_SEPARATOR);
		                oneLine.append(aBook.getPrice());
		                bw.write(oneLine.toString());
		                bw.newLine();
				    }
				    bw.flush();
		            bw.close();
				    
			} catch (UnsupportedEncodingException e) {}
	        catch (FileNotFoundException e){}
	        catch (IOException e){}
		}
		*/
	    private List<Book> getListBook() {
		    Book book1 = new Book("Head First Java", "Kathy Serria", "79");
		    Book book2 = new Book("Effective Java", "Joshua Bloch", "36");
		    Book book3 = new Book("Clean Code", "Robert Martin", "42");
		    Book book4 = new Book("Thinking in Java", "Bruce Eckel", "35");
		 
		    List<Book> listBook = Arrays.asList(book1, book2, book3, book4);
		 
		    return listBook;
		}
	    public static void main(String[] args)
	    {
	    	/*
	        ArrayList<Product> productList = new ArrayList<Product>();
	        productList.add(new Product(1, "Pen", 2.00, false));
	        productList.add(new Product(2, "TV", 300, true));
	        productList.add(new Product(3, "iPhone", 500, true));
	        writeToCSV(productList);
	        */
	    	
	    	Product[] list = new Product[5];
	        list[0] = new Product("dvd", 24.99, 967, true);
	        list[1] = new Product("pen", 4.99, 162, false);
	        list[2] = new Product("ipad", 624.99, 234, true);
	        list[3] = new Product("crayons", 4.99,127, false);
	        list[4] = new Product("laptop", 1444.99, 997, true);
	        
	        Test2.generateCSV(new File("D:\\products2.csv"),list);
	        Test2 test = new Test2();
		 
//		    List<Book> listBook = test.getListBook();
//			String csvFilePath = "D://test/download/NiceJavaBooks18.csv";
//			 
//			test.writeCSV(listBook, csvFilePath);
	    }
}
