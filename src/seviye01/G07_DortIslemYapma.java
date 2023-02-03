package seviye01;

import java.util.Scanner;

public class G07_DortIslemYapma {
    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi isteyelim
        // bunlarla dört işlem yapalım

        Scanner sayi = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz ");

        double ondalikliSayi= sayi.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");

        int tamSayi= sayi.nextInt();

        System.out.println("Girilen sayilarin toplami : " + (ondalikliSayi+tamSayi));

        System.out.println("Girilen sayilarin carpimi : "+ (ondalikliSayi*tamSayi));

        System.out.println("Girilen sayilarin farkı : "+ (ondalikliSayi-tamSayi));

        System.out.println("Girilen sayilarin bölümü : "+ (ondalikliSayi/tamSayi));

    }
}
