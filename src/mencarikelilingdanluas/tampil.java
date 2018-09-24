package mencarikelilingdanluas;

import java.util.Scanner;

public class tampil {

    String bangunDatar = null;

    public static String pemilihanBangunDatar() {
        Scanner inputan = new Scanner(System.in);
        String bangunDatar = null;
        boolean ulang;
        do {
            ulang = false;
            System.out.println("Daftar Bangun Datar :");
            System.out.println("1. Lingkaran");
            System.out.println("2. Segitiga");
            System.out.println("3. Segiempat");
            System.out.print("Pilih Bangun Datar : ");
            int pilihan = inputan.nextInt();
            if (pilihan > 3) {
                System.out.println("Pilihan tidak tersedia");
                ulang = true;
            } else {
                switch (pilihan) {
                    case 1:
                        bangunDatar = "lingkaran";
                        break;
                    case 2:
                        bangunDatar = "segitiga";
                        break;
                    case 3:
                        bangunDatar = "segiempat";
                }
            }
        } while (ulang);
        System.out.println("Selesai pilih");
        return bangunDatar;
    }

    public static String PilihJenis() {
        Scanner inputan = new Scanner(System.in);
        int pilihan;
        String jenis = null;
        
                System.out.println("Daftar Segiempat : ");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Jajar Genjang");
                System.out.println("4. Trapesium");
                System.out.println("5. Layang Layang");
                System.out.println("6. Belah Ketupat");
                pilihan = inputan.nextInt();
                switch (pilihan) {
                    case 1:
                        jenis = "persegi";
                        break;
                    case 2:
                        jenis = "persegiPanjang";
                        break;
                    case 3:
                        jenis = "jajarGenjang";
                        break;
                    case 4:
                        jenis = "trapesium";
                        break;
                    case 5:
                        jenis = "layangLayang";
                        break;
                    case 6:
                        jenis = "belahKetupat";
                }
        return jenis;
    }

}
