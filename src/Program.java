package pdfThing;

import java.io.IOException;

public class Program {

	public static void main(String[] args){	
		
		if(args.length==1) {
			System.out.println("'"+args[0].toString()+"' was the path you provided!");
			Document a = new Document(args[0].toString());
			try {
				a.getImages();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("This script needs a pdf path to work! Exiting...");
		}
	}

}
