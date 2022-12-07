/*
 * n.2^n+1 seklinde yazılabilenlere cullen sayıları denir.
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
            int n=input.nextInt();
             for(int i=1;i<=n;i++){
                 System.out.println(i*2^i+1);
             }
    }
    
}
