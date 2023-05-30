/**
 * 
 */
/**
 * @author Oussama MAHMOUD
 *
 */
package rmiPackage;

import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMag3 {

	public static void main(String[] args) throws RemoteException, NotBoundException, AlreadyBoundException {

		 try {
		     Registry registry = LocateRegistry.createRegistry(2003);

		     Store StoreMag3 = new StoreManager_3();

		     registry.bind("StoreManager_3",StoreMag3);
		     System.out.println("Mag3's Server is now started ...");
		 }

		 catch (Exception e) {
		     System.err.println(e.toString());
		 }
			}}
