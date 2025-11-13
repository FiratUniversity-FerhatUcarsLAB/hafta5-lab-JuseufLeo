/*
 * Ad Soyad: Yusuf Aslan
 * Ogrenci No: 250541068
 * Tarih: 13.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class Main {

    // Sabitler
    final static double KDV_ORANI = 0.18;        // KDV Oranı (%18)
    final static double KARGO_UCRETI = 29.99;    // Sabit kargo ücreti (TL)

    // METOT 1: Bir ürünün satış toplamını hesaplar (fiyat * adet)
    public static double satisToplamiHesapla(double birimFiyat, int adet) {
        return birimFiyat * adet;
    }

    // METOT 2: Ara toplamı hesaplar (ürün1 + ürün2 + ürün3)
    public static double araToplamHesapla(double urun1Toplam, double urun2Toplam, double urun3Toplam) {
        return urun1Toplam + urun2Toplam + urun3Toplam;
    }

    // METOT 3: İndirim tutarını hesaplar (araToplam * indirimYuzdesi / 100)
    public static double indirimTutariHesapla(double araToplam, double indirimYuzdesi) {
        return araToplam * (indirimYuzdesi / 100);
    }

    // METOT 4: İndirimli toplamı hesaplar (araToplam - indirimTutari)
    public static double indirimliToplamHesapla(double araToplam, double indirimTutari) {
        return araToplam - indirimTutari;
    }

    // METOT 5: KDV tutarını hesaplar (indirimliToplam * KDV_ORANI)
    public static double kdvTutariHesapla(double indirimliToplam, double kdvOrani) {
        return indirimliToplam * kdvOrani;
    }

    // METOT 6: Genel toplamı hesaplar (indirimliToplam + kdvTutari + kargoUcreti)
    public static double genelToplamHesapla(double indirimliToplam, double kdvTutari, double kargoUcreti) {
        return indirimliToplam + kdvTutari + kargoUcreti;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLütfen 3 ürünün bilgilerini giriniz:");

        // ÜRÜN 1 Bilgileri
        System.out.println("\nÜRÜN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat1 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet1 = input.nextInt();

        // ÜRÜN 2 Bilgileri
        System.out.println("\nÜRÜN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat2 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet2 = input.nextInt();

        // ÜRÜN 3 Bilgileri
        System.out.println("\nÜRÜN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat3 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet3 = input.nextInt();

        // İndirim Bilgisi
        System.out.println("\nİndirim Kuponu Yüzdesi (%): ");
        double indirimYuzdesi = input.nextDouble();

        // 1. Ürünlerin satış toplamlarını hesapla
        double urun1Toplam = satisToplamiHesapla(fiyat1, adet1);
        double urun2Toplam = satisToplamiHesapla(fiyat2, adet2);
        double urun3Toplam = satisToplamiHesapla(fiyat3, adet3);

        // 2. Ara toplamı hesapla
        double araToplam = araToplamHesapla(urun1Toplam, urun2Toplam, urun3Toplam);

        // 3. İndirim tutarını hesapla
        double indirimTutari = indirimTutariHesapla(araToplam, indirimYuzdesi);

        // 4. İndirimli toplamı hesapla
        double indirimliToplam = indirimliToplamHesapla(araToplam, indirimTutari);

        // 5. KDV tutarını hesapla
        double kdvTutari = kdvTutariHesapla(indirimliToplam, KDV_ORANI);

        // 6. Genel toplamı hesapla
        double genelToplam = genelToplamHesapla(indirimliToplam, kdvTutari, KARGO_UCRETI);

        // SONUÇLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("           SİPARİŞ ÖZETİ");
        System.out.println("========================================");

        System.out.printf("Ürün 1 Toplam (%.2f TL x %d): %.2f TL\n", fiyat1, adet1, urun1Toplam);
        System.out.printf("Ürün 2 Toplam (%.2f TL x %d): %.2f TL\n", fiyat2, adet2, urun2Toplam);
        System.out.printf("Ürün 3 Toplam (%.2f TL x %d): %.2f TL\n", fiyat3, adet3, urun3Toplam);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", araToplam);

        System.out.printf("\nİndirim Tutarı (%%%.0f)         : -%.2f TL\n", indirimYuzdesi, indirimTutari);
        System.out.printf("İndirimli Toplam             : %.2f TL\n", indirimliToplam);

        System.out.printf("\nKDV Tutarı (%%%.0f)             : +%.2f TL\n", (KDV_ORANI * 100), kdvTutari);
        System.out.printf("Kargo Ücreti                 : +%.2f TL\n", KARGO_UCRETI);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", genelToplam);
        System.out.println("========================================");

        input.close();
    }
}
