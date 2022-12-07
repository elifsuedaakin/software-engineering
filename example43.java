/*üçgensel sayıları hesaplayan program 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class example43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen terim sayısı giriniz");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            int u=i*(i+1)/2;
            System.out.println(u);
        }}}
     