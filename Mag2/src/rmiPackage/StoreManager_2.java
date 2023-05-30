/**
 * 
 */
/**
 * @author Oussama MAHMOUD
 *
 */
package rmiPackage;


import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class StoreManager_2 extends UnicastRemoteObject implements Store{

	protected StoreManager_2() throws RemoteException {
		super();
	}

	@Override
	public float getPrice(String ingredient) throws RemoteException {
		  	File file = new File("src\\rmiPackage\\StoreDB\\Mag2.txt");
		  	float price = (float) 0.0;
	        try (Scanner sc = new Scanner(file)) {
				while (sc.hasNextLine()) {
					 final String lineFromFile = sc.nextLine();
					   if(lineFromFile.contains(ingredient)) {
					       price = Float.parseFloat(sc.nextLine()) ;
					      
					   }
					}
				   
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        return price;
	}

}
