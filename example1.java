/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
/**
 *
 * @author elifs
 */
public class example1 {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
     int donensonuc=toplama(2,4);
        System.out.println("dönen sonuç toplam"+donensonuc);
    double donensonuc2=carpım(8.9,7.8);
        System.out.println("dönen sonuç çarpım"+donensonuc2);
    double donensonuc3=bolme(6.5,2.9);
        System.out.println("dönen sonuç bolme için"+donensonuc3);
    int donensonuc4=cıkarma(8,9);
        System.out.println("donen sonuc cıkarma için "+donensonuc4);
    int num1=6;
    int num2=5;
    int donensonuc5=cıkarma2(num1,num2);
        System.out.println("donensonuc5"+donensonuc5);
        System.out.println(selam("elif"));
        System.out.println(yas(19));
        bye();
}
public static int toplama( int num1,int num2){
int cevap=num1+num2;

return cevap;
}
public static double carpım(double a,double b){
    double cevap2=a*b;
    return cevap2;
}
public static double bolme(double c,double k){
    double cevap3=c/k;
    return cevap3;
    
}
public static int cıkarma(int num1,int num2){
    int cevap4=num1-num2;
    
    return cevap4;
}
public static int cıkarma2(int sayı1,int sayı2){
    int cevap5=sayı1-sayı2;
    return cevap5;
}
public static String selam(String isim){
    return "merhaba "+isim;
}
public static String yas(int age){
    int sene =2023-age;
    return sene+" senesinde doğdunuz";
    
}
public static void bye(){
    System.out.println("görüşürüz");
}







}
