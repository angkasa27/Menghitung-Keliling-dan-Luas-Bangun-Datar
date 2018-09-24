package mencarikelilingdanluas;
import java.util.Scanner;
public class PersegiPanjang {
    public static void tampil(){
        Scanner in = new Scanner(System.in);
        int hasil = 0;
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Mencari : ");
        int pilihan = in.nextInt();
        System.out.print("Panjang :");
        int panjang = in.nextInt();
        System.out.print("Lebar   : ");
        int lebar = in.nextInt();
        switch(pilihan){
            case 1 : hasil = HitungLuas(panjang, lebar); break;
            case 2 : hasil = HitungKeliling(panjang, lebar);
        }
        System.out.println("Hasil : " + hasil);
    }
    private static int HitungLuas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    private static int HitungKeliling(int panjang,int lebar){
        int hasil = 2*(panjang+ lebar);
        return hasil;
    }
    
}
