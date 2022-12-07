/*
 * 71. soru girilen terim sayısına göre seri açılımı hesaplayan program
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir numara giriniz");
        int n=input.nextInt();
       int  t=0;
        for(int i=0;i<n-1;i++){
            t+=1 /((2*i+1)*(2*i+2));
            
        }
        System.out.println("Ln degeri"+t);
     
        // TODO code application logic here
    }
    
}
