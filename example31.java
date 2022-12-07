/*
 * 96.örnek sayılar teorisinde 4k +1 şeklinde ifade edilen sayılara hilbert sayıları denir klavyeden girilen sayı hilbert mı değil mi test  ediniz
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir pozitif t");
        int s=input.nextInt();
        if((s-1)%4==0) {
            System.out.println("hilbert sayısıdır ");
        } else {
            System.out.println("hilber sayısı değildir");
        }
    }
    
}
