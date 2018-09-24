package mencarikelilingdanluas;

import java.util.Scanner;

public class Trapesium {

    public static void tampil() {
        Scanner in = new Scanner(System.in);
        double hasil = 0;
        int a, b;
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Mencari : ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Sisi A:");
                a = in.nextInt();
                System.out.print("Sisi B:");
                b = in.nextInt();
                System.out.print("tinggi : ");
                int tinggi = in.nextInt();
                hasil = HitungLuas(a, b, tinggi);
                break;
            case 2:
                System.out.print("Sisi A:");
                a = in.nextInt();
                System.out.print("Sisi B:");
                b = in.nextInt();
                System.out.print("Sisi C:");
                int c = in.nextInt();
                System.out.print("Sisi D:");
                int d = in.nextInt();
                hasil = HitungKeliling(a, b, c, d);
        }
        System.out.println("Hasil : " + hasil);
    }

    private static double HitungLuas(int a, int b, int t) {
        double hasil = (a + b) / 2 * t;
        return hasil;
    }

    private static int HitungKeliling(int a, int b, int c, int d) {
        int hasil = a + b + c + d;
        return hasil;
    }

}
