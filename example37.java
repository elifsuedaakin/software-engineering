/* a pozitif bir tamsayı olmak üzere a(s+1) ile elde edilen sayılara "heterometrik sayı denir. heterometrik sayılar ı oluşturan ve bunları listeleyen program 
 * 
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir adet sayı giriniz");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(1);
            System.out.println(i+1);
            System.out.println(i*(i+1));
        }
        // TODO code application logic here
    }
    
}
