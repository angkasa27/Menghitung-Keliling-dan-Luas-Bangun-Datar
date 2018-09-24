package mencarikelilingdanluas;

import java.util.Scanner;

public class JajarGenjang {

    public static void tampil() {
        Scanner in = new Scanner(System.in);
        int hasil = 0;
        int alas;
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Mencari : ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("alas   :");
                alas = in.nextInt();
                System.out.print("tinggi : ");
                int tinggi = in.nextInt();
                hasil = HitungLuas(alas, tinggi);
                break;
            case 2:
                System.out.print("alas        :");
                alas = in.nextInt();
                System.out.print("sisi miring : ");
                int sisiMiring = in.nextInt();
                hasil = HitungKeliling(alas, sisiMiring);
        }
        System.out.println("Hasil : " + hasil);
    }

    private static int HitungLuas(int a, int t) {
        int hasil = t * a;
        return hasil;
    }

    private static int HitungKeliling(int a, int sM) {
        int hasil = 2 * (a + sM);
        return hasil;
    }
}
