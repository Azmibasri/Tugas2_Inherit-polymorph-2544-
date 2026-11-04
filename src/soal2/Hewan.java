package soal2;

/**
 * Kelas dasar yang merepresentasikan entitas Hewan pada Soal 2 Bagian A.
 */
public class Hewan {

    protected String nama;

    /**
     * Membuat objek Hewan dan mencetak pesan inisialisasi.
     *
     * @param nama nama hewan
     */
    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Mencetak suara default hewan.
     */
    public void suara() {
        System.out.println("...");
    }

    /**
     * Mencetak aktivitas makan diikuti dengan pemanggilan method suara().
     */
    public void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}