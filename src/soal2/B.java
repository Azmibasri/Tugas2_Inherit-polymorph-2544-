package soal2;

/**
 * Subclass dari {@link A} untuk menguji urutan eksekusi constructor dan inisialisasi field.
 */
public class B extends A {

    private int nilai = 5;

    /**
     * Constructor kelas B yang memanggil constructor kelas A terlebih dahulu.
     */
    public B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Meng-override proses inisialisasi dan mencetak nilai atribut {@code nilai}.
     */
    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}