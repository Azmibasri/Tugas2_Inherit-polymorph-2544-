package soal2;

/**
 * Merepresentasikan bangun datar lingkaran dengan atribut jari-jari.
 */
public class Lingkaran {

    private final double jariJari;

    /**
     * Membuat objek Lingkaran dengan jari-jari tertentu.
     *
     * @param jariJari panjang jari-jari lingkaran
     * @throws IllegalArgumentException jika jari-jari bernilai negatif
     */
    public Lingkaran(double jariJari) {
        if (jariJari < 0.0) {
            throw new IllegalArgumentException("Jari-jari tidak boleh negatif.");
        }
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas permukaan lingkaran.
     *
     * @return luas lingkaran
     */
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return keliling lingkaran
     */
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}