package Ders_Sinif_Gecme;

import java.util.Scanner;

public class DersSinifGecmeDurumu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matV1, matV2, matF, fzkV1, fzkV2, fzkF, trkV1, trkV2, trkF, kmyV1, kmyV2, kmyF, mzkV1, mzkV2, mzkF;

        System.out.println("Sirasiyla matematik 1. vize, 2.vize ve final notlarinizi giriniz; ");
        matV1 = input.nextInt();
        matV2 = input.nextInt();
        matF = input.nextInt();

        int matHesaplama = (matV1*20/100)+(matV2*20/100)+(matF*60/100);
        System.out.println("Matematik ders notu ortalamaniz: " + matHesaplama);

        System.out.println("Sirasiyla fizik 1. vize, 2.vize ve final notlarinizi giriniz; ");
        fzkV1= input.nextInt();
        fzkV2= input.nextInt();
        fzkF= input.nextInt();

        int fzkHesaplama = (fzkV1*20/100)+(fzkV2*20/100)+(fzkF*60/100);
        System.out.println("Fizik ders notu ortalamaniz: " + fzkHesaplama);

        System.out.println("Sirasiyla Turkce 1. vize, 2.vize ve final notlarinizi giriniz; ");
        trkV1= input.nextInt();
        trkV2= input.nextInt();
        trkF= input.nextInt();

        int trkHesaplama = (trkV1*20/100)+(trkV2*20/100)+(trkF*60/100);
        System.out.println("Turkce ders notu ortalamaniz: " + trkHesaplama);

        System.out.println("Sirasiyla kimya 1. vize, 2.vize ve final notlarinizi giriniz; ");
        kmyV1= input.nextInt();
        kmyV2= input.nextInt();
        kmyF= input.nextInt();

        int kmyHesaplama = (kmyV1*20/100)+(kmyV2*20/100)+(kmyF*60/100);
        System.out.println("Kimya ders notu ortalamaniz: " + kmyHesaplama);

        System.out.println("Sirasiyla muzik 1. vize, 2.vize ve final notlarinizi giriniz; ");
        mzkV1= input.nextInt();
        mzkV2= input.nextInt();
        mzkF= input.nextInt();

        int mzkHesaplama = (matV1*20/100)+(matV2*20/100)+(matF*60/100);
        System.out.println("Fizik ders notu ortalamaniz: " + mzkHesaplama);

        int sinifGecme = (matHesaplama + fzkHesaplama + trkHesaplama + kmyHesaplama + mzkHesaplama);




    }
}
