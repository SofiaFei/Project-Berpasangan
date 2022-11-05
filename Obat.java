
/**
 * Abstract class Obat - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Obat
{
    // instance variables - replace the example below with your own
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
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void stok()
    {
        
    }
    
    public abstract void caraObat();
    
    public String getDeskripsi(){
        return this.deskripsi;
    }
    
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
}
