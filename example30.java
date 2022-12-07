/*klavyeden girilen x ve y değeriiçin mümkün olan tüm leyland sayılarını hesaplayıp yazdıran program 
 * 95. örnek 
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen x değeri giriniz");
        int x=input.nextInt();
        System.out.println("lütfen bir y değeri giriniz");
        int y=input.nextInt();
        for(int i=2;i<=x;i++) {
            for(int j=2;j<=y;j++){
                System.out.println(i^j+j^i);
            }
        }
    }
    
}
