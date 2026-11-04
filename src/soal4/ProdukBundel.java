package soal4;

import java.util.ArrayList;
import java.util.List;

/**
 * Merepresentasikan paket bundel yang menggabungkan beberapa {@link Produk} sekaligus
 * dengan potongan diskon bundel (Tantangan Opsional Soal 4).
 */
public class ProdukBundel extends Produk {

    private static final double DISKON_BUNDEL = 0.15;
    private static final double HARGA_DASAR_AWAL = 0.0;

    private final List<Produk> daftarIsiBundel;

    /**
     * Membuat objek ProdukBundel kosong yang siap diisi beberapa produk.
     *
     * @param kode kode unik bundel
     * @param nama nama paket bundel
     */
    public ProdukBundel(String kode, String nama) {
        super(kode, nama, HARGA_DASAR_AWAL);
        this.daftarIsiBundel = new ArrayList<>();
    }

    /**
     * Menambahkan satu produk ke dalam paket bundel.
     *
     * @param produk objek produk yang akan dimasukkan ke bundel
     * @throws IllegalArgumentException jika produk bernilai null
     */
    public void tambahKeBundel(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk yang dimasukkan ke bundel tidak boleh null.");
        }
        daftarIsiBundel.add(produk);
    }

    /**
     * Menghitung total harga akhir seluruh produk di dalam bundel dikurangi diskon bundel 15 persen.
     *
     * @return harga akhir paket bundel
     */
    @Override
    public double hitungHargaAkhir() {
        double totalHargaIsi = 0.0;
        for (Produk item : daftarIsiBundel) {
            totalHargaIsi += item.hitungHargaAkhir();
        }
        return totalHargaIsi * (1.0 - DISKON_BUNDEL);
    }

    /**
     * Mengembalikan keterangan bundel beserta jumlah item di dalamnya.
     *
     * @return string berformat "bundel X item"
     */
    @Override
    public String deskripsi() {
        return String.format("bundel %d item", daftarIsiBundel.size());
    }
}