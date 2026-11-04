package soal1;

/**
 * Merepresentasikan perangkat bertipe Ponsel yang mewarisi {@link Perangkat}.
 * Menyimpan spesifikasi kapasitas penyimpanan internal dan jumlah kamera.
 */
public class Ponsel extends Perangkat {

    private final int kapasitasGb;
    private final int jumlahKamera;

    /**
     * Membuat objek Ponsel baru.
     *
     * @param merek        merek ponsel
     * @param harga        harga ponsel
     * @param garansiBulan masa garansi dalam bulan
     * @param kapasitasGb  kapasitas penyimpanan dalam Gigabyte
     * @param jumlahKamera jumlah modul kamera pada ponsel
     * @throws IllegalArgumentException jika atribut tidak valid
     */
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        if (kapasitasGb <= 0) {
            throw new IllegalArgumentException("Kapasitas penyimpanan harus lebih dari 0 GB.");
        }
        if (jumlahKamera < 0) {
            throw new IllegalArgumentException("Jumlah kamera tidak boleh negatif.");
        }
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Mengembalikan informasi singkat ponsel beserta kapasitas memori dan jumlah kamera.
     *
     * @return string deskripsi singkat ponsel
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + String.format(" | %d GB | %d kamera", kapasitasGb, jumlahKamera);
    }
}