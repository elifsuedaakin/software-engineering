/*armstrong sayı 100-999 arası sayıları listeleyen program
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                for(int k=0;k<9;k++){
                    s=100*i+10*j+k;
                    if(s==(i^3)+(j^3)+(k^3)){
                        System.out.println(s);
                    }
                }
            }
        }
    }
    
}
