package rmiPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class StoreManager_1 extends UnicastRemoteObject implements Store{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected StoreManager_1() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getPrice(String ingredient) throws RemoteException {
		  	File file = new File("src\\rmiPackage\\StoreDB\\Mag1.txt");
	        float price = (float) 0.0;
	        try (Scanner sc = new Scanner(file)) {
				while (sc.hasNextLine()) {
					 final String lineFromFile = sc.nextLine();
					   if(lineFromFile.contains(ingredient)) {
					       price = Float.parseFloat(sc.nextLine()) ;
					       System.out.println(price);
					       break;
					   }
					}
				   
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        return price;
			
	}

}
