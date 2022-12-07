/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */// örnek 86 asal sayı buluyoruz
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n,s;
        System.out.println("belirtilen aralıktaki asal sayılar ");
        System.out.println("üst sınır =>");
        n =input.nextInt();
        System.out.println("\n+++ ASAL SAYILAR +++\n\n");
        for(int i=2;i<=n;i++)
        { s=0; 
        for( int j=1;j<=1;j++)
              if (i%j==0) 
                  s++;
        if(s==2)
                System.out.print(i+"\t");}}
    
}
