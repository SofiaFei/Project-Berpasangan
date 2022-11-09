
/**
 * Merepresentasikan Obat Tablet yang merupakan bagian dari Obat-obatan
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class ObatTablet extends Obat {

    /**
     * Constructor untuk membuat obat tablet baru tanpa parameter
     */
    public ObatTablet() {
    }

    /**
     * Constructor untuk membuat obat tablet baru dengan parameter
     * 
     * @param nama  nama dari obat tablet
     * @param harga harga dari obat tablet
     */
    public ObatTablet(String nama, int harga) {
        super(nama, harga); // dari superclass obat
    }

    /**
     * Method ini berfungsi untuk menampilkan cara pemakaian dari class obat tablet
     */
    public void caraPakai() {
        System.out.println("Nt: Obat digunakan dengan cara ditelan dengan bantuan air");
    }

    /**
     * Method ini berfungsi untuk mencetak deskripsi dari obat tablet
     * 
     * @param desc deskripsi dari obat tablet
     */
    public void cetakDeskripsi(String desc) {
        super.setDeskripsi(desc);
        System.out.println(super.getDeskripsi());
    }
}
