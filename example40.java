/*
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
        int t=0;
        int s=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                t=t+1;
                s=s+1;
            }
        }
        if(t%s==0){
            System.out.println("aritmetik sayıdır");
        }
        else 
        { System.out.println("aritmetik sayı değildir");
            
        }   
    }
    
}
