package Tugas;

public class Apk {

    public static void main(String[] args) {

        Database a = new Database();

        a.tambahMahasiswa(12543, "Umar Donna", "Jalan Jambu");
        a.tambahMahasiswa(22234, "Jeki Suka Permen", "Jalan Jalan void");
        a.tambahMahasiswa(53442, "Bambang Sucipto", "Jalan Terrarian");
        System.out.println("Jumlah Mahasiswa: " + a.jumlahMahasiswa());
        a.tambahMahasiswa(66666, "Susi Baka", "Jalan Agartha");

        String Cari = "Sepuh";
        System.out.println("Cari buku dengan sandi: " + Cari);
        Mahasiswa maha = a.cariMahasiswa(Cari);
        if (maha == null) {
            System.out.println("Mahasiswa tidak ditemukan");
        } else {
            System.out.println("Mahasiswa ditemukan dengan npm: " + maha.getnpm() + ", nama: " + maha.getNama() + ", alamat: " + maha.getAlamat());

            a.editMahasiswa(0, 23453, "Bambang Soecipto", "Jalan Nagasaki");
            maha = a.lihatMahasiswa(0);
            System.out.println("Data diganti dengan NPM: " + maha.getnpm() + ", nama: " + maha.getNama() + ", alamat: " + maha.getAlamat());

            a.hapusMahasiswa(0);
            System.out.println("Jumlah mahasiswa: " + a.jumlahMahasiswa());
        }

    }
}
