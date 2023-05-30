/**
 * 
 */
/**
 * @author Oussama MAHMOUD
 *
 */
package rmiPackage;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class StoreClient {
	
	public static void getPrice(String ingredient) throws RemoteException, MalformedURLException, NotBoundException {
		
		Store stubStoreManager_1 = (Store) Naming.lookup("rmi://localhost:2001/StoreManager_1");
		Store stubStoreManager_2 = (Store) Naming.lookup("rmi://localhost:2002/StoreManager_2");
		Store stubStoreManager_3 = (Store) Naming.lookup("rmi://localhost:2003/StoreManager_3");
		
		float priceMag1 = stubStoreManager_1.getPrice(ingredient);
		float priceMag2 = stubStoreManager_2.getPrice(ingredient);
		float priceMag3 = stubStoreManager_3.getPrice(ingredient);
		
		float minPrice = Math.min(priceMag1, Math.min(priceMag2, priceMag3));
		String minMag = "";
		
		if(minPrice == priceMag1) minMag = "Mag1";
		else if(minPrice == priceMag2) minMag = "Mag2";
		else if(minPrice == priceMag3) minMag = "Mag3";
		System.out.print("Le prix le plus bas de l’ingrédient « " + ingredient + " » est de « "+ (int) minPrice +" DT » et se trouve chez « " + minMag +" »");
		}
	


	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sélectionner le numéro de l’ingrédient, puis cliquez sur « Entrée » : ");
		System.out.println("[1] cornichons");
		System.out.println("[2] safran");
		System.out.println("[3] sel");
		System.out.println("[4] poivre");
		System.out.println("[5] sucre");
		int clientInput = sc.nextInt();
		
		switch (clientInput) {
		case 1:
			getPrice("cornichons");
			sc.close();
			break;
		case 2:
			getPrice("safran");
			sc.close();
			break;
		case 3:
			getPrice("sel");
			sc.close();
			break;
		case 4:
			getPrice("poivre");
			sc.close();
			break;
		case 5:
			getPrice("sucre");
			sc.close();
			break;
		default:
			System.out.println("Le numéro de l’ingrédient inséré est invalide !");
			sc.close();
			return;
		}

	}

}
