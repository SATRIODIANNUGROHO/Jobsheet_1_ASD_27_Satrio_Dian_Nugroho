import java.util.*;
public class Tugas227 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        while (true) {
            System.out.println("\n====================(MENU)====================");
            System.out.println("\n1. Hitung Kecepatan\n \n2. Hitung Jarak\n \n3. Hitung Waktu\n \n4. Keluar");
            System.out.println("\n==============================================");
            System.out.print("\nMasukkan Opsi Pilihan : ");
            int pilihan1 = inputUser.nextInt();
            if (pilihan1 == 1) {
                System.out.println("\n==============================================");
                System.out.print("\nMasukkan Nilai Jarak\t : ");
                double jarak = inputUser.nextDouble();
                System.out.print("\nMasukkan Nilai Waktu\t : ");
                double waktu = inputUser.nextDouble();
                System.out.println("\n----------------------------------------------");
                System.out.println("\nRumus\t\t : Kecepatan = Jarak / Waktu");
                System.out.println("\nHasil\t\t : " + (rumusKecepatan(jarak, waktu)));
                System.out.println("\n==============================================");
            }else if (pilihan1 == 2) {
                System.out.println("\n==============================================");
                System.out.print("\nMasukkan Nilai Kecepatan\t : ");
                double kecepatan = inputUser.nextDouble();
                System.out.print("\nMasukkan Nilai Waktu\t\t : ");
                double waktu = inputUser.nextDouble();
                System.out.println("\n----------------------------------------------");
                System.out.println("\nRumus\t\t : Jarak = Kecepatan x Waktu");
                System.out.println("\nHasil\t\t : " + (rumusJarak(kecepatan, waktu)));
                System.out.println("\n==============================================");
            }else if (pilihan1 == 3) {
                System.out.println("\n==============================================");
                System.out.print("\nMasukkan Nilai Kecepatan\t : ");
                double kecepatan = inputUser.nextDouble();
                System.out.print("\nMasukkan Nilai Jarak\t\t : ");
                double jarak = inputUser.nextDouble();
                System.out.println("\n----------------------------------------------");
                System.out.println("\nRumus\t\t : Waktu = Jarak / Kecepatan");
                System.out.println("\nHasil\t\t : " + (rumusWaktu(kecepatan, jarak)));
                System.out.println("\n==============================================");
            }else if (pilihan1 == 4) {
                break;
            }else {
                System.out.println("\n==============================================");
                System.out.println("\nOpsi Pilihan Tidak Tersedia");
                System.out.println("\n==============================================");
            }
        }
    }
    private static double rumusKecepatan (double jarak, double waktu) {
        double kecepatan = jarak / waktu;
        return kecepatan;
    } 
    private static double rumusJarak (double kecepatan, double waktu) {
        double jarak = kecepatan * waktu;
        return jarak;
    }
    private static double rumusWaktu (double kecepatan, double jarak) {
        double waktu = jarak / kecepatan;
        return waktu;
    }
}