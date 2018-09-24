package mencarikelilingdanluas;

import java.util.Scanner;

public class BelahKetupat {

    public static void tampil() {
        Scanner in = new Scanner(System.in);
        double hasil = 0;
        int alas;
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Mencari : ");
        int pilihan = in.nextInt();
        System.out.print("Diagonal A   :");
        int diagonalA = in.nextInt();
        System.out.print("Diagonal B : ");
        int diagonalB = in.nextInt();
        switch (pilihan) {
            case 1:

                hasil = HitungLuas(diagonalA, diagonalB);
                break;
            case 2:
                System.out.println("Sisi miring : ");
                int miring = in.nextInt();
                hasil = HitungKeliling(miring);
        }
        System.out.println("Hasil : " + hasil);
    }

    private static double HitungLuas(int a, int b) {
        double hasil = (double) (a * b / 2);
        return hasil;
    }

    private static double HitungKeliling(int miring) {
        double hasil = 4 * miring;
        return hasil;
    }
}
