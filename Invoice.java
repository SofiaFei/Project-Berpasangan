
/**
 * Merepresentasikan Invoice yaitu bill dari obat-obatan
 * yang dipesan dari Layanan Apotek Sehat berbasis Online oleh pelanggan
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class Invoice {

    /**
     * Constructor untuk membuat Invoice baru tanpa parameter
     */
    public Invoice() {
    }

    /**
     * Method ini berfungsi untuk mencetak invoice dari pemesanan obat
     * 
     * @param jumlah jumlah dari obat
     * @param harga  harga dari obat
     */
    public void cetakInvoice(int jumlah, int harga) {
        System.out.println("TOTAL BARANG\t: " + jumlah);
        System.out.println("TOTAL HARGA\t: Rp " + harga);
    }
}
