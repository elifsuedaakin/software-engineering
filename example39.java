/*
 * markov sayılarını 1-50 arası listeleyen program
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for(int x=1;x<=50;x++){
            for(int y=x;y<=50;y++){
                for(int z=y;z<=50;z++){
                    while(x*x+y*y+z*z==3*x*y*z){
                        System.out.println(x+""+y+""+z);
                    }
                }
            }
        }
    }
    
}
