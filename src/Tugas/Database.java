
package Tugas;

import java.util.ArrayList;

public class Database {

    private ArrayList<Mahasiswa> Data = new ArrayList<>();
    
    public int jumlahMahasiswa(){
        return Data.size();
    }
    public void tambahMahasiswa(int npm, String nama, String alamat){
        Data.add(new Mahasiswa(npm, nama, alamat));
    }
    public void editMahasiswa(int index, int npm, String nama, String alamat){
        Data.set(index, new Mahasiswa (npm, nama, alamat));
    }
    public void editMahasiswa(int index, Mahasiswa baru){
        Data.set(index, baru);
    }
    public void hapusMahasiswa(int index ){
        Data.remove(index);
    }
    public Mahasiswa lihatMahasiswa(int index){
        return Data.get(index);
    }
    public Mahasiswa cariMahasiswa(String nama){
        for(Mahasiswa maha : Data){
            if(maha.getNama().contains(nama)){
                
            }
        }
        return null;
    }
    public int cariIndexMaha(Mahasiswa maha){
        for(int i = 0; i<Data.size();i++){
            if(Data.get(i).equals(maha)){
                return i;
            }
        }
        return -1;
        
    }
}
