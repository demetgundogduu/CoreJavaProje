package ders08_nestedIfElse;

public class C10_nestedTernary {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olanib yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        // uygun olani yazdirin

        int sayi = 20;

        System.out.println(   sayi>0
                ? sayi%2==0 ? "Cift sayi" : "Tek sayi"
                : sayi>-1000 && sayi<-99 ? "Uc basamakli" : "3 basamakli degil");


        // sayi>0 ? sayi%2==0 ? "Cift sayi" : "Tek sayi" : sayi>-1000 && sayi<-99 ? "Uc basamakli" : "3 basamakli degil"
    }
}
