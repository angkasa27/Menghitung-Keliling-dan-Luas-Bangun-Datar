package mencarikelilingdanluas;

import java.util.Scanner;

class Lingkaran {

    private static double HitungLuas(double r) {
        double hasil;
        if (r % 7 == 0) {
            hasil = 22 / 7 * r * r;
        } else {
            hasil = 3.14 * r * r;
        }

        return hasil;
    }

    public static void Tampil() {
        Scanner in = new Scanner(System.in);
        System.out.print("Panjang Jari Jari : ");
        int inputan = in.nextInt();
        double r = inputan;
        double hasil = Lingkaran.HitungLuas(r);
        System.out.println("Hasil : " + hasil);
    }

}
