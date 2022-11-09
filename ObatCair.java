
/**
 * Merepresentasikan Obat Cair yang merupakan bagian dari Obat-obatan
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class ObatCair extends Obat
{

    /**
     * Constructor untuk membuat obat cair baru dengan parameter
     */
    public ObatCair(String nama, int harga)
    {
        super(nama, harga); // dari superclass obat
    }

    /**
     * Method ini berfungsi untuk menampilkan cara pemakaian dari class obat cair
     */
    public void caraPakai(){
        System.out.println("Obat digunakan dengan cara diminum dan dikocok terlebih dahulu");
    }
    
    /**
     * Method ini berfungsi untuk mencetak deskripsi dari obat cair
     */
    public void cetakDeskripsi(String desc){
        super.setDeskripsi(desc);
        System.out.println(super.getDeskripsi());
    }
}
