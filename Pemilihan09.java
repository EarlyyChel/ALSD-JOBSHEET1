
import java.util.Scanner;

public class Pemilihan09 {

    public static void main(String[] args) {
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=====================");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas: ");
        double Tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double Kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double UTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double UAS = input.nextDouble();

        System.out.println("=====================");
        System.out.println("=====================");

        if (Tugas < 0 || Tugas > 100 || Kuis < 0 || Kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("Nilai Tidak Valid");
        } else {
            String nilaiHuruf;
            boolean lulus;
            double nilaiAkhir = (0.2 * Tugas) + (0.2 * Kuis) + (0.3 * UTS) + (0.4 * UAS);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                lulus = true;
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
                lulus = true;
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
                lulus = true;
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                lulus = true;
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
                lulus = true;
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
                lulus = true;
            } else {
                nilaiHuruf = "E";
                lulus = false;
            }

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("=====================");
            System.out.println("=====================");

            if (lulus) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }

            {

            }
        }
    }
}
