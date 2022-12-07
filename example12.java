/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///91 mukemmelsayı
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
    int s,t=0;
        System.out.print("tamsayı:");
        s=input.nextInt();
        for(int i=1;i<s;i++) 
            if(s%i==0)
                t+=i;
        if(s==t) 
            System.out.println("mükemmel sayı");
        else System.out.println("mükemmel sayı değil");
                }
    
}
