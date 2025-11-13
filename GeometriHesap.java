/*
 * Ad Soyad: Yusuf Aslan
 * Ogrenci No: 250541068
 * Tarih: 13.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class Main{

    public static double calculateSquareArea(double side){
        return side * side;
    }
    public static double calculateSquarePerimeter(double side){
        return 4*side;
    }
    public static double calculateRectangleArea(double kisaK,double uzunK){
        return kisaK*uzunK;
    }
    public static double  calculateRectanglePerimeter(double kisaK,double uzunK){
        return (kisaK+uzunK)*2;
    }
    public static double calculateCircleArea(double yariC){
        return Math.PI*yariC*yariC;
    }
    public static double calculateCircleCircumference(double yariC){
        return 2*Math.PI*yariC;
    }
    public static double calculateTriangleArea(double taban,double yükseklik){
        return taban*yükseklik/2;
    }
    public static double  calculateTrianglePerimeter(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Karenin kenarını giriniz:");
        double kenar=input.nextDouble();
        System.out.println("Dikdörtgenin kısa kenarını giriniz:");
        double kisakenar=input.nextDouble();
        System.out.println("Dikdörtgenin uzun kenarını giriniz:");
        double uzunkenar=input.nextDouble();
        System.out.println("Dairenin yarı çapını giriniz:");
        double yaricap=input.nextDouble();
        System.out.println("Üçgenin tabanını giriniz");
        double taban=input.nextDouble();
        System.out.println("Üçgenin yüksekliğini giriniz:");
        double yükseklik=input.nextDouble();
        System.out.println("a kenarını giriniz:");
        double a= input.nextDouble();
        System.out.println("b kenarını giriniz:");
        double b=input.nextDouble();
        System.out.println("c kenarını giriniz:");
        double c=input.nextDouble();







        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");



        System.out.printf("Kare Alanı: %.2f\n",calculateSquareArea(kenar));
        System.out.printf("Kare Çevresi: %.2f\n",calculateSquarePerimeter(kenar));
        System.out.printf("Dikdörtgenin Alanı: %.2f\n",calculateRectangleArea(kisakenar,uzunkenar));
        System.out.printf("Dikdörtgenin Çevresi: %.2f\n",calculateRectanglePerimeter(kisakenar,uzunkenar));
        System.out.printf("Daire Alanı: %.2f\n",calculateCircleArea(yaricap));
        System.out.printf("Daire Çevresi: %.2f\n",calculateCircleCircumference(yaricap));
        System.out.printf("Üçgen Alanı: %.2f\n",calculateTriangleArea(taban,yükseklik));
        System.out.printf("Üçgen çevresi: %.2f\n",calculateTrianglePerimeter(a,b,c));

        System.out.println("========================================");

        input.close();




    }


}
