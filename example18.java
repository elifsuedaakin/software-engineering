/*
 * klavyeden girilen pozitif sayıya göre pi sayısını monte karlo yöntemi ile hesaplayan program 
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı");
        int n=input.nextInt();
        double m=0;
        for(int i=1;i<=n;i++){
            boolen max,x,y;
            x=2*Rastgele(max)/(max-1);
            y=2*Rastgele(max)/(max-1);
            while(x^2+y^2<1){
                m=m+1;
                
            }
        } System.out.println(4*m/n);    
        
     
            
    
}}
