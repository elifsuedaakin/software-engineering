/*klavyeden  girilen AB doğru parçasının uzunluğunu,altın oran a uygun bölerek AC ve CB uzunluklarını yazdıran program
 *///83.örnek
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("doğru parcasının uzunluğunu giriniz");
        double ab=input.nextDouble();
        double cb,ac;
        cb = 2*ab/(1+5*0.5);
        ac=ab-cb;
        System.out.println(ac+"ac"+cb+"cb");
    }
            
    
}
