/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String turkce,matematik,fenbilgisi,sosyal,beden; 
       double ortalama=0;
    Scanner scan =new Scanner(System.in);
        System.out.println("türkce notunu giriniz");
        turkce = scan.nextLine();
        System.out.println("matematik notunu giriniz");
        matematik = scan.nextLine();
        System.out.println("fen notu giriniz");
        fenbilgisi = scan.nextLine();
        System.out.println("sosyal notunu giriniz");
        sosyal = scan.nextLine();
        System.out.println("beden notunu giriniz");
        beden = scan.nextLine();
        ortalama =(turkce+matematik+fenbilgisi+sosyal+beden)/5 ;
        if(ortalama<50){
            System.out.println("sınıfta kaldın");
        }else{
            System.out.println("sınıfı gectın");
        }System.out.println("sınıf ortalamanız"+ortalama);
    } 
     
            
                    
        
                
                
        
    }
    

