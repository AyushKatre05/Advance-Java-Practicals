package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface PalindromeInterface extends Remote  {

	
	public String palindromeCheck(String s) throws RemoteException;

	

}