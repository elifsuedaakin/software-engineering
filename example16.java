/*
 * 77.örnek pi sayısını madhava of sangamagra seri toplamı ıle hesaolayan programı yapıyoruz 
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı");
        int n=input.nextInt();
        int t=0;
        for(int k=0;k<=n;k++){
            t=t+(-1)^k/((2*k+1)*3^k);
        }
        System.out.println((12)^(1/2)*t );
        // TODO code application logic here
    }
    
}
