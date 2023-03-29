/*girilen sayının asallığını kontrol edip yazdıran metot
 * 
 * */

import java.util.Scanner;
/**
 *
 * @author elifs
 */
public class example3 {
    public static void main (String args[]){
Scanner input=new Scanner(System.in);
        System.out.println(asalBul(19));
        

}
    public static int asalBul(int sayı){
     int sayac=0;
     for(int i=2;i<sayı;i++){
         if(sayı==2){
             System.out.println(sayı+"sayı asaldır");
             break;
         }
         else if(sayı%i==0){
             System.out.println(sayı+"asal değildir");
           
             sayac++;
             break;
         }
         if(sayac==0){
             System.out.println(sayı +"sayı asaldır");
             break;
         }
         else{ System.out.println("girilen sayı asal değildir");
         break;
         }
                 
         
     }
     return sayac;
    }}
