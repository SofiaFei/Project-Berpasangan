
/**
 * Abstract class Obat - Merepresentasikan Obat-obatan 
 * yang tersedia pada Apotek Sehat Online
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public abstract class Obat
{
    private String nama;
    private int harga;
    private String deskripsi;
    private int jumlah = 0;
    private int keranjangharga = 0;
    private int keranjangjumlah = 0;
    private int subTotal;
    
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

    public void setHarga(int harga) {
        this.harga = harga;
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
    public void setJumlah(int jumlah){
        this.jumlah += jumlah;
    }

    /**
     * Method ini berfungsi untuk mengembalikan jumlah dari obat
     *
     * @return jumlah int yang merepresentasikan jumlah obat
     */
    public int getSubTotal(int harga, int jumlah){
        int temp = harga * jumlah;
        setSubTotal(temp);
        return temp;
    }
    
    /**
     * Method ini berfungsi untuk menetapkan jumlah dari obat
     *
     * @param jumlah jumlah baru dari obat
     */
    public void setSubTotal(int harga){
        this.subTotal = harga;
    }
    
    public int isiKeranjangHarga(){
        return this.subTotal;
    }

    public int isiKeranjangjumlah(){
        return getJumlah();
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
