package soal2;

/**
 * Superclass untuk mendemonstrasikan bahaya pemanggilan method overridable
 * di dalam constructor pada Soal 2 Bagian B.
 */
public class A {

    /**
     * Constructor kelas A yang memanggil method {@code init()}.
     */
    public A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Method inisialisasi awal pada kelas A.
     */
    public void init() {
        System.out.println("init A");
    }
}