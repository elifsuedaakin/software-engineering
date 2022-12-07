/*uzun kenarı eşit ve bu kenarlardan birinin ,kısa kenara oranıaltın orana esit olan  ikizkenar üçgenlere altın üçgen denir 
 * ///klavyeden kısa kenarı girilen kısa kenarı girilen altın üçgenin tüm kenarlarını yazdıran program
 *///84.örnek
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("kısa kenarı giriniz");
        int a=input.nextInt();
        int b;
        b=a*(1+5^(1/2))/2;
        System.out.println(a+"a"+b+"b"+b+"b");
        
       
    }
    
}
