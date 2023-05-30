/**
 * 
 */
/**
 * @author Oussama MAHMOUD
 *
 */
package rmiPackage;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMag2 {

	public static void main(String[] args) throws RemoteException, NotBoundException, AlreadyBoundException {

		 try {
		     Registry registry = LocateRegistry.createRegistry(2002);

		     Store StoreMag2 = new StoreManager_2();

		     registry.bind("StoreManager_2",StoreMag2);
		     System.out.println("Mag2's Server is now started ...");
		 }

		 catch (Exception e) {
		     System.err.println(e.toString());
		 }
			}}

