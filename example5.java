/*örnek 73 bilgisayarın ürettiği büyüh harfin 10 denemede tahnin edlme oyunu 
 * bilgisayarın A harfinin  ASCII kodu 65 ve Z harfinin ASCII kodu 90 
 * 
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
        System.out.println("terim sayısı");
        double n=input.nextDouble();
        double f,toplam;
        toplam=0;
        for(int i=1;i<=n;i++)
        {  f=1;
        for(int j=1;j<i;j++){
            f=f*j;
        }
          toplam +=(double) i/f;
        }
        System.out.println(toplam);
    
        // TODO code application logic here
    }
    
}
