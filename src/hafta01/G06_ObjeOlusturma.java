package hafta01;

import java.util.Scanner;

public class G06_ObjeOlusturma {
    public static void main(String[] args) {

        // Kullanicidan oturduğu ilin ismini alalım ve buyuk harflerle yazdiralım

        // 1.adim :  scan objesi olusturma
        Scanner degisken = new Scanner(System.in); // bu standart bir işlem

        // 2.adim : lütfen ilinizi giriniz
        System.out.println("Lutfen ikametinizi olduğu ili giriniz");

        // 3.adim : kullanicidan istedigimiz bilginin turune uygun bir değişken olusturalım
        //          scanner method'larindan uygun olanini kullanarak alinan degeri
        //          bir değişkene atayalim

        String ilIsmi= degisken.next();

        System.out.println(ilIsmi.toUpperCase());
    }
}
