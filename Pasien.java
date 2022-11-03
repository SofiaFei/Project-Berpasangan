
/**
 * Write a description of class Pasien here.
 *
 * @author Sofia
 * @version 3.11.2022
 */
public class Pasien
{
    private String nama;
    private String kode;

    /**
     * Constructor for objects of class Pasien
     */
    public Pasien()
    {
        
    }
    
    /**
     * Constructor for objects of class Pasien
     */
    public Pasien(String nama)
    {
        this.nama = nama;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getNama()
    {
        return this.nama;
    }
    
    /**
     * Method ini berfungsi untuk menetapkan nilai dari koin
     *
     * @param nilaibaru nilai baru dari koin
     */
    public void setNama(String namabaru) {
        this.nama = namabaru;
    }
}
