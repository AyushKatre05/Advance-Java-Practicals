package rmi;
import java.rmi.*;
import java.rmi.server.*;

public class PalindromeClass extends UnicastRemoteObject implements Remote, PalindromeInterface{
		
		PalindromeClass() throws RemoteException{
			super();
		}
		
		

		public String palindromeCheck(String s) {
			String rev = "";
			for (int i = s.length()-1; i>=0; i--) {
				rev += s.charAt(i);
			}
			if (s.equals(rev)) {
				String k = "The word " + s + " is a palindrome !";
				return k;
			}
			else {
				String k = "The word " + s + " is not a palindrome !";
				return k;
			}
		}
}
