package ders08_nestedIfElse;

public class C6_Ternary {
    public static void main(String[] args) {
        // ternary operatoru ya direk sout icerisinde kullanilir
        // veya bir degiskene atama yapilacak sekilde yazilir


        int sayi =19;

        // sayi%2==0 ? "sayi cift" : "sayi tek"; bu sekilde yazilirsa java hata verir


        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

        String sonuc = sayi%2==0 ? "sayi cift" : "sayi tek";


        // eger true oldugundaki sonuc ile false oldugundaki sonuc
        // farkli data turlerinde olursa yazdirilabilir ama atama yapilamaz

        // sayi cift ise "sayi cift" yazdirin
        // degilse sayinin 2 katini yazdirin

        System.out.println(sayi%2==0 ? "sayi cift" : 2*sayi);

        // int sonuc2 = sayi%2==0 ? "sayi cift" : 2*sayi ;

    }
}
