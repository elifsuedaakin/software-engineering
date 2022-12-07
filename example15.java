/*
 * 76. soru brothers formülü kullanarak  e değeri hesaplama
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n=input.nextInt();
        double t=2,f;
        for(int k=1;k<=n;k++){
            f=(2*k+1);
            t=t+(2*k+2)/f;
            
        } System.out.println("e değeri"+t);
        // TODO code application logic here
    }
    
}
