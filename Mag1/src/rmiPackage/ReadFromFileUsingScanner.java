package rmiPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFileUsingScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// pass the path to the file as a parameter
//        File file = new File("src\\rmiPackage\\StoreDB\\Mag1.txt");
//        String ingredient = "";
//        float price = (float) 0.0;
//        int lines = 0;
//        
//        try (Scanner sc = new Scanner(file)) {
//			while (sc.hasNextLine()) {
//				
//				if (lines % 2 == 0) {
//					ingredient = sc.nextLine();
//					System.out.println(ingredient);
//				}
//				
//				else {
//					price = Float.parseFloat(sc.nextLine()) ;
//					 System.out.println(price);
//				}
//				lines++;
//				
//			}
//			   
//		}
		String ingredient= "sel";
		File file = new File("src\\rmiPackage\\StoreDB\\Mag1.txt");
        String dbingredient = "";
        float price = (float) 0.0;
        int lines = 0;
        boolean isFound = false;
        try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				 final String lineFromFile = sc.nextLine();
				   if(lineFromFile.contains(ingredient)) { 
				       // a match!
				       System.out.println("I found " +ingredient+ " in file " +file.getName());
				       price = Float.parseFloat(sc.nextLine()) ;
				       System.out.println(price);
				       break;
				   }
				}
			   
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
