/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///72.ornek 1-99 arası bir tam sayı tahmin etme oyunu 
import java.awt.BorderLayout;
import java.util.Scanner;
/**
 
 * @author Asus
 */
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rastgelesayı,tahmin,s=0;
    Scanner input =new Scanner(System.in);
    rastgelesayı=(int)(Math.random()*98)+1;
    do{System.out.println("tahmininiz");
    tahmin=input.nextInt();
    s++;
    if(tahmin>rastgelesayı) System.out.println("Daha küçük sayı giriniz");
    if(tahmin<rastgelesayı) System.out.println("daha büyük sayı giriniz");
        System.out.println("");
    }
    while(tahmin!=rastgelesayı);
        System.out.println(s+"tahminde buldunuz");}}
      
                
        // TODO code application logic here
    
    

