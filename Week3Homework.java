/*rastgele 1000 elemanlı 4 farklı dizi olusturun,
4 tane algoritma ile sıralama yapın ve performans ölçün 
mini,mici second olarak 
metotla oluşturun 
 * 
 */

package pkg2.week3.homework;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author elifs
 */
public class Week3Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      
        int dizi[]=new int[1000];
        Random r=new Random();
        for(int i=0;i<dizi.length;i++){
            dizi[i]=r.nextInt(10);
            yazdır(dizi);
            bubblesort(dizi);
        }
        
                
            }
    public static void yazdır(int dizi[]){
            for(int i=0;i<dizi.length;i++){
                System.out.println("dizinin"+(i+1)+". elemanı"+dizi[i]);
        }
   
    }
    public static void bubblesort(int dizi[]){
        int tmp;
        for(int i=0;i<dizi.length;i++){
            for(int j=dizi.length-1;j>i;j--){
                if(dizi[j-1]>dizi[j]){
                    tmp=dizi[j-1];
                    dizi[j-1]=dizi[j];
                    dizi[j]=tmp;
                }
            }
        }
        
    }
    
}
