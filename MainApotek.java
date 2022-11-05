import java.util.Scanner;

/**
 * Write a description of class MainApotek here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainApotek
{
    

    /**
     * Constructor for objects of class MainApotek
     */
    public MainApotek()
    {
        
    }
    
    /**
     * Tempat logika apotek online dimasukkan
     */
    public static void apotek(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-------------Selamat datang di Apotek Sehat Online------------");
        System.out.println("Disini anda dapat memesan terlebih dahulu obat apa saja yang ingin dibeli pada Apotek Sehat");
        System.out.println("Setelah anda membuat invoice dari pemesanan pada Apotek Sehat Online, anda dapat membawa invoice tersebut pada cabang Apotek Sehat terdekat");
        System.out.println("Anda tidak perlu lagi menunggu antrian dengan menggunakan Apotek Sehat Online");
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args){
        Obat Paracetamol = new ObatTablet("Paracetamol", 7500);
        Paracetamol.setDeskripsi("Kandungan: \nParacetamol 500 mg\nKegunaan: \nUntuk meredakan demam dan nyeri, mengendalikan kadar gula darah dan menjaga fungsi otot"); 
        System.out.println(Paracetamol.getDeskripsi());
    }
}
