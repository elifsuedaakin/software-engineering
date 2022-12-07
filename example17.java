/*
 *john wallis ardışık çarpımı ile hesaplanabilmektedir.
klavyeden girilen terim sayısı kadar carpım yaparak pi sayısını hesaplayan program 
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı");
        int n=input.nextInt();
        double c=1;
        for(int k=1;k<=n;k++){
            int c1;
            c1=4*k*k;
            c=c*c1/(c1-1);
            
        }System.out.println(2*c);
                
        // TODO code application logic here
    }
    
}
