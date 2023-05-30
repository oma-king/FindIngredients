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

public class StoreManager_3 extends UnicastRemoteObject implements Store{

	protected StoreManager_3() throws RemoteException {
		super();
	}

	@Override
	public float getPrice(String ingredient) throws RemoteException {
		  	File file = new File("src\\rmiPackage\\StoreDB\\Mag3.txt");
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
