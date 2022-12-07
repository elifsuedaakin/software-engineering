/*90. örnek iki asal sayı arasındakı fark 2 ise buna ikiz asallar denir 
 * klavyeden giriln üst sınıra kadar olan  ıkız asallar lıstesını veren program
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("üst sınır");
        int n=input.nextInt();
        int s=0;
        for(int i=3;i<=n;i++){
            int k=0;
                    for(int j=2;j<=i-1;j++){
                        while(i%j==0){
                            k=k+1;}
                        if(k==0){
                            s=s+1;
                            s=i;
                        }
           for(i=1;i<=s-1;i++){
               while((i+1)-(i)==2){
               
                
               }
           }
                            
                        
                            
                    }System.out.println((i)+"(i)"+(i+1)+"(i+1)");
        }
    }
    
    
}
