package soal1;

/**
 * Merepresentasikan Laptop khusus Gaming yang merupakan turunan dari {@link Laptop}.
 * Mendapatkan tambahan masa garansi otomatis sebesar 6 bulan dan memiliki spesifikasi kartu grafis.
 */
public class LaptopGaming extends Laptop {

    private static final int TAMBAHAN_GARANSI_BULAN = 6;

    private final String kartuGrafis;

    /**
     * Membuat objek LaptopGaming baru dengan tambahan masa garansi 6 bulan secara otomatis.
     *
     * @param merek           merek laptop gaming
     * @param harga           harga laptop gaming
     * @param garansiBulan    garansi dasar sebelum ditambah bonus garansi gaming
     * @param ramGb           kapasitas RAM dalam Gigabyte
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis     nama model GPU/kartu grafis
     * @throws IllegalArgumentException jika parameter tidak valid atau kartu grafis kosong
     */
    public LaptopGaming(
            String merek,
            double harga,
            int garansiBulan,
            int ramGb,
            double ukuranLayarInci,
            String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI_BULAN, ramGb, ukuranLayarInci);
        if (kartuGrafis == null || kartuGrafis.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama kartu grafis tidak boleh kosong.");
        }
        this.kartuGrafis = kartuGrafis.trim();
    }

    /**
     * Mengembalikan informasi singkat laptop gaming lengkap dengan spesifikasi GPU.
     *
     * @return string deskripsi singkat laptop gaming
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + String.format(" | GPU %s", kartuGrafis);
    }
}