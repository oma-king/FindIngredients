package rmiPackage;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMag1 {

	public static void main(String[] args) throws RemoteException, NotBoundException, AlreadyBoundException {

 try {
     Registry registry = LocateRegistry.createRegistry(2001);
     Store StoreMag1 = new StoreManager_1();
     registry.bind("StoreManager_1",StoreMag1);
     System.out.println("Mag1's Server is now started ...");
 }

 catch (Exception e) {
     System.err.println(e.toString());
 }
	}}
