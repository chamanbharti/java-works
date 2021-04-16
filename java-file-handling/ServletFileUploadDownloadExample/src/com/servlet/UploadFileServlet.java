package com.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/uploadFile")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
				 maxFileSize = 1024 * 1024 * 10, // 10MB
				 maxRequestSize = 1024 * 1024* 50 // 50MB
				)
public class UploadFileServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final String SAVE_DIRECTORY = "uploadDir";
	
	public UploadFileServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/jsps/uploadFile.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			  String description = req.getParameter("description");
			  System.out.println("Description: " + description);
			  
	          // Gets absolute path to root directory of web app.
			  String appPath = req.getServletContext().getRealPath("");
			  appPath = appPath.replace('\\', '/');
			// The directory to save uploaded file
	          String fullSavePath = null;
	          if(appPath.endsWith("/")) {
	        	  fullSavePath = appPath + SAVE_DIRECTORY;
	          }else {
	        	  fullSavePath = appPath + "/" + SAVE_DIRECTORY;
	          }
	          
	       // Creates the save directory if it does not exists
	          File fileSaveDir = new File(fullSavePath);
	          if(!fileSaveDir.exists()) {
	        	  fileSaveDir.mkdir();
	          }
	          
	          // Part list (multi files)
	          for(Part part: req.getParts()) {
	        	  String fileName = extractFileName(part);
	        	  if (fileName != null && fileName.length() > 0) {
	                    String filePath = fullSavePath + File.separator + fileName;
	                    System.out.println("Write attachment to file: " + filePath);
	                    // Write to file
	                    part.write(filePath);
	                }
	            }
	            // Upload successfully!.
	            resp.sendRedirect(req.getContextPath() + "/uploadFileResults");
	          
		} catch (Exception e) {
			e.printStackTrace();
            req.setAttribute("errorMessage", "Error: " + e.getMessage());
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsps/uploadFile.jsp");
            dispatcher.forward(req, resp);
		}
	}

	private String extractFileName(Part part) {
		// form-data; name="file"; filename="C:\file1.zip"
		// form-data; name="file"; filename="C:\Note\file2.zip"
		 String contentDisp = part.getHeader("content-disposition");
	     String[] items = contentDisp.split(";");
	     for(String s: items) {
	    	 if(s.trim().startsWith("filename")) {
	    		// C:\file1.zip
	            // C:\Note\file2.zip
	    		 String clientFileName = s.substring(s.indexOf("=")+2,s.length()-1);
	    		 clientFileName = clientFileName.replace("\\", "/");
                int i = clientFileName.lastIndexOf('/');
                // file1.zip
                // file2.zip
                return clientFileName.substring(i + 1);
	    	 }
	     }
		return null;
	}
}
