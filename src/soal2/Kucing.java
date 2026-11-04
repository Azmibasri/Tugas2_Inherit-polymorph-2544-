package soal2;

/**
 * Kelas turunan {@link Hewan} yang merepresentasikan Kucing pada Soal 2 Bagian A.
 */
public class Kucing extends Hewan {

    /**
     * Membuat objek Kucing dan memanggil constructor superclass.
     *
     * @param nama nama kucing
     */
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Mencetak suara spesifik kucing ("meong").
     */
    @Override
    public void suara() {
        System.out.println("meong");
    }

    /**
     * Mencetak perilaku spesifik kucing yaitu memanjat.
     */
    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}