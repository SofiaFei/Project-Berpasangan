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
        System.out.println("Disini anda dapat memesan secara online obat yang ingin dibeli pada Apotek Sehat");
        System.out.println("Checkout obat yang ingin dibeli kemudian cetak invoice untuk dibawa ke cabang Apotek Sehat terdekat");
        System.out.println("Anda dapat melakukan pembayaran secara offline dengan memperlihatkan invoice");
        System.out.println("Dengan Apotek Sehat Online, anda tidak perlu menunggu antrian pada saat membeli obat");
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args){
        System.out.println("Paracetamol");
        Obat Paracetamol = new ObatTablet("Paracetamol", 7500);
        Paracetamol.setDeskripsi("Kandungan: \nParacetamol 500 mg\nKegunaan: \nUntuk meredakan demam dan nyeri, mengendalikan kadar gula darah dan menjaga fungsi otot"); 
        System.out.println(Paracetamol.getDeskripsi());

        System.out.println("Panadol");
        Obat Panadol = new ObatTablet("Panadol", 12000);
        Panadol.setDeskripsi("Kandungan: \nParacetamol \nKegunaan: \nUntuk meredakan demam dan nyeri"); 
        System.out.println(Panadol.getDeskripsi());
    }
}
