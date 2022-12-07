/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */// 119.örnek floyd üçgeni yazdırıyoruz 
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      int n,s=1; 
        System.out.println("satır sayısı");
        n=input.nextInt();
        System.out.println("FLOYD ÜÇGENİ");
        for(int i=1;i<=n;i++){
        for( int j=1;j<=i;j++){
            System.out.printf("%d\t",s);
            s++;
        }
        System.out.println();
        }
        
    }
    }
    

