import java.util.*;
public class Perulangan27 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner (System.in);
        System.out.println("==============================================");
        System.out.println("\nProgram Menampilkan Deret Bilangan");
        System.out.println("\n==============================================");
        System.out.print("\nMasukkan NIM Anda\t : 2341760113\n");
        System.out.println("\n----------------------------------------------");
        System.out.println("\nn\t\t\t : 13");
        System.out.println("\n----------------------------------------------\n");
        int n = 13;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 || i == 6 || i == 10) {
                System.out.print(" * ");
            }else {
                System.out.print(i);
            }
        }
        inputUser.close();
    }
}