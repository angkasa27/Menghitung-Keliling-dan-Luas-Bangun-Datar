package mencarikelilingdanluas;

import java.util.Scanner;

public class LayangLayang {

    public static void tampil() {
        Scanner in = new Scanner(System.in);
        double hasil = 0;
        int alas;
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Mencari : ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Diagonal A   :");
                int diagonalA = in.nextInt();
                System.out.print("Diagonal B : ");
                int diagonalB = in.nextInt();
                hasil = HitungLuas(diagonalA, diagonalB);
                break;
            case 2:
                System.out.println("Sisi miring A : ");
                int a = in.nextInt();
                System.out.println("Sisi miring b : ");
                int b = in.nextInt();
                hasil = HitungKeliling(a, b);
        }
        System.out.println("Hasil : " + hasil);
    }

    private static double HitungLuas(int a, int b) {
        double hasil = (double) (a * b / 2);
        return hasil;
    }

    private static double HitungKeliling(int a, int b) {
        double hasil = (a + b) / 2;
        return hasil;
    }
}
