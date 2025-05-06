package inet;
import java.net.*; 
public class inetone {
public static void main(String[] args) {
try{ 
InetAddress ip=InetAddress.getByName("engg.dypvp.edu.in"); 
 
System.out.println("Host Name: "+ip.getHostName()); 
System.out.println("IP Address:"+ip.getHostAddress()); 
}
catch(Exception e)
{
System.out.println(e);
} 
} 
}
 