import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi uzunluğunu al
        System.out.print("Dizi uzunluğunu girin: ");
        int uzunluk = scanner.nextInt();

        // Dizi elemanlarını kullanıcıdan al
        int[] dizi = new int[uzunluk];
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        // Kullanıcıdan bir sayı al
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();

        // Diziyi sırala
        Arrays.sort(dizi);

        int enKucukBuyuk = -1; // Girilen sayıdan büyük en yakın sayı
        int enBuyukKucuk = -1; // Girilen sayıdan küçük en yakın sayı

        for (int i = 0; i < uzunluk; i++) {
            if (dizi[i] < girilenSayi) {
                enBuyukKucuk = dizi[i];
            } else if (dizi[i] > girilenSayi) {
                enKucukBuyuk = dizi[i];
                break;
            }
        }

        // Sonuçları yazdır
        if (enBuyukKucuk != -1) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enBuyukKucuk);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        }

        if (enKucukBuyuk != -1) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enKucukBuyuk);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        }
        scanner.close();
    }

}
