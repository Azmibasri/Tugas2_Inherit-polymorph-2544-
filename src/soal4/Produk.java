package soal4;

/**
 * Kelas dasar yang merepresentasikan item Produk di dalam ekosistem toko digital.
 * Menyimpan identitas kode, nama, dan harga dasar produk.
 */
public class Produk {

    private static final double HARGA_MINIMUM = 0.0;

    private final String kode;
    private final String nama;
    private final double hargaDasar;

    /**
     * Membuat objek Produk baru dengan validasi ketat terhadap atribut dasar.
     *
     * @param kode       kode unik produk, tidak boleh kosong
     * @param nama       nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar produk sebelum ongkir atau diskon, tidak boleh negatif
     * @throws IllegalArgumentException jika kode kosong, nama kosong, atau hargaDasar negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        validasiDataProduk(kode, nama, hargaDasar);
        this.kode = kode.trim();
        this.nama = nama.trim();
        this.hargaDasar = hargaDasar;
    }

    private void validasiDataProduk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong.");
        }
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong.");
        }
        if (hargaDasar < HARGA_MINIMUM) {
            throw new IllegalArgumentException("Harga dasar produk tidak boleh negatif: " + hargaDasar);
        }
    }

    /**
     * Mengambil kode unik produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil harga dasar produk.
     *
     * @return harga dasar produk
     */
    public double getHargaDasar() {
        return hargaDasar;
    }

    /**
     * Menghitung harga akhir produk. Secara default mengembalikan harga dasar.
     *
     * @return harga akhir produk
     */
    public double hitungHargaAkhir() {
        return hargaDasar;
    }

    /**
     * Mengembalikan keterangan spesifikasi jenis produk untuk ditampilkan pada struk.
     *
     * @return deskripsi jenis produk
     */
    public String deskripsi() {
        return "produk umum";
    }
}