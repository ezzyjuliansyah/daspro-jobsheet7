import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int HARGA_TIKET = 50000; // Harga tetap per tiket
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;

        System.out.println("=== PENJUALAN TIKET BIOSKOP ===");

        while (true) {
            System.out.print("\nMasukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            int jumlahTiket = input.nextInt();

            // Validasi input negatif
            if (jumlahTiket < 0) {
                System.out.println(" Jumlah tiket tidak boleh negatif! Silakan input ulang.");
                continue; // Abaikan dan ulang input
            }

            // Jika 0, artinya tidak ada pelanggan lagi → keluar dari perulangan
            if (jumlahTiket == 0) {
                break;
            }

            double totalHarga = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            // Tentukan diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = totalHarga - (totalHarga * diskon);

            // Tampilkan hasil transaksi pelanggan
            System.out.println("\n--- STRUK PEMBELIAN ---");
            System.out.println("Jumlah tiket   : " + jumlahTiket);
            System.out.println("Harga per tiket: Rp " + HARGA_TIKET);
            System.out.println("Total awal     : Rp " + totalHarga);
            System.out.println("Diskon         : " + (diskon * 100) + "%");
            System.out.println("Total bayar    : Rp " + totalBayar);

            // Akumulasi total penjualan harian
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;
        }

        // Tampilkan hasil akhir penjualan harian
        System.out.println("\n=== LAPORAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan    : Rp " + totalPendapatan);
        System.out.println("=== TERIMA KASIH ===");

        input.close();
    }
}
