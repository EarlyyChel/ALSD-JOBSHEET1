
import java.util.Scanner;

public class Plat09 {

    private static int index;

    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println("Kota dari plat " + inputKode + " adalah " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode Plat Tidak Ditemukan!");
        }
        scanner.close();
    }
}
