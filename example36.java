/*
 * tam bölenlerinin sayısına tam bölünen sayılara tau sayısı denir.klavyeden girilen  üst sınıra kadar olan "tau sayıları" nı bulup listeleyen program 
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir üst sınır giriniz");
        int n=input.nextInt();
        for(int i=1;i<=n;i++) {
            int s=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    s=s+1;
                }
            }
        }
    }
    
}
