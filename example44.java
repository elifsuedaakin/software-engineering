/*klavyeden girilen sayılar için kare üçgensel sayıları veren program
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n=input.nextInt();
        int k0=0;
        int k1=1;
        System.out.println(k1);
        for(int i=1;i<n-1;i++){
            int k2=34*k1-k0+2;
            System.out.println(k2);
            k0=k1;
            k1=k2;
        }
    }
    
}
