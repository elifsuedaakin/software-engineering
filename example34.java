/*
 * iki basamaklı iki doğal sayının birler basamağındaki rakamların toplamı 10 ve onlar basamağındaki rakamları aynı ise bu iki doğal sayının bağdaşık olup olmadığını tespit eden program
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("lütfen birinci sayısı giriniz");
        int a=input.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int b=input.nextInt();
        int a0=a%10;
        int b0=b%10;
        int a1=(a-a0)/10;
        int b1=(b-b0)/10;
        if((a1==b1) && (a0+b0==10)){
            System.out.println("bağdaşık sayılar");
        }
        else {
            System.out.println("bağdaşık sayılar değil");
        }
    }
    
}
