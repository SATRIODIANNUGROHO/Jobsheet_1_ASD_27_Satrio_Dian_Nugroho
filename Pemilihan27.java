import java.util.*;
public class Pemilihan27 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int tugas, kuis, UTS, UAS;
        System.out.println("==============================================");
        System.out.println("\nProgram Menghitung Nilai Akhir");
        System.out.println("\n==============================================");
        System.out.print("\nMasukkan Nilai Tugas\t : ");
        tugas = inputUser.nextInt();
        System.out.println("\n----------------------------------------------");
        System.out.print("\nMasukkan Nilai Kuis\t : ");
        kuis = inputUser.nextInt();
        System.out.println("\n----------------------------------------------");
        System.out.print("\nMasukkan Nilai UTS\t : ");
        UTS = inputUser.nextInt();
        System.out.println("\n----------------------------------------------");
        System.out.print("\nMasukkan Nilai UAS\t : ");
        UAS = inputUser.nextInt();
        System.out.println("\n----------------------------------------------");
        if (tugas > 100 || tugas < 0) {
            System.out.println("==============================================");
            System.out.println("\nNilai Tidak Valid");
            System.out.println("\n==============================================");
            System.exit(tugas);
        }else if (kuis > 100 || kuis < 0) {
            System.out.println("==============================================");
            System.out.println("\nNilai Tidak Valid");
            System.out.println("\n==============================================");
            System.exit(kuis);
        }else if (UTS > 100 || UTS < 0) {
            System.out.println("==============================================");
            System.out.println("\nNilai Tidak Valid");
            System.out.println("\n==============================================");
            System.exit(UTS);
        }else if (UAS > 100 || UAS < 0) {
            System.out.println("==============================================");
            System.out.println("\nNilai Tidak Valid");
            System.out.println("\n==============================================");
            System.exit(UAS);
        }
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * UTS) + (0.3 * UAS);
        System.out.println("\nNilai Akhir\t\t : " + (nilaiAkhir));
        System.out.println("\n----------------------------------------------");
        char nilaiHuruf;
        if (nilaiAkhir <= 39) {
            nilaiHuruf = 'E';
            System.out.println("\nNilai Huruf\t\t : " + (nilaiHuruf));
            System.out.println("\n----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("\nMOHON MAAF ANDA DINYATAKAN TIDAK LULUS");
            System.out.println("\n==============================================");
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = 'D';
            System.out.println("\nNilai Huruf\t\t : " + (nilaiHuruf));
            System.out.println("\n----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("\nMOHON MAAF ANDA DINYATAKAN TIDAK LULUS");
            System.out.println("\n==============================================");
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = 'C';
            System.out.println("\nNilai Huruf\t\t : " + (nilaiHuruf));
            System.out.println("\n----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("\nSELAMAT ANDA DINYATAKAN LULUS");
            System.out.println("\n==============================================");
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = 'C';
            System.out.println("\nNilai Huruf\t\t : " + (nilaiHuruf) + "+");
            System.out.println("\n----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("\nSELAMAT ANDA DINYATAKAN LULUS");
            System.out.println("\n==============================================");
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = 'B';
            System.out.println("\nNilai Huruf\t\t : " + (nilaiHuruf));
            System.out.println("\n----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("\nSELAMAT ANDA DINYATAKAN LULUS");
            System.out.println("\n==============================================");
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = 'B';
            System.out.println("\nNilai Huruf\t\t : " + (nilaiHuruf) + "+");
            System.out.println("\n----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("\nSELAMAT ANDA DINYATAKAN LULUS");
            System.out.println("\n==============================================");
        }else {
            nilaiHuruf = 'A';
            System.out.println("\nNilai Huruf\t\t : " + (nilaiHuruf));
            System.out.println("\n----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("\nSELAMAT ANDA DINYATAKAN LULUS");
            System.out.println("\n==============================================");
        }
        inputUser.close();
    }
}