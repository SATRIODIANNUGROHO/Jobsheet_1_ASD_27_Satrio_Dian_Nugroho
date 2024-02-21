import java.text.NumberFormat;
import java.util.*;
public class Fungsi27 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("\n==============================================");
        System.out.println("\nProgram Menampilkan Pendapatan Tiap Cabang\n \nToko Bunga dan Menampilkan Stok Bunga");
        System.out.println("\n==============================================");
        Loop1 :
        while (true) {
            System.out.println("\n==============================================");
            System.out.println("\n1. Pendapatan Setiap Cabang\n \n2. Jumlah Stok Setiap Bunga Pada Cabang\n \n3. Keluar");
            System.out.println("\n==============================================");
            System.out.print("\nMasukkan Opsi Pilihan : ");
            int pilihan1 = inputUser.nextInt();
            if (pilihan1 == 1) {
                System.out.println("\n==============================================");
                System.out.println("\nRoyal Garden 1 : " + (hitungPendapatan(10, 5, 15, 7)));
                System.out.println("\nRoyal Garden 2 : " + (hitungPendapatan(6, 11, 9, 12)));
                System.out.println("\nRoyal Garden 3 : " + (hitungPendapatan(2, 10, 10, 5)));
                System.out.println("\nRoyal Garden 4 : " + (hitungPendapatan(5, 7, 12, 9)));
                System.out.println("\n==============================================");
            }else if (pilihan1 == 2) {
                System.out.println("\n==============================================");
                System.out.println("\n1. Royal Garden 1\n \n2. Royal Garden 2\n \n3. Royal Garden 3\n \n4. Royal Garden 4");
                System.out.println("\n==============================================");
                System.out.print("\nMasukkan Opsi Pilihan : ");
                int pilihan2 = inputUser.nextInt();
                if (pilihan2 == 1) {
                    royalGarden(1, 10, 5, 15, 7);
                    System.out.println("\n==============================================");
                    System.out.println("\nApakah Anda Ingin Merubah Data?\n \n1. Ya\n \n2. Tidak");
                    System.out.println("\n==============================================");
                    System.out.print("\nMasukkan Opsi Pilihan : ");
                    int pilihan3 = inputUser.nextInt();
                    if (pilihan3 ==  1) {
                        System.out.println("\n==============================================");
                        System.out.println("\nMasukkan Data Yang Baru");
                        System.out.println("\n==============================================");
                        System.out.print("\nAglonema\t : ");
                        int aglonemaInput1 = inputUser.nextInt();
                        System.out.print("\nKeladi\t\t : ");
                        int keladiInput1 = inputUser.nextInt();
                        System.out.print("\nAlocasia\t : ");
                        int alocasiaInput1 = inputUser.nextInt();
                        System.out.print("\nMawar\t\t : ");
                        int mawarInput1 = inputUser.nextInt();
                        royalGarden(1, aglonemaInput1, keladiInput1, alocasiaInput1, mawarInput1);
                        break Loop1;
                    }else {
                        continue;
                    }
                }else if (pilihan2 == 2) {
                    royalGarden(2, 6, 11, 9, 12);
                    System.out.println("\n==============================================");
                    System.out.println("\nApakah Anda Ingin Merubah Data?\n \n1. Ya\n \n2. Tidak");
                    System.out.println("\n==============================================");
                    System.out.print("\nMasukkan Opsi Pilihan : ");
                    int pilihan3 = inputUser.nextInt();
                    if (pilihan3 ==  1) {
                        System.out.println("\n==============================================");
                        System.out.println("\nMasukkan Data Yang Baru");
                        System.out.println("\n==============================================");
                        System.out.print("\nAglonema\t : ");
                        int aglonemaInput2 = inputUser.nextInt();
                        System.out.print("\nKeladi\t\t : ");
                        int keladiInput2 = inputUser.nextInt();
                        System.out.print("\nAlocasia\t : ");
                        int alocasiaInput2 = inputUser.nextInt();
                        System.out.print("\nMawar\t\t : ");
                        int mawarInput2 = inputUser.nextInt();
                        royalGarden(2, aglonemaInput2, keladiInput2, alocasiaInput2, mawarInput2);
                        break Loop1;
                    }else {
                        continue;
                    }
                }else if (pilihan2 == 3) {
                    royalGarden(3, 2, 10, 10, 5);
                    System.out.println("\n==============================================");
                    System.out.println("\nApakah Anda Ingin Merubah Data?\n \n1. Ya\n \n2. Tidak");
                    System.out.println("\n==============================================");
                    System.out.print("\nMasukkan Opsi Pilihan : ");
                    int pilihan3 = inputUser.nextInt();
                    if (pilihan3 ==  1) {
                        System.out.println("\n==============================================");
                        System.out.println("\nMasukkan Data Yang Baru");
                        System.out.println("\n==============================================");
                        System.out.print("\nAglonema\t : ");
                        int aglonemaInput3 = inputUser.nextInt();
                        System.out.print("\nKeladi\t\t : ");
                        int keladiInput3 = inputUser.nextInt();
                        System.out.print("\nAlocasia\t : ");
                        int alocasiaInput3 = inputUser.nextInt();
                        System.out.print("\nMawar\t\t : ");
                        int mawarInput3 = inputUser.nextInt();
                        royalGarden(1, aglonemaInput3, keladiInput3, alocasiaInput3, mawarInput3);
                        break Loop1;
                    }else {
                        continue;
                    }
                }else if (pilihan2 == 4) {
                    royalGarden(4, 5, 7, 12, 9);
                    System.out.println("\n==============================================");
                    System.out.println("\nPerubahan Stok Bunga Dikarenakan Adanya\n \nKematian Pada Beberapa Tanaman");
                    System.out.println("\n==============================================");
                    royalGarden(4, 4, 5, 12, 4);
                    System.out.println("\n==============================================");
                    System.out.println("\nApakah Anda Ingin Merubah Data?\n \n1. Ya\n \n2. Tidak");
                    System.out.println("\n==============================================");
                    System.out.print("\nMasukkan Opsi Pilihan : ");
                    int pilihan3 = inputUser.nextInt();
                    if (pilihan3 ==  1) {
                        System.out.println("\n==============================================");
                        System.out.println("\nMasukkan Data Yang Baru");
                        System.out.println("\n==============================================");
                        System.out.print("\nAglonema\t : ");
                        int aglonemaInput4 = inputUser.nextInt();
                        System.out.print("\nKeladi\t\t : ");
                        int keladiInput4 = inputUser.nextInt();
                        System.out.print("\nAlocasia\t : ");
                        int alocasiaInput4 = inputUser.nextInt();
                        System.out.print("\nMawar\t\t : ");
                        int mawarInput4 = inputUser.nextInt();
                        royalGarden(1, aglonemaInput4, keladiInput4, alocasiaInput4, mawarInput4);
                        break Loop1;
                    }else {
                        continue;
                    }
                }
            }else if (pilihan1 == 3) {
                break;
            }else {
                System.out.println("\n==============================================");
                System.out.println("\nOpsi Pilihan Tidak Tersedia");
                System.out.println("\n==============================================");
            }
        }
    }
    public static void royalGarden (int Angka, int Aglonema, int Keladi, int Alocasia, int Mawar) {
        System.out.println("\n==============================================");
        System.out.println("\n Royal Garden " + (Angka));
        System.out.println("\n==============================================");
        System.out.println("\nAglonema\t : " + (Aglonema)); 
        System.out.println("\n----------------------------------------------");
        System.out.println("\nKeladi\t\t : " + (Keladi)); 
        System.out.println("\n----------------------------------------------");
        System.out.println("\nAlocasia\t : " + (Alocasia)); 
        System.out.println("\n----------------------------------------------");
        System.out.println("\nMawar\t\t : " + (Mawar)); 
        System.out.println("\n----------------------------------------------");
    }
    public static int hitungPendapatan (int Aglonema, int Keladi, int Alocasia, int Mawar) {
        int hasil = (Aglonema * 75000) + (Keladi * 50000) + (Alocasia * 60000) + (Mawar * 10000);
        return hasil;
    }
}