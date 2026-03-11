public class Mahasiswa {
    
    // Modifier: private
    private String nama;
    private int umur;

    // Constructor
    public Mahasiswa(String nama, int umur) {
        // keyword this
        this.nama = nama;
        this.umur = umur;
    }

    // Method dengan modifier public
    public void tampilkanData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan constructor
        Mahasiswa mhs1 = new Mahasiswa("Raya Aulia Rohman", 18);

        // Memanggil method
        mhs1.tampilkanData();
    }
}