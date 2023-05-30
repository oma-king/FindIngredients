/**
 * 
 */
/**
 * @author Oussama MAHMOUD
 *
 */
package rmiPackage;

/**
* remote interface for Store services
*/
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Store extends Remote {
/**
* get the price of the given ingredient
* * note: this method can be called remotely
	* @param ingredient: the ingredient whose price should be returned
	* @return: the price of the ingredient
	* @throws java.rmi.RemoteException
	*/
	public float getPrice(String ingredient) throws RemoteException;
	}
