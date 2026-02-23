package project.src;
import java.net.InetAddress;
import java.util.*;
public class DomainToIPResolver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("===== DOMAIN TO IP RESOLVER =====");
        
        while(true){
            System.out.println("Enter Website name  (or type 'exit' to quit):");
            String website=sc.nextLine().trim();

            if(website.equalsIgnoreCase("exit")){
                System.out.println("Exiting...Thank You!");
                break;
            }

            try{
                InetAddress ip=InetAddress.getByName(website);

                System.out.println("\n --------Result-------");
                System.out.println("Website:"+website);
                System.out.println("IP Address:"+ip.getHostAddress());
                System.out.println("Host Name:"+ip.getHostName());
                System.out.println("Canonical Host Name:"+ip.getCanonicalHostName());
            }
            catch(Exception e){
                System.out.println("Invalid Website or Unable to resolve");
            }
        }
        sc.close();
    }
    
}
