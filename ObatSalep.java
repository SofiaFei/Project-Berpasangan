
/**
 * Merepresentasikan Obat Salep yang merupakan bagian dari Obat-obatan
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class ObatSalep extends Obat
{

    /**
     * Constructor untuk membuat obat salep baru dengan parameter
     */
    public ObatSalep(String nama, int harga)
    {
        super(nama, harga); // dari superclass obat
    }

    /**
     * Method ini berfungsi untuk menampilkan cara pemakaian dari class obat salep
     */
    public void caraPakai(){
        System.out.println("Obat digunakan dengan cara dioleskan ke permukaan kulit secara merata");
    }
    
    /**
     * Method ini berfungsi untuk mencetak deskripsi dari obat salep
     */
    public void cetakDeskripsi(String desc){
        super.setDeskripsi(desc);
        System.out.println(super.getDeskripsi());
    }
}
