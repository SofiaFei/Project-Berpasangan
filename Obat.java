
/**
 * Abstract class Obat - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Obat
{
    private String nama;
    private int harga;
    private String deskripsi;
    private int kuantitas;
    private int keranjang;
    
    public Obat(){
    }
    
    public Obat(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getHarga(){
        return this.harga;
    }
    
    public int getKuantitas(){
        return this.kuantitas;
    }
    
    public void setKuantitas(){
        this.kuantitas = kuantitas;
    }
    
    public int isiKeranjang(int harga, int kuantitas){
        this.keranjang = harga * kuantitas;
        return this.keranjang;
    }
    
    public abstract void caraPakai();
    
    public String getDeskripsi(){
        return this.deskripsi;
    }
    
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
}
