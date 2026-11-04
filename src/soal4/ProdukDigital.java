package soal4;

/**
 * Merepresentasikan produk digital yang dapat diunduh dan mendapatkan diskon khusus produk digital.
 */
public class ProdukDigital extends Produk {

    private static final double DISKON_DIGITAL = 0.10;
    private static final double UKURAN_MINIMUM = 0.0;

    private final double ukuranMb;

    /**
     * Membuat objek ProdukDigital baru.
     *
     * @param kode       kode unik produk
     * @param nama       nama produk digital
     * @param hargaDasar harga dasar produk
     * @param ukuranMb   ukuran berkas unduhan dalam Megabyte
     * @throws IllegalArgumentException jika atribut tidak valid atau ukuranMb <= 0
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        if (ukuranMb <= UKURAN_MINIMUM) {
            throw new IllegalArgumentException("Ukuran produk digital harus lebih dari 0 MB.");
        }
        this.ukuranMb = ukuranMb;
    }

    /**
     * Mengambil ukuran file produk digital dalam Megabyte.
     *
     * @return ukuran file dalam MB
     */
    public double getUkuranMb() {
        return ukuranMb;
    }

    /**
     * Menghitung harga akhir produk digital setelah dikurangi diskon digital sebesar 10 persen.
     *
     * @return harga akhir produk digital
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() * (1.0 - DISKON_DIGITAL);
    }

    /**
     * Mengembalikan keterangan jenis produk digital beserta ukuran berkasnya.
     *
     * @return string berformat "digital X.X MB"
     */
    @Override
    public String deskripsi() {
        return String.format("digital %.1f MB", ukuranMb);
    }
}