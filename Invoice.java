/**
 * Merepresentasikan Invoice yaitu faktur dari obat-obatan
 * yang dipesan dari Apotek Sehat berbasis Online oleh pelanggan
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class Invoice
{

    /**
     * Constructor untuk membuat Invoice baru tanpa parameter
     */
    public Invoice()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void cetakInvoice(int harga, int jumlah)
    {
        System.out.println("Total harga : Rp"+harga);
        System.out.println("Total barang: " + jumlah);
        
    }
}
