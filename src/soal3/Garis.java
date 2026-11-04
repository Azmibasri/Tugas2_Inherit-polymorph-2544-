package soal3;

/**
 * Merepresentasikan ruas garis lurus yang tersusun dari dua objek {@link Titik} (Composition).
 * Menerapkan defensive copy untuk mencegah efek samping aliasing dari luar kelas.
 */
public class Garis {

    private Titik awal;
    private Titik akhir;

    /**
     * Membuat objek Garis dari dua objek Titik menggunakan teknik defensive copy.
     *
     * @param awal  titik pangkal garis, tidak boleh null
     * @param akhir titik ujung garis, tidak boleh null
     * @throws IllegalArgumentException jika titik awal atau akhir bernilai null
     */
    public Garis(Titik awal, Titik akhir) {
        validasiTitikTidakNull(awal, akhir);
        this.awal = new Titik(awal.getX(), awal.getY());
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Membuat objek Garis langsung dari empat nilai koordinat (Constructor Overloading).
     * Memanggil constructor utama menggunakan {@code this(...)}.
     *
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    private void validasiTitikTidakNull(Titik awal, Titik akhir) {
        if (awal == null || akhir == null) {
            throw new IllegalArgumentException("Titik awal dan titik akhir tidak boleh null.");
        }
    }

    /**
     * Mengambil salinan titik awal garis (defensive copy).
     *
     * @return objek Titik awal
     */
    public Titik getAwal() {
        return new Titik(awal.getX(), awal.getY());
    }

    /**
     * Mengubah titik awal garis dengan menyimpan salinan objeknya (defensive copy).
     *
     * @param awal titik awal baru, tidak boleh null
     * @throws IllegalArgumentException jika parameter bernilai null
     */
    public void setAwal(Titik awal) {
        if (awal == null) {
            throw new IllegalArgumentException("Titik awal tidak boleh null.");
        }
        this.awal = new Titik(awal.getX(), awal.getY());
    }

    /**
     * Mengambil salinan titik akhir garis (defensive copy).
     *
     * @return objek Titik akhir
     */
    public Titik getAkhir() {
        return new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Mengubah titik akhir garis dengan menyimpan salinan objeknya (defensive copy).
     *
     * @param akhir titik akhir baru, tidak boleh null
     * @throws IllegalArgumentException jika parameter bernilai null
     */
    public void setAkhir(Titik akhir) {
        if (akhir == null) {
            throw new IllegalArgumentException("Titik akhir tidak boleh null.");
        }
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Menghitung panjang garis dengan mendelegasikan perhitungan ke {@link Titik#jarakKe(Titik)}.
     *
     * @return panjang garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    /**
     * Mengembalikan representasi string garis dalam format "(x1, y1) - (x2, y2)".
     *
     * @return string informasi titik awal dan titik akhir garis
     */
    @Override
    public String toString() {
        return awal.toString() + " - " + akhir.toString();
    }
}