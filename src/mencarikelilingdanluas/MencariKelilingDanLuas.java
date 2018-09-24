package mencarikelilingdanluas;
import java.util.Scanner;
public class MencariKelilingDanLuas {

    public static void main(String[] args) {
        String ulang;
        Scanner in = new Scanner(System.in);
        String bangunDatar, jenis, perintah;
        do {
            bangunDatar = tampil.pemilihanBangunDatar();
            
            switch (bangunDatar) {
                case "lingkaran":
                    Lingkaran.Tampil();
                    break;
                case "segitiga":
                    Segitiga.Tampil();
                    break;
                case "segiempat":
                    jenis = tampil.PilihJenis();
                    switch (jenis) {
                        case "persegi":
                            Persegi.tampil();
                            break;
                        case "persegiPanjang":
                            PersegiPanjang.tampil();
                            break;
                        case "jajarGenjang":
                            JajarGenjang.tampil();
                            break;
                        case "trapesium":
                            Trapesium.tampil();
                            break;
                        case "layangLayang":
                            LayangLayang.tampil();
                            break;
                        case "belahKetupat":
                            BelahKetupat.tampil();
                    }

            }
            System.out.print("Ulang dari awal? y/n : ");
            ulang = in.next();

        } while (ulang.equals("y"));
        System.out.println("Selesai");
    }

}
