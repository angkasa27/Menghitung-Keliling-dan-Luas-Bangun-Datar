package mencarikelilingdanluas;

import java.util.Scanner;

public class Segitiga {

    public static void Tampil() {
        Scanner in = new Scanner(System.in);
        double hasil;
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Mencari : ");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Panjang Alas   : ");
                int alas = in.nextInt();
                System.out.print("Panjang Tinggi :");
                int tinggi = in.nextInt();
                hasil = MencariLuas(alas, tinggi);
                System.out.println("Hasil : " + hasil);
                break;
            case 2:
                System.out.print("Panjang Sisi a  : ");
                int a = in.nextInt();
                System.out.print("Panjang Sisi b  : ");
                int b = in.nextInt();
                System.out.print("Panjang Sisi c  : ");
                int c = in.nextInt();
                hasil = MencariKeliling(a, b, c);
                System.out.println("Hasil : " + hasil);
                break;

        }
    }

    private static double MencariLuas(int alas, int tinggi) {
        double hasil = (double) (alas * tinggi / 2);
        return hasil;
    }

    private static int MencariKeliling(int a, int b, int c) {
        int hasil = a + b + c;
        return hasil;
    }

}
