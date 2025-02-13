
import java.util.Scanner;

public class Kubus09 {

    public static double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu;
    }

    public static double hitungJarak(double kecepatan, double waktu) {
        return kecepatan * waktu;
    }

    public static double hitungWaktu(double jarak, double kecepatan) {
        return jarak / kecepatan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== PROGRAM PENGHITUNG FISIKA ===");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jarak (meter): ");
                    double jarak = scanner.nextDouble();
                    System.out.print("Masukkan waktu (detik): ");
                    double waktu = scanner.nextDouble();
                    System.out.println("Kecepatan = " + hitungKecepatan(jarak, waktu) + " m/s");
                    break;

                case 2:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    double kecepatan = scanner.nextDouble();
                    System.out.print("Masukkan waktu (detik): ");
                    waktu = scanner.nextDouble();
                    System.out.println("Jarak = " + hitungJarak(kecepatan, waktu) + " meter");
                    break;

                case 3:
                    System.out.print("Masukkan jarak (meter): ");
                    jarak = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan (m/s): ");
                    kecepatan = scanner.nextDouble();
                    System.out.println("Waktu = " + hitungWaktu(jarak, kecepatan) + " detik");
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
