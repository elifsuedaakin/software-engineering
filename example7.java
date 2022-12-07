/*
 * emplate in the editor.
 *///74.soru 
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    int N;
    double x,T=1,F=1;
        System.out.println("terim sayısını giriniz");
        N=klavye.nextInt();
        System.out.println("hesaplanacak x değerini giriniz");
        x=klavye.nextDouble();
        for(int i=1;i<N;i++) {
            F*=i;
            T+=Math.pow(x,i)/F;}
        System.out.printf("seri acılımı ile e uzeri x degeri:%.5f\n",T) ;
        System.out.printf("komutla e uzwri x değeri:%.5f\n",Math.exp(x));
    }
        
        
        
        // TODO code application logic here
    }
    

