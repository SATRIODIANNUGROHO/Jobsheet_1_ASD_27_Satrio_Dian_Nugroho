import java.util.*;
public class Tugas127 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("\n==============================================");
        System.out.println("\nProgram Mengetahui Kota Berdasarkan Kode\n \nPlat Kendaraan");
        System.out.println("\n==============================================");
        String plat = "";
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' '}
        };
        System.out.println("\n==============================================");
        System.out.print("\nMasukkan Kode Plat Kendaraan Anda : ");
        plat = inputUser.nextLine().toUpperCase();
        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == plat.charAt(0)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("\n----------------------------------------------");
            System.out.println("\nKota\t\t\t\t  : " + new String(KOTA[index]));
            System.out.println("\n==============================================\n");
        } else {
            System.out.println("\n----------------------------------------------");
            System.out.println("\nMohon Maaf Kode Plat Kendaraan Tidak Ditemukan");
            System.out.println("\n==============================================\n");
        }
    }
}