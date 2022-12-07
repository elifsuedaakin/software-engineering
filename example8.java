/*
 * 
 * 
 *///örnek 75 vallaha kitaptan baktım bune hocam çince gibi 
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in );
   double n,x,sonuc;
        System.out.printf("exp(x)=lim(1+x/n)^n\n\n");
        System.out.println("x:");
        x=input.nextDouble();
        System.out.println("n:");
        n=input.nextDouble();
        sonuc=Math.pow((1+x /n ),n);
        System.out.printf("\nexp(%f\n",x,sonuc);
    }
    
}
