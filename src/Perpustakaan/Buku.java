package Perpustakaan;


public class Buku {

    private final String judul;
    private final String pengarang;
    
    public Buku(String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
    }
    public String getjudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getTampil(){
        return"Judul: "+ judul +", pengarang: "+ pengarang;
    }
}
