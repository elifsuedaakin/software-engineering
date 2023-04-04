/*herhangi bir pozitif tam sayının pozitif tam bölenlerinin ortalaması ,yine tam sayı ise bunlara aritmeetik sayı denir örn 6 tamsayısı (1+2+3+6)/4=3
 * klavyeden girilen pozitif tam sayının "aritmetik sayı" olup olmadığını kontrol eden program 
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("tam sayı girin");
        int a=input.nextInt();
        int toplam=0;
        int s=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                toplam=toplam+i;
                s=s+1;
            }
        }
        if(toplam%s==0){
            System.out.println("aritmetik sayıdır");
        }
        else 
        { System.out.println("aritmetik sayı değildir");
            
        }   
    }
    
}
