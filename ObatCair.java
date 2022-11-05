
/**
 * Write a description of class ObatCair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ObatCair extends Obat
{
    

    /**
     * Constructor for objects of class ObatCair
     */
    public ObatCair(String nama, int harga)
    {
        super(nama, harga);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void caraPakai(){
        System.out.println("Obat digunakan dengan cara diminum. Cocok untuk anak-anak");
    }
    
    public void cetakDeskripsi(String desc){
        super.setDeskripsi(desc);
        System.out.println(super.getDeskripsi());
    }
}
