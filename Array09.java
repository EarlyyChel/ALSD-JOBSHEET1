import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Jumlah mata kuliah: ");
        int matkul = sc.nextInt();
        sc.nextLine();

        String MatKul[] = new String[matkul];
        double Nilai[] = new double[matkul];
        String NilaiHuruf[] = new String[matkul];
        double IPNilai[] = new double[matkul];
        int BobotSKS[] = new int[matkul];
        double TotalNilai = 0;
        int SKS = 0;

        for (int i = 0; i < matkul; i++) {
            System.out.print("Nama Mata Kuliah: ");
            MatKul[i] = sc.nextLine();
            System.out.print("Jumlah SKS: ");
            BobotSKS[i] = sc.nextInt();
            System.out.print("Nilai: ");
            Nilai[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println("");
            SKS += BobotSKS[i];
        }

        for (int i = 0; i < matkul; i++) {
            if (Nilai[i] > 80) {
                NilaiHuruf[i] = "A";
                IPNilai[i] = 4.00;
            } else if (Nilai[i] > 73) {
                NilaiHuruf[i] = "B+";
                IPNilai[i] = 3.50;
            } else if (Nilai[i] > 65) {
                NilaiHuruf[i] = "B";
                IPNilai[i] = 3.00;
            } else if (Nilai[i] > 60) {
                NilaiHuruf[i] = "C+";
                IPNilai[i] = 2.50;
            } else if (Nilai[i] > 50) {
                NilaiHuruf[i] = "C";
                IPNilai[i] = 2.00;
            } else if (Nilai[i] > 39) {
                NilaiHuruf[i] = "D";
                IPNilai[i] = 1.00;
            } else {
                NilaiHuruf[i] = "E";
                IPNilai[i] = 0;
            }
        }

        for (int i = 0; i < matkul; i++) {
            TotalNilai += (IPNilai[i] * BobotSKS[i]);
        }

        double IPK = TotalNilai / SKS;

        System.out.println("\n===========================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===========================================================");
        System.out.printf("%-20s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < matkul; i++) {
            System.out.printf("%-20s %-12.2f %-12s %-12.2f\n", MatKul[i], Nilai[i], NilaiHuruf[i], IPNilai[i]);
        }

        System.out.println("===========================================================");
        System.out.printf("IPK: %.2f\n", IPK);
    }
}
