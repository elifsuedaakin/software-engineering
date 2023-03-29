/*1 den n e kadar olan sayıların karelerı toplamını yazdıran metot
 * n.(n+1).(2n+1)/6
 */
import java.util.Scanner;
/**
 *
 * @author elifs
 */
public class example2 {
    public static void main (String args[]){
  Scanner input=new Scanner(System.in);
        System.out.println("kareler toplamı"+karelerToplamı(9));
}
public static int karelerToplamı(int n){
   int cevap= n*(n+1)*(2*n+1)/6  ;
  return cevap;
}
}
