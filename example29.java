/*
 * 94.örnek  klavyeden girilen terim sayısı kadar fermat sayılarını listeleyen programı yazdıran
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı ");
        int n=input.nextInt();
        for(int i=0;i<=n-1;i++){
         System.out.println(2^(2^i)+1);   
    }
       
    
}}
