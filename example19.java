/*
 * klavyeden girilen bölüm sayısına göre kok üç değeri hesaplayan program
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n=input.nextInt();
        double t=1;
        for(int i=1;i<=n-1;i++){
            t=1+1/(2+1/t);
            
            
            
        } System.out.println(1+1/t);
    }
    
}
