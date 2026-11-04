package soal4;

import java.util.ArrayList;
import java.util.List;

/**
 * Merepresentasikan keranjang belanja yang menyimpan daftar {@link Produk} (Composition).
 * Mengelola penambahan item, pencetakan struk polimorfik, dan rekapitulasi jenis produk.
 */
public class Keranjang {

    private final List<Produk> daftarProduk;

    /**
     * Membuat objek Keranjang belanja baru yang masih kosong.
     */
    public Keranjang() {
        this.daftarProduk = new ArrayList<>();
    }

    /**
     * Menambahkan produk baru ke dalam keranjang belanja.
     *
     * @param produk objek Produk yang akan ditambahkan, tidak boleh null
     * @throws IllegalArgumentException jika objek produk bernilai null
     * @throws IllegalStateException    jika kode produk sudah terdaftar di dalam keranjang
     */
    public void tambah(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk yang ditambahkan tidak boleh null.");
        }
        if (apakahKodeSudahAda(produk.getKode())) {
            throw new IllegalStateException(
                    "Produk dengan kode " + produk.getKode() + " sudah ada di dalam keranjang.");
        }
        daftarProduk.add(produk);
    }

    private boolean apakahKodeSudahAda(String kodeBaru) {
        for (Produk produk : daftarProduk) {
            if (produk.getKode().equalsIgnoreCase(kodeBaru)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Menghitung total harga akhir seluruh produk di dalam keranjang secara polimorfik
     * tanpa menggunakan operator {@code instanceof}.
     *
     * @return total biaya belanja keseluruhan
     */
    public double hitungTotal() {
        double totalBelanja = 0.0;
        for (Produk produk : daftarProduk) {
            totalBelanja += produk.hitungHargaAkhir();
        }
        return totalBelanja;
    }

    /**
     * Mencetak rincian struk belanja dan nilai total pembayaran ke layar.
     * Mengandalkan dynamic binding (polimorfisme) tanpa menggunakan {@code instanceof}.
     */
    public void cetakStruk() {
        for (Produk produk : daftarProduk) {
            System.out.printf(
                    "%s | %s | %s | Rp%.0f%n",
                    produk.getKode(),
                    produk.getNama(),
                    produk.deskripsi(),
                    produk.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung dan mencetak jumlah masing-masing kategori produk (Fisik, Digital, Langganan)
     * menggunakan {@code instanceof} dan downcasting yang aman.
     * Pengecekan {@link Langganan} diletakkan sebelum {@link ProdukDigital} karena Langganan
     * merupakan subclass dari ProdukDigital.
     */
    public void hitungPerJenis() {
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;

        for (Produk produk : daftarProduk) {
            if (produk instanceof Langganan) {
                Langganan langganan = (Langganan) produk;
                if (langganan.getDurasiBulan() > 0) {
                    jumlahLangganan++;
                }
            } else if (produk instanceof ProdukDigital) {
                ProdukDigital digital = (ProdukDigital) produk;
                if (digital.getUkuranMb() > 0) {
                    jumlahDigital++;
                }
            } else if (produk instanceof ProdukFisik) {
                ProdukFisik fisik = (ProdukFisik) produk;
                if (fisik.getBeratKg() > 0) {
                    jumlahFisik++;
                }
            }
        }

        System.out.printf(
                "Fisik: %d, Digital: %d, Langganan: %d%n",
                jumlahFisik, jumlahDigital, jumlahLangganan);
    }
}