package Perpustakaan;


public class Main {

    public static void main(String[] args) {

        Perpustakaan p = new Perpustakaan();
        p.tambahBuku("Belajar JAVA", "Umar Bakrie");
        p.tambahBuku("JAVA untuk pemula", "Amir Mahmud");
        p.tambahBuku("JAVA untuk ahli", "Salim Iklim");
        System.out.println("Jumlah buku: " + p.jumlahBuku());
        p.tambahBuku("JAVA untuk mahasiswa", "Farid Akbar");

        //cari buku
        String cari = "pemula";
        System.out.println("Cari buku dengan kata kunci: " + cari);
        Buku buku = p.cariBuku(cari);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan");
        } else {
            System.out.println("Buku ditemukan dengan judul: " + buku.getjudul() + ", pengarang: " + buku.getPengarang() + "");
        }

        //ganti buku
        p.gantiBuku(0, "Belajar JAVA Baru", "Umar Bakrie Salim");
        buku = p.lihatBuku(0);
        System.out.println("Buku diganti dengan judul: " + buku.getjudul() + ", pengarang: " + buku.getPengarang());

        //hapus buku
        p.hapusBuku(0);
        System.out.println("Jumlah buku: " + p.jumlahBuku());
    }
}
