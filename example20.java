/*
 * klavyden girilen bölüm sayısına göre kök 5 değerini hesaplayan program
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n=input.nextInt();
        double t=1;
        for( int i=0;i<=n;i++){
            t=4+1/t;
            
        }System.out.println(2+1/t);
    }
    
}
