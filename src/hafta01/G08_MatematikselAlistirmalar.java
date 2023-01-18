package hafta01;

import java.util.Scanner;

public class G08_MatematikselAlistirmalar {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin a ve b kenar uzunluklarını alalım
        // dikdortgenin alanini hesaplattıralım

        Scanner uzunluklar = new Scanner(System.in);

        System.out.println("Lutfen dikdorgenin iki kenar uzunlugunu girin " +
                "\niki kenar uzunlugu arasinda enter'a basin");

        double kenar1= uzunluklar.nextDouble();
        double kenar2= uzunluklar.nextDouble();

        System.out.println("dikdortgenin alani : " + (kenar1*kenar2));

    }
}
