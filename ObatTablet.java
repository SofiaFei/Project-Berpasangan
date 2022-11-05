
/**
 * Write a description of class ObatTablet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ObatTablet extends Obat
{

    /**
     * Constructor for objects of class ObatTablet
     */
    public ObatTablet(String nama, int harga)
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
        System.out.println("Obat digunakan dengan cara ditelan bersama dengan air. Cocok untuk orang dewasa");
    }
    
    public void cetakDeskripsi(String desc){
        super.setDeskripsi(desc);
        System.out.println(super.getDeskripsi());
    }
}
