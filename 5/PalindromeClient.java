package rmi;
import java.rmi.*;
import java.rmi.registry.*;


public class PalindromeClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		PalindromeInterface obj1 = (PalindromeInterface)Naming.lookup("rmi://localhost:5000/XYZ");
		String ans1 = obj1.palindromeCheck("MADAM");
		String ans2 = obj1.palindromeCheck("ALLU");
		System.out.println(ans1);
		System.out.println(ans2);
	}

}