package soal4;

/**
 * Merepresentasikan produk layanan berlangganan yang merupakan spesialisasi dari {@link ProdukDigital}.
 * Memiliki perhitungan harga berbasis durasi bulan dan diskon durasi tahunan.
 */
public class Langganan extends ProdukDigital {

    private static final int BATAS_BULAN_DISKON = 12;
    private static final double DISKON_LANGGANAN_TAHUNAN = 0.20;
    private static final int DURASI_MINIMUM = 1;

    private final int durasiBulan;

    /**
     * Membuat objek Langganan baru.
     *
     * @param kode        kode unik produk langganan
     * @param nama        nama paket langganan
     * @param hargaDasar  biaya langganan per bulan
     * @param ukuranMb    ukuran aplikasi/materi akses dalam MB
     * @param durasiBulan lama waktu berlangganan dalam bulan
     * @throws IllegalArgumentException jika parameter tidak valid atau durasiBulan < 1
     */
    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        if (durasiBulan < DURASI_MINIMUM) {
            throw new IllegalArgumentException("Durasi langganan minimal 1 bulan.");
        }
        this.durasiBulan = durasiBulan;
    }

    /**
     * Mengambil durasi berlangganan dalam bulan.
     *
     * @return durasi bulan
     */
    public int getDurasiBulan() {
        return durasiBulan;
    }

    /**
     * Menghitung harga akhir langganan (hargaDasar * durasiBulan).
     * Memberikan diskon 20 persen jika durasi minimal 12 bulan, tanpa diskon digital.
     *
     * @return harga akhir paket langganan
     */
    @Override
    public double hitungHargaAkhir() {
        double totalHarga = getHargaDasar() * durasiBulan;
        if (durasiBulan >= BATAS_BULAN_DISKON) {
            return totalHarga * (1.0 - DISKON_LANGGANAN_TAHUNAN);
        }
        return totalHarga;
    }

    /**
     * Mengembalikan keterangan jenis langganan beserta durasi bulannya.
     *
     * @return string berformat "langganan X bulan"
     */
    @Override
    public String deskripsi() {
        return String.format("langganan %d bulan", durasiBulan);
    }
}