# Tugas 2 Praktikum Pemrograman Berorientasi Objek

* **Nama Lengkap:** Azmi Basri
* **NPM:** [Isi NPM Lengkap Anda]
* **Kelas Praktikum:** A
* **Tautan Repository:** `https://github.com/username/Tugas2_Inherit-polymorph-Npmawalakhir`

---

## Deskripsi Singkat
Project ini merupakan kumpulan penyelesaian studi kasus pemrograman berorientasi objek menggunakan bahasa Java yang berfokus pada penerapan *Inheritance*, *Composition*, dan *Polimorfisme*. Melalui empat modul terpisah, project ini mendemonstrasikan perancangan hierarki kelas yang bersih, pencegahan efek samping *aliasing* melalui *defensive copy*, serta penanganan *exception* sesuai standar industri.

---

## Fitur Utama
* **Soal 1 (Manajemen Perangkat Elektronik):** Pengguna dapat melihat ringkasan spesifikasi berbagai kategori perangkat elektronik (Laptop, Ponsel, Laptop Gaming), memperoleh perpanjangan masa garansi otomatis untuk perangkat gaming, serta menghitung nominal pajak dan harga diskon promo secara akurat.
* **Soal 2 (Simulasi Perilaku Objek & Polimorfisme):** Menampilkan urutan siklus hidup pembentukan objek dari superclass ke subclass, mendemonstrasikan pemanggilan perilaku spesifik hewan, serta mengamankan konversi tipe objek agar program tidak berhenti mendadak.
* **Soal 3 (Geometri Titik dan Garis):** Menghitung panjang ruas garis secara otomatis dari dua titik koordinat Kartesius serta melindungi data koordinat garis dari perubahan tidak sengaja pada objek titik di luar garis.
* **Soal 4 (Kasir Keranjang Toko Digital):** Mengelola keranjang belanja yang menampung produk fisik (dengan kalkulasi ongkos kirim per kilogram), produk digital (dengan potongan diskon unduhan), dan layanan langganan (dengan diskon khusus durasi tahunan), mencetak struk belanja terpadu, merekapitulasi jumlah item per kategori, serta menolak duplikasi kode produk.

---

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan (Kelas / Method) | Alasan Pemilihan Konsep |
| :--- | :--- | :--- |
| **Single & Multi-level Inheritance** | `Perangkat` $\rightarrow$ `Laptop` $\rightarrow$ `LaptopGaming` (`soal1`), `Produk` $\rightarrow$ `ProdukDigital` $\rightarrow$ `Langganan` (`soal4`) | Mewariskan atribut dan perilaku umum ke kelas yang lebih spesifik (relasi *is-a*) guna menghindari duplikasi kode. |
| **Protected Access Modifier** | Atribut `harga` pada `Perangkat` yang diakses di `Laptop.hitungHargaPromo()` (`soal1`) | Memberikan akses langsung kepada subclass untuk melakukan kalkulasi diskon tanpa membuka akses bebas ke kelas luar package. |
| **Constructor Chaining (`super` & `this`)** | Seluruh subclass pada `soal1` & `soal4`, serta overloaded constructor `Garis(x1, y1, x2, y2)` (`soal3`) | Memastikan inisialisasi dan validasi terpusat di satu constructor utama sehingga tidak ada logika inisialisasi yang ditulis berulang. |
| **Composition (*Has-A*)** | Atribut `Titik awal, akhir` pada `Garis` (`soal3`) dan `List<Produk>` pada `Keranjang` (`soal4`) | Merepresentasikan objek yang tersusun dari komponen objek lain tanpa memaksakan pewarisan yang melanggar logika domain. |
| **Defensive Copying** | Constructor, getter, dan setter pada kelas `Garis` (`soal3`) | Mencegah kebocoran referensi (*aliasing*) agar perubahan pada objek `Titik` eksternal tidak merusak state internal `Garis`. |
| **Polimorfisme & Method Overriding** | `infoSingkat()` (`soal1`), `hitungHargaAkhir()` & `deskripsi()` (`soal4`) yang dipanggil di `Keranjang.cetakStruk()` | Memungkinkan objek-objek dari subclass berbeda diperlakukan secara seragam melalui referensi superclass dengan perilaku spesifik yang dieksekusi saat *runtime*. |
| **Safe Downcasting (`instanceof`)** | `TesSoal2.main()` (`soal2`) dan `Keranjang.hitungPerJenis()` (`soal4`) | Memverifikasi tipe dinamis objek di memori sebelum melakukan *downcasting* untuk menghindari `ClassCastException`. |

---

## Struktur Project

```text
Tugas2_Inherit-polymorph-Npmawalakhir/
├── src/
│   ├── soal1/
│   │   ├── Perangkat.java
│   │   ├── Laptop.java
│   │   ├── Ponsel.java
│   │   ├── LaptopGaming.java
│   │   └── TesSoal1.java
│   ├── soal2/
│   │   ├── Hewan.java
│   │   ├── Kucing.java
│   │   ├── A.java
│   │   ├── B.java
│   │   ├── Lingkaran.java
│   │   ├── Titik.java
│   │   └── TesSoal2.java
│   ├── soal3/
│   │   ├── Titik.java
│   │   ├── Garis.java
│   │   └── TesSoal3.java
│   └── soal4/
│       ├── Produk.java
│       ├── ProdukFisik.java
│       ├── ProdukDigital.java
│       ├── Langganan.java
│       ├── ProdukBundel.java
│       ├── Keranjang.java
│       └── TesSoal4.java
├── .gitignore
└── README.md
```

---

## Prasyarat
* **Java Development Kit (JDK):** Versi 17 atau versi LTS yang lebih baru (kompatibel mulai dari JDK 8 ke atas).
* **IDE yang Disarankan:** IntelliJ IDEA (Community / Ultimate Edition) atau Visual Studio Code dengan *Extension Pack for Java*.

---

## Cara Menjalankan Program

### 1. Melalui IntelliJ IDEA
1. Buka aplikasi **IntelliJ IDEA**, pilih **Open**, lalu arahkan ke folder root `Tugas2_Inherit-polymorph-Npmawalakhir`.
2. Klik kanan pada folder `src` di panel Project $\rightarrow$ pilih **Mark Directory as** $\rightarrow$ **Sources Root**.
3. Buka berkas kelas penguji yang ingin dijalankan (`TesSoal1.java`, `TesSoal2.java`, `TesSoal3.java`, atau `TesSoal4.java`).
4. Klik ikon **Run** (segitiga hijau) di samping deklarasi `public static void main(String[] args)` atau tekan `Shift + F10`.

### 2. Melalui Command Line / Terminal
Buka terminal pada folder root `Tugas2_Inherit-polymorph-Npmawalakhir`, kemudian jalankan perintah kompilasi dan eksekusi berikut:

```bash
# Membuat direktori output kompilasi dan mengompilasi seluruh source code
mkdir out
javac -d out src/soal1/*.java src/soal2/*.java src/soal3/*.java src/soal4/*.java

# Menjalankan masing-masing soal
java -cp out soal1.TesSoal1
java -cp out soal2.TesSoal2
java -cp out soal3.TesSoal3
java -cp out soal4.TesSoal4
```

---

## Contoh Output

### Output Soal 1 (`soal1.TesSoal1`)
```text
Asus | garansi 24 bulan | RAM 16 GB | layar 14.0 inci
Samsung | garansi 12 bulan | 128 GB | 3 kamera
MSI | garansi 18 bulan | RAM 32 GB | layar 15.6 inci | GPU RTX 4060
Pajak laptop: Rp800000
Promo laptop 10 persen: Rp7200000
```

### Output Soal 2 (`soal2.TesSoal2`)
```text
=== BAGIAN A ===
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
Objek h2 bukan instance dari Kucing, downcasting dibatalkan.

=== BAGIAN B ===
A dibuat
init B, nilai=0
B dibuat, nilai=5

=== BAGIAN C ===
78.53981633974483
0.0
0.0
```

### Output Soal 3 (`soal3.TesSoal3`)
```text
(0.0, 0.0) - (3.0, 4.0) panjang 5.0
(1.0, 1.0) - (5.0, 5.0)
```

### Output Soal 4 (`soal4.TesSoal4`)
```text
F01 | Keyboard Mekanik | fisik 1.5 kg | Rp515000
D01 | Ebook Java | digital 20.0 MB | Rp90000
L01 | Kelas Online | langganan 12 bulan | Rp1440000
TOTAL: Rp2045000
Fisik: 1, Digital: 1, Langganan: 1
Gagal: Produk dengan kode F01 sudah ada di dalam keranjang.
```
*(Catatan: Silakan tambahkan tangkapan layar/screenshot terminal Anda pada bagian ini sebelum dikumpulkan).*

---

## Jawaban Soal dan Analisis Konsep

### A. Pertanyaan Tambahan Soal 1
**Pertanyaan:** Ubah `harga` menjadi `private` lalu kompilasi. Salin pesan error yang muncul dan jelaskan mengapa error tersebut muncul.

**Jawaban:**
* **Pesan Error Kompilasi:**
  ```text
  src/soal1/Laptop.java:46: error: harga has private access in Perangkat
          double potonganHarga = this.harga * (diskonPersen / PERSEN_MAKSIMUM);
                                     ^
  src/soal1/Laptop.java:47: error: harga has private access in Perangkat
          return this.harga - potonganHarga;
                     ^
  2 errors
  ```
* **Penjelasan:** Error ini muncul karena modifier `private` membatasi visibilitas atribut `harga` sehingga hanya dapat diakses secara langsung di dalam ruang lingkup kelas `Perangkat` saja. Meskipun `Laptop` merupakan subclass dari `Perangkat`, subclass tetap tidak diizinkan mengakses anggota `private` milik superclass-nya secara langsung tanpa melalui method *getter* atau mengubah hak aksesnya menjadi `protected`.

---

### B. Jawaban Pertanyaan Soal 2

**1. Output lengkap program Bagian A (sebelum diperbaiki hingga berhenti karena exception):**
```text
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
Exception in thread "main" java.lang.ClassCastException: class soal2.Hewan cannot be cast to class soal2.Kucing (soal2.Hewan and soal2.Kucing are in unnamed module of loader 'app')
	at soal2.TesSoal2.main(TesSoal2.java:16)
```

**2. Jika komentar pada baris `h.panjat();` dihapus:**
* **Error yang muncul:** `error: cannot find symbol: method panjat() location: variable h of type Hewan`.
* **Tahap kemunculan:** Tahap **Kompilasi (*Compile-time*)**.
* **Alasan:** Compiler Java memeriksa ketersediaan method berdasarkan **tipe statis** (tipe deklarasi variabel) dari `h`, yaitu `Hewan`. Karena kelas `Hewan` tidak memiliki deklarasi method `panjat()`, compiler menolak kode tersebut meskipun secara aktual (di memori) `h` merujuk pada objek `Kucing`.

**3. Baris penyebab `ClassCastException` dan perbaikannya:**
* **Baris penyebab:** `Kucing k2 = (Kucing) h2;`
* **Penyebab:** Variabel `h2` diinstansiasi sebagai `new Hewan("Generik")`, sehingga objek aktual di memori adalah murni `Hewan` (bukan `Kucing`). Memaksa *downcasting* dari objek superclass murni ke subclass melanggar relasi *is-a* saat runtime.
* **Kode Perbaikan dengan `instanceof`:**
  ```java
  Hewan h2 = new Hewan("Generik");
  if (h2 instanceof Kucing) {
      Kucing k2 = (Kucing) h2;
      k2.panjat();
  }
  ```

**4. Eksekusi `suara()` di dalam `h.makan()`:**
* Method `suara()` yang dijalankan adalah milik kelas **`Kucing`** (mencetak `"meong"`).
* **Penjelasan (Tipe Statis vs Tipe Dinamis):** Variabel `h` memiliki **tipe statis** `Hewan` dan **tipe dinamis** (objek aktual saat runtime) `Kucing`. Saat `h.makan()` dipanggil, kode `makan()` di kelas `Hewan` dieksekusi dan memanggil `this.suara()`. Karena Java menggunakan mekanisme *Dynamic Method Dispatch* (atau *Late Binding*) untuk method non-static dan non-private, JVM melihat **tipe dinamis** dari `this` (yaitu `Kucing`), sehingga method `suara()` yang telah di-*override* di kelas `Kucing`-lah yang dijalankan.

**5. Prediksi & Analisis Bagian B (`new B()`):**
* **Output:**
  ```text
  A dibuat
  init B, nilai=0
  B dibuat, nilai=5
  ```
* **Mengapa `nilai` pada baris `"init B"` bernilai `0` (bukan `5`):** Ketika `new B()` dipanggil, memori dialokasikan dan semua variabel instance diinisialisasi ke nilai *default* biner (untuk `int nilai`, nilai default-nya adalah `0`). Sebelum badan constructor `B` dan inisialisasi `int nilai = 5` dijalankan, constructor `B` wajib memanggil `super()` (constructor `A`) terlebih dahulu. Di dalam constructor `A`, dipanggil method `init()`. Karena *dynamic binding*, `init()` yang dieksekusi adalah `init()` milik `B`. Pada detik tersebut, eksekusi belum kembali ke kelas `B`, sehingga baris inisialisasi `nilai = 5` belum dijalankan dan `nilai` masih bernilai `0`.
* **Risiko memanggil method overridable di dalam constructor:** Method di subclass dapat berjalan ketika objek subclass tersebut belum selesai dikonstruksi (*partially constructed object*). Jika method yang di-*override* tersebut mengakses atribut subclass yang belum diinisialisasi (misalnya objek referensi yang masih `null`), program akan mengalami kegagalan fatal seperti `NullPointerException` atau membaca state yang tidak valid.

**6. Analisis Bagian C (`Lingkaran` dan `Titik`):**
* **Mengapa `l3.luas()` menghasilkan `0.0`:** Meskipun tipe variabel (statis) `l3` adalah `Lingkaran`, tipe objek aktualnya (dinamis) adalah `Titik`. Karena `Titik` meng-*override* method `luas()` untuk mengembalikan `0.0`, mekanisme polimorfisme (*dynamic binding*) menjalankan method `luas()` milik `Titik`.
* **Apakah "Titik adalah sebuah Lingkaran" masuk akal sebagai relasi *is-a*?** Secara konseptual di dalam desain perangkat lunak (khususnya *Liskov Substitution Principle* / LSP), relasi ini **tidak tepat**. Dalam geometri analitik, titik tidak memiliki dimensi jari-jari, sedangkan lingkaran didefinisikan oleh jari-jari positif.
* **Konsekuensi pada method yang mengharapkan `Lingkaran` dengan luas > 0:** Hal ini melanggar kontrak superclass (*Liskov Substitution Principle*). Jika sebuah method menerima parameter `Lingkaran` dan membagi suatu nilai dengan `lingkaran.luas()` (dengan asumsi lingkaran nyata selalu memiliki luas $> 0$), maka substitusi objek `Titik` ke dalam method tersebut akan menyebabkan pembagian dengan nol (`Infinity` atau `NaN`) dan merusak logika bisnis aplikasi.

---

### C. Pertanyaan dan Tugas Soal 3

**1. Output baris kedua sebelum perbaikan (tanpa *defensive copy*):**
* **Prediksi & Hasil Sebelum Perbaikan:** `(100.0, 1.0) - (5.0, 5.0)`
* **Alasan:** Terjadi **aliasing**. Constructor `Garis(Titik awal, Titik akhir)` sebelum diperbaiki hanya menyalin alamat referensi memori parameter `t` ke atribut `this.awal` (`this.awal = awal;`). Akibatnya, variabel `t` di `main` dan atribut `g2.awal` menunjuk ke satu objek `Titik` yang sama di *heap memory*. Ketika `t.setX(100)` dipanggil di luar kelas `Garis`, koordinat titik awal di dalam `g2` ikut berubah.

**2. Output setelah perbaikan (*Defensive Copy*):**
* **Hasil Sesudah Perbaikan:** `(1.0, 1.0) - (5.0, 5.0)`
* **Penjelasan:** Dengan mengubah constructor menjadi `this.awal = new Titik(awal.getX(), awal.getY());`, `Garis` membuat objek `Titik` baru yang independen di memori. Perubahan pada `t.setX(100)` hanya mengubah objek `t` milik `main`, sementara objek internal milik `g2` tetap aman di `(1.0, 1.0)`.

**3. Kapan perilaku sebelum perbaikan (*Aliasing*) vs sesudah perbaikan (*Defensive Copy*) lebih tepat digunakan:**
* **Sebelum perbaikan (Sharing Reference / Aliasing) lebih tepat ketika:** Kita merancang sistem grafis terhubung (seperti *node graph*, jaring poligon 3D/*mesh*, atau diagram jaringan) di mana beberapa garis memang berbagi satu titik simpul (*vertex*) yang sama, sehingga ketika satu simpul digeser oleh pengguna, seluruh garis yang terhubung ke simpul tersebut otomatis ikut bergerak secara *real-time*.
* **Sesudah perbaikan (Defensive Copy) lebih tepat ketika:** Kita menginginkan enkapsulasi yang kuat dan menjaga *immutability* state internal objek (seperti pencatatan riwayat koordinat, transaksi, atau komponen independen), di mana modifikasi variabel di luar kelas tidak boleh merusak integritas data di dalam objek `Garis` tanpa melalui method resmi kelas `Garis`.

**4. Masalah desain jika `Garis` dibuat dengan `extends Titik`:**
* Ditinjau dari relasi **is-a vs has-a**, membuat `Garis extends Titik` merupakan kesalahan pemodelan fundamental karena **Garis bukanlah sebuah Titik** (*Garis is NOT a Titik*), melainkan **Garis tersusun dari dua Titik** (*Garis HAS-A Titik*).
* Jika dipaksakan menggunakan `extends Titik`, kelas `Garis` akan mewarisi method `getX()`, `getY()`, `setX()`, dan `setY()` secara membingungkan (apakah `garis.setX(10)` mengubah titik awal atau titik akhir?), serta memungkinkan objek `Garis` dimasukkan ke parameter method yang meminta satu `Titik` tunggal seperti `titik.jarakKe(garis)`, yang secara matematis dan semantik menjadi rancu.

---

### D. Bagian Analisis Konsep

**1. Perbedaan Method Overriding dan Method Overloading:**
Method *overriding* terjadi ketika subclass mendefinisikan ulang method yang sudah ada di superclass dengan nama, daftar parameter, dan tipe kembalian yang persis sama untuk memberikan perilaku spesifik, contohnya method `hitungHargaAkhir()` pada `ProdukFisik`, `ProdukDigital`, dan `Langganan` yang meng-*override* method milik `Produk`. Sementara itu, method/constructor *overloading* terjadi di dalam kelas yang sama ketika terdapat lebih dari satu method/constructor dengan nama yang sama namun berbeda jumlah atau tipe parameternya, contohnya dua constructor `Garis(Titik awal, Titik akhir)` dan `Garis(double x1, double y1, double x2, double y2)` pada kelas `Garis`. *Overriding* berkaitan langsung dengan *inheritance* dan menjadi fondasi utama *runtime polymorphism* (*dynamic binding*), sedangkan *overloading* hanya memberikan fleksibilitas pemanggilan di tingkat kompilasi (*compile-time*) tanpa membutuhkan pewarisan.

**2. Kapan Memilih Inheritance dan Kapan Memilih Composition:**
*Inheritance* dipilih ketika terdapat hubungan hierarki taksonomi yang murni berupa **"is-a" (adalah sebuah)** dan subclass benar-benar dapat menggantikan peran superclass di seluruh konteks pemakaiannya, contohnya pada tugas ini adalah `Laptop extends Perangkat` dan `ProdukFisik extends Produk` karena setiap laptop adalah perangkat elektronik dan setiap produk fisik adalah sebuah produk. Sebaliknya, *composition* dipilih ketika suatu kelas memiliki hubungan **"has-a" (memiliki / terdiri atas)** terhadap objek lain sebagai komponen penyusunnya, contohnya `Keranjang` yang memiliki `ArrayList<Produk>` dan `Garis` yang memiliki dua objek `Titik`. Memilih *composition* pada kasus `Keranjang` dan `Garis` menjaga desain tetap modular, fleksibel, dan mencegah pewarisan method yang tidak relevan ke kelas pemakai.

**3. Penggunaan `instanceof` pada `cetakStruk()` vs `hitungPerJenis()` serta Risiko Downcasting:**
Method `cetakStruk()` tidak memerlukan `instanceof` karena seluruh operasi yang dibutuhkannya (`deskripsi()` dan `hitungHargaAkhir()`) sudah dideklarasikan sebagai kontrak umum di superclass `Produk`, sehingga Java cukup menggunakan polimorfisme (*dynamic dispatch*) untuk memanggil implementasi subclass yang tepat secara otomatis. Sebaliknya, `hitungPerJenis()` memerlukan `instanceof` karena method tersebut bertugas mengklasifikasikan dan memisahkan perhitungan berdasarkan tipe konkret masing-masing subclass di dalam satu koleksi `List<Produk>`, di mana urutan pemeriksaan harus dimulai dari subclass terdalam (`Langganan` terlebih dahulu baru `ProdukDigital`). *Downcasting* tidak selalu aman karena compiler hanya percaya pada klaim programmer saat *compile-time*, sehingga jika objek aktual di memori saat *runtime* ternyata bukan instance dari kelas tujuan *cast*, JVM akan langsung menghentikan program dengan melempar `ClassCastException`.

---

## Batasan dan Pengembangan Lanjutan
* **Batasan Saat Ini:** Data produk dan transaksi keranjang belanja masih bersifat *in-memory* (tersimpan di RAM selama program berjalan) serta hanya mendukung antarmuka baris perintah (*Command Line Interface*).
* **Pengembangan Lanjutan:** Menambahkan fitur persistensi data menggunakan basis data relasional (JDBC/SQLite) atau berkas JSON, mengintegrasikan antarmuka grafis (JavaFX/Swing), serta memperluas dukungan kode voucher diskon dinamis pada kelas `Keranjang`.