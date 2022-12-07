/*103. örnek klavyeden girilen pozitif tamsayının "ore sayısı" olup olmadığını test eden program
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        float a=input.nextInt();
        int s=0;
        float t=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                s=s+1;
                t=t+(1/i);
            }
        }
        float ho=s/t;
        if(ho==(int)ho){
            System.out.println("ore sayısıdır");
        }
        else{
            System.out.println("ore sayısı değildir");
        }
       
    }
    
}
