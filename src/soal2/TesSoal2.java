package soal2;

/**
 * Kelas penguji untuk menjalankan skenario Bagian A (dengan perbaikan instanceof),
 * Bagian B, dan Bagian C pada Soal 2.
 */
public class TesSoal2 {

    /**
     * Menjalankan seluruh bagian pengujian Soal 2 secara berurutan.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("=== BAGIAN A ===");
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat(); // Dikomentari sesuai soal karena menghasilkan compile-time error

        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        // Perbaikan Nomor 3: Menggunakan instanceof untuk mencegah ClassCastException
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("Objek h2 bukan instance dari Kucing, downcasting dibatalkan.");
        }

        System.out.println("\n=== BAGIAN B ===");
        new B();

        System.out.println("\n=== BAGIAN C ===");
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();
        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}