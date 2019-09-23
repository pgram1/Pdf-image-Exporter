import java.io.IOException;



public class Document
{
  private String path;
  private String outputFolder;
  private String outputFile;
  
  public Document(String path) {
    this.path = path;

    
    this.outputFolder = (String.valueOf(path) + "-exports").replace(".", "-");

    
    this.outputFile = String.valueOf(this.outputFolder) + "\\exported";
  }
  
  void getImages() throws IOException {
    System.out.println("\n-----\nCreating output directory\n-----\n");
    System.out.println("mkdir.exe \"" + this.outputFolder + "\"");
    Runtime.getRuntime().exec("3rdbinaries\\mkdir.exe \"" + this.outputFolder + "\"");

    
    System.out.println("\n-----\nExporting all images as PNG\n-----\n");
    System.out.println("pdfimages.exe -png \"" + this.path + "\" \"" + this.outputFile + "\"");
    Runtime.getRuntime().exec("3rdbinaries\\pdfimages.exe -png \"" + this.path + "\" \"" + this.outputFile + "\"");
  }
}
