/*
 * dost sayılar 97.örnek

 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("birincş sayıyı giriniz");
        int a=input.nextInt();
        System.out.println("ikinci sayıyı girin");
        int b=input.nextInt();
        int ta=0;
                int tb=0;
                for(int i=1;i<=a-1;i++) {
                    if(a%i==0) {
                        ta=ta+i;
                        
                    }
                } for(int j=1;j<=b-1;j++) {
                    if(b%j==0){
                        tb=tb+j;
                    }
                }
        if((ta==b) && (tb==a)) {
            System.out.println("dost sayılar");
        } else { 
            System.out.println("dost sayı degil");
        }
    }
    
}
