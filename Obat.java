
/**
 * Abstract class Obat - Merepresentasikan Obat-obatan 
 * yang tersedia pada Apotek Sehat Online
 *
 * @author Sofia, Putri Ulfayani
 * @version 5.11.2022
 * @since 3.11.2022
 */
public abstract class Obat
{
    private String nama;
    private int harga;
    private String deskripsi;
    private int jumlah;
    private int keranjang;
    
    /**
     * Constructor tanpa parameter
     */
    public Obat(){
    }
    
    /**
     * Constructor dengan parameter
     */
    public Obat(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    /**
     * Method ini berfungsi untuk mengembalikan nama dari obat
     *
     * @return nama String yang merepresentasikan nama obat
     */
    public String getNama(){
        return this.nama;
    }
    
    /**
     * Method ini berfungsi untuk mengembalikan harga dari obat
     *
     * @return harga int yang merepresentasikan harga obat
     */
    public int getHarga(){
        return this.harga;
    }
    
    /**
     * Method ini berfungsi untuk mengembalikan jumlah dari obat
     *
     * @return jumlah int yang merepresentasikan jumlah obat
     */
    public int getJumlah(){
        return this.jumlah;
    }
    
    /**
     * Method ini berfungsi untuk menetapkan jumlah dari obat
     *
     * @param jumlah jumlah baru dari obat
     */
    public void setJumlah(){
        this.jumlah = jumlah;
    }
    
    public int isiKeranjang(int harga, int jumlah){
        this.keranjang = harga * jumlah;
        return this.keranjang;
    }
    
    public abstract void caraPakai();
    
    /**
     * Method ini berfungsi untuk mengembalikan deskripsi dari obat
     *
     * @return deskripsi String yang merepresentasikan deskripsi obat
     */
    public String getDeskripsi(){
        return this.deskripsi;
    }
    
    /**
     * Method ini berfungsi untuk menetapkan deskripsi dari obat
     *
     * @param deskripsi deskripsi baru dari obat
     */
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
}
