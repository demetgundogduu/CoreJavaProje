package ders12_Forloops;

public class C04_Faktoriyel {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.

        int sayi = 6;

        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;

        }
        System.out.println(sayi + "! = " + faktoryel);

    }


}

