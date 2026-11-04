package soal2;

/**
 * Merepresentasikan Titik sebagai kasus uji pewarisan dari {@link Lingkaran}
 * dengan jari-jari bernilai nol (Soal 2 Bagian C).
 */
public class Titik extends Lingkaran {

    private static final double JARI_JARI_TITIK = 0.0;
    private static final double HASIL_NOL = 0.0;

    /**
     * Membuat objek Titik dengan meneruskan jari-jari 0.0 ke superclass Lingkaran.
     */
    public Titik() {
        super(JARI_JARI_TITIK);
    }

    /**
     * Mengembalikan luas titik yaitu 0.0.
     *
     * @return 0.0
     */
    @Override
    public double luas() {
        return HASIL_NOL;
    }

    /**
     * Mengembalikan keliling titik yaitu 0.0.
     *
     * @return 0.0
     */
    @Override
    public double keliling() {
        return HASIL_NOL;
    }
}