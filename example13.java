/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///fibonacci sayıları
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,N,T1,T2,T3;
        System.out.printf("fibonacci serisi \n\n");
        System.out.println("terim sayısı:");
        N=input.nextInt();
        T1=1;T2=2; System.out.println("\n"+T1+"\t"+T2+"\t");
        for(i=1;i<=N-2;i++){ T3=T1+T2; System.out.println(T3+"\t");
        T1=T2;
        T2=T3;
        }}
        }
                
            
        // TODO code application logic here
    
    

