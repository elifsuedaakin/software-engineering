/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */// 88. örnek 
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int a,b=2;
        System.out.print("pozitif tam sayı:");
        a=input.nextInt();
        System.out.println("");
        while (a>1)
      if (a%b==0) 
                System.out.printf("%d\t",b);
        a/=b;
    }
    else b++; }

    

