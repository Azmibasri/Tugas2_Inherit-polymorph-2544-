package soal3;

/**
 * Merepresentasikan koordinat titik 2 dimensi (x, y) pada bidang Kartesius.
 */
public class Titik {

    private static final double KOORDINAT_DEFAULT = 0.0;

    private double x;
    private double y;

    /**
     * Membuat objek Titik pada pusat koordinat (0.0, 0.0).
     */
    public Titik() {
        this(KOORDINAT_DEFAULT, KOORDINAT_DEFAULT);
    }

    /**
     * Membuat objek Titik dengan koordinat x dan y tertentu.
     *
     * @param x posisi pada sumbu horizontal
     * @param y posisi pada sumbu vertikal
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengambil nilai koordinat x.
     *
     * @return koordinat x
     */
    public double getX() {
        return x;
    }

    /**
     * Mengubah nilai koordinat x.
     *
     * @param x nilai koordinat x yang baru
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Mengambil nilai koordinat y.
     *
     * @return koordinat y
     */
    public double getY() {
        return y;
    }

    /**
     * Mengubah nilai koordinat y.
     *
     * @param y nilai koordinat y yang baru
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak Euclidean dari titik ini ke titik lain.
     *
     * @param lain objek Titik tujuan, tidak boleh null
     * @return jarak antara kedua titik
     * @throws IllegalArgumentException jika titik tujuan bernilai null
     */
    public double jarakKe(Titik lain) {
        if (lain == null) {
            throw new IllegalArgumentException("Titik tujuan tidak boleh null.");
        }
        double selisihX = this.x - lain.x;
        double selisihY = this.y - lain.y;
        return Math.hypot(selisihX, selisihY);
    }

    /**
     * Mengembalikan representasi string dari titik dengan format "(x, y)".
     *
     * @return string koordinat titik
     */
    @Override
    public String toString() {
        return String.format("(%.1f, %.1f)", x, y);
    }
}