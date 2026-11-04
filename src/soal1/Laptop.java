package soal1;

/**
 * Merepresentasikan perangkat bertipe Laptop yang mewarisi sifat dasar {@link Perangkat}.
 * Menyimpan spesifikasi tambahan berupa kapasitas RAM dan ukuran layar.
 */
public class Laptop extends Perangkat {

    private static final double PERSEN_MAKSIMUM = 100.0;
    private static final double PERSEN_MINIMUM = 0.0;

    private final int ramGb;
    private final double ukuranLayarInci;

    /**
     * Membuat objek Laptop baru.
     *
     * @param merek           merek laptop
     * @param harga           harga dasar laptop
     * @param garansiBulan    masa garansi dalam bulan
     * @param ramGb           kapasitas RAM dalam Gigabyte
     * @param ukuranLayarInci ukuran diagonal layar dalam inci
     * @throws IllegalArgumentException jika parameter dasar tidak valid, RAM <= 0, atau layar <= 0
     */
    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        if (ramGb <= 0) {
            throw new IllegalArgumentException("Kapasitas RAM harus lebih dari 0 GB.");
        }
        if (ukuranLayarInci <= 0.0) {
            throw new IllegalArgumentException("Ukuran layar harus lebih dari 0 inci.");
        }
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah dikurangi diskon promo tertentu.
     * Mengakses atribut {@code harga} milik superclass secara langsung melalui hak akses protected.
     *
     * @param diskonPersen persentase diskon antara 0 hingga 100
     * @return harga laptop setelah dipotong diskon
     * @throws IllegalArgumentException jika persentase diskon di luar rentang 0-100
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < PERSEN_MINIMUM || diskonPersen > PERSEN_MAKSIMUM) {
            throw new IllegalArgumentException("Persentase diskon harus berada di antara 0 dan 100.");
        }
        double potonganHarga = this.harga * (diskonPersen / PERSEN_MAKSIMUM);
        return this.harga - potonganHarga;
    }

    /**
     * Mengembalikan informasi singkat laptop beserta kapasitas RAM dan ukuran layar.
     *
     * @return string deskripsi singkat laptop
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + String.format(" | RAM %d GB | layar %.1f inci", ramGb, ukuranLayarInci);
    }
}