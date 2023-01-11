package hafta01;

public class G04_DegiskenOrnekCalismalari {
    public static void main(String[] args) {

        // değişken örnek çalışması

        char c1 = 's';
        char c2= '*';

        //  char c3= "g"; char'da " " tırnak işareti olmaz
        // sadece tek karakterlik deger kabul eder
        // char c4 = 'b4';  char birden fazla karakter barindiramaz

        System.out.println("char değerleri : "+c1+" "+c2); //char değerleri : s *

        int personelNo= 111;

        System.out.println(personelNo); // 111

        System.out.println("Perosnel No : " + personelNo); // Perosnel No : 111

        int x= 45;

        x= x + 17;

        System.out.println("x = "+x); // x = 62

        double matematikNotu= 95.5;

        System.out.println("matematik notu : "+matematikNotu); // matematik notu : 95.5
    }
}
