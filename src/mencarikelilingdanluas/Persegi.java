package mencarikelilingdanluas;

import java.util.Scanner;

public class Persegi {
    public static void tampil(){
        Scanner in = new Scanner(System.in);
        int hasil = 0;
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Mencari : ");
        int pilihan = in.nextInt();
        System.out.print("Panjang Sisi :");
        int sisi = in.nextInt();
        switch(pilihan){
            case 1 : hasil = HitungLuas(sisi); break;
            case 2 : hasil = HitungKeliling(sisi);
        }
        System.out.println("Hasil : " + hasil);
        
    }
    private static int HitungLuas(int sisi){
        int hasil = sisi * sisi;
        return hasil;
    }
    private static int HitungKeliling(int sisi){
        int hasil = 4*sisi;
        return hasil;
    }
}
