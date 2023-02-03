package seviye04;

import java.util.Arrays;

public class G01_Map {
    public static void main(String[] args) {

        /*
                Sarı saçlarına deli gönlümü
                Bağlamışlar, çözülmüyor Mihriban!
                Ayrılıktan zor belleme ölümü
                Görmeyince sezilmiyor Mihriban!
                Yâr deyince kalem elden düşüyor
         */

        // Bu şiirdeki herbir harfi
        // ve o harfi kullanım sayısını
        // S=1, a=3...gibi yazdıralım

        // 1.bölüm (herbir harf/karakteri bir Array karakterine cevirelim

        String siir="Sarı saçlarına deli gönlümü\n"+"Bağlamışlar, çözülmüyor Mihriban!\n"+"Ayrılıktan zor belleme ölümü\n"+"Görmeyince sezilmiyor Mihriban!\n"+"Yâr deyince kalem elden düşüyor";

        String[] siirinHarfleriArr= siir.split("");

        System.out.println(Arrays.toString(siirinHarfleriArr));

        //2.bölüm (key value ikilisi ile bir Map olusturalım (harf sırasına göre))



    }
}
