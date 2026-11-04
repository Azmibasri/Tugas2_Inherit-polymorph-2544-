package soal4;

/**
 * Merepresentasikan produk fisik yang membutuhkan pengiriman dan dikenai biaya ongkos kirim per kilogram.
 */
public class ProdukFisik extends Produk {

    private static final double ONGKIR_PER_KG = 10000.0;
    private static final double BERAT_MINIMUM = 0.0;

    private final double beratKg;

    /**
     * Membuat objek ProdukFisik baru.
     *
     * @param kode       kode unik produk
     * @param nama       nama produk fisik
     * @param hargaDasar harga dasar produk
     * @param beratKg    berat produk dalam satuan kilogram, harus lebih dari 0
     * @throws IllegalArgumentException jika data produk tidak valid atau berat <= 0
     */
    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        if (beratKg <= BERAT_MINIMUM) {
            throw new IllegalArgumentException("Berat produk fisik harus lebih dari 0 kg.");
        }
        this.beratKg = beratKg;
    }

    /**
     * Mengambil berat produk dalam kilogram.
     *
     * @return berat produk dalam kg
     */
    public double getBeratKg() {
        return beratKg;
    }

    /**
     * Menghitung harga akhir produk fisik yaitu harga dasar ditambah total ongkos kirim.
     *
     * @return harga akhir produk fisik
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() + (beratKg * ONGKIR_PER_KG);
    }

    /**
     * Mengembalikan keterangan jenis produk fisik beserta beratnya.
     *
     * @return string berformat "fisik X.X kg"
     */
    @Override
    public String deskripsi() {
        return String.format("fisik %.1f kg", beratKg);
    }
}