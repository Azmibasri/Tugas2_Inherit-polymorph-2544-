package soal1;

/**
 * Merepresentasikan perangkat elektronik dasar yang dijual di toko.
 * Kelas ini menjadi superclass bagi seluruh jenis perangkat spesifik
 * dan menangani validasi atribut dasar.
 */
public class Perangkat {

    private static final double TARIF_PAJAK = 0.10;
    private static final double HARGA_MINIMUM = 0.0;
    private static final int GARANSI_MINIMUM = 0;

    private final String merek;
    protected double harga;
    private final int garansiBulan;

    /**
     * Membuat objek Perangkat baru dengan validasi data dasar.
     *
     * @param merek        merek perangkat, tidak boleh null atau kosong
     * @param harga        harga perangkat, tidak boleh negatif
     * @param garansiBulan durasi garansi dalam bulan, tidak boleh negatif
     * @throws IllegalArgumentException jika merek kosong, harga negatif, atau garansi negatif
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        validasiInputDasar(merek, harga, garansiBulan);
        this.merek = merek.trim();
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    private void validasiInputDasar(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek perangkat tidak boleh kosong.");
        }
        if (harga < HARGA_MINIMUM) {
            throw new IllegalArgumentException("Harga perangkat tidak boleh negatif: " + harga);
        }
        if (garansiBulan < GARANSI_MINIMUM) {
            throw new IllegalArgumentException("Garansi bulan tidak boleh negatif: " + garansiBulan);
        }
    }

    /**
     * Mengambil nama merek perangkat.
     *
     * @return merek perangkat
     */
    public String getMerek() {
        return merek;
    }

    /**
     * Mengambil masa garansi perangkat dalam satuan bulan.
     *
     * @return durasi garansi dalam bulan
     */
    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak perangkat sebesar 10 persen dari harga perangkat.
     *
     * @return nominal pajak perangkat
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Mengembalikan informasi ringkas mengenai perangkat dasar.
     *
     * @return string berformat informasi merek dan masa garansi
     */
    public String infoSingkat() {
        return String.format("%s | garansi %d bulan", merek, garansiBulan);
    }
}