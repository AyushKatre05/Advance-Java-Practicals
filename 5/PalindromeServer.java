package rmi;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PalindromeServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Registry reg = LocateRegistry.createRegistry(5000);
		
		PalindromeInterface obj = new PalindromeClass();
		reg.bind("XYZ", obj);
		

	}

}