
/**
 * Write a description of class ObatSalep here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ObatSalep extends Obat
{
    private int x;

    /**
     * Constructor for objects of class ObatSalep
     */
    public ObatSalep(String nama, int harga)
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
        System.out.println("Obat digunakan dengan cara dioleskan ke permukaan kulit");
    }
    
    public void cetakDeskripsi(String desc){
        super.setDeskripsi(desc);
        System.out.println(super.getDeskripsi());
    }
}
