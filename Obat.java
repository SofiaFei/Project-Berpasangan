
/**
 * Abstract class Obat - Merepresentasikan Obat-obatan
 * yang tersedia pada Apotek Sehat
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public abstract class Obat {
    private String nama;
    private int harga;
    private String deskripsi;
    private int jumlah = 0;
    private int subTotal;

    /**
     * Constructor tanpa parameter
     */
    public Obat() {
    }

    /**
     * Constructor dengan parameter
     * 
     * @param nama nama dari obat 
     * @param harga harga dari obat 
     */
    public Obat(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    /**
     * Method ini berfungsi untuk mengembalikan nama dari obat
     *
     * @return nama String yang merepresentasikan nama obat
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Method ini berfungsi untuk mengembalikan harga dari obat
     *
     * @return harga int yang merepresentasikan harga obat
     */
    public int getHarga() {
        return this.harga;
    }

    /**
     * Method ini berfungsi untuk menetapkan harga dari obat
     *
     * @param harga harga baru dari obat
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    /**
     * Method ini berfungsi untuk mengembalikan jumlah dari obat
     *
     * @return jumlah int yang merepresentasikan jumlah obat
     */
    public int getJumlah() {
        return this.jumlah;
    }

    /**
     * Method ini berfungsi untuk menetapkan jumlah dari obat
     *
     * @param jumlah jumlah baru dari obat
     */
    public void setJumlah(int jumlah) {
        this.jumlah += jumlah;
    }

    /**
     * Method ini berfungsi untuk menghitung subtotal dari obat yang dipesan
     * 
     * @param harga harga dari obat 
     * @param jumlah jumlah dari obat 
     * @return temp int yang merepresentasikan subtotal dari obat yang dipesan
     */
    public int getSubTotal(int harga, int jumlah) {
        int temp = harga * jumlah;
        setSubTotal(temp);
        return temp;
    }

    /**
     * Method ini berfungsi untuk menetapkan subtotal dari obat
     *
     * @param harga harga dari obat
     */
    public void setSubTotal(int harga) {
        this.subTotal = harga;
    }

    /**
     * Method ini berfungsi untuk menampilkan harga dari obat yang dipesan pada keranjang
     * 
     * @return subTotal int yang merepresentasikan subtotal harga dari obat yang dipesan
     */
    public int isiKeranjangHarga() {
        return this.subTotal;
    }

    /**
     * Method ini berfungsi untuk menampilkan jumlah dari obat yang dipesan pada keranjang
     * 
     * @return getJumlah int yang merepresentasikan jumlah dari obat yang dipesan
     */
    public int isiKeranjangJumlah() {
        return getJumlah();
    }

    /**
     * Method ini berfungsi untuk mengembalikan deskripsi dari obat
     *
     * @return deskripsi String yang merepresentasikan deskripsi obat
     */
    public String getDeskripsi() {
        return this.deskripsi;
    }

    /**
     * Method ini berfungsi untuk menetapkan deskripsi dari obat
     *
     * @param deskripsi deskripsi baru dari obat
     */
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public abstract void caraPakai();
}
