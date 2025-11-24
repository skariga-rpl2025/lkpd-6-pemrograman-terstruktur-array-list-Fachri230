package Tugas;

public class Mahasiswa {

    private final int npm;
    private final String nama;
    private final String alamat;

    public Mahasiswa(int npm, String nama, String alamat) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getnpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTampil() {
        return "npm: " + npm + ", nama: " + nama + ", alamat: " + alamat;
    }
}
