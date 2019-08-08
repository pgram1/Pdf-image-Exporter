package pdfThing;

import java.io.IOException;

public class Document {

	private String path;
	private String outputFolder;
	private String outputFile;

	public Document(String path) {
		this.path = path;
		
		//creating a directory name out of a file name by eliminating dots
		this.outputFolder = (path+"-exports").replace(".", "-");
		
		//creating a file name out of the directory name
		this.outputFile = outputFolder+"/exported";
	}
	
	void getImages() throws IOException{
			System.out.println("\n-----\nCreating output directory\n-----\n");
			System.out.println("mkdir "+outputFolder);
			Runtime.getRuntime().exec("mkdir "+outputFolder);
			
			
			System.out.println("\n-----\nExporting all images as PNG\n-----\n");
			System.out.println("pdfimages -png "+path+" "+outputFile);
			Runtime.getRuntime().exec("pdfimages -png "+path+" "+outputFile);
	}	

}
