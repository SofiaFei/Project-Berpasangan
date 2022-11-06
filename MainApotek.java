import java.util.Scanner;

/**
 * Class Main untuk algoritma jalannya Apotek Sehat Online
 *
 * @author Sofia, Putri Ulfayani
 * @version 5.11.2022
 * @since 3.11.2022
 */
public class MainApotek
{

    /**
     * Constructor tanpa parameter
     */
    public MainApotek()
    {
        
    }
    
    /**
     * Tempat logika Apotek Sehat Online dimasukkan
     */
    public static void apotek(){
        Scanner scan = new Scanner(System.in);
        String nama, noKtp;

        System.out.println("----------------------------------Selamat datang di Apotek Sehat Online---------------------------------");
        System.out.println("Disini anda dapat memesan secara online obat yang ingin dibeli pada Apotek Sehat");
        System.out.println("Checkout obat yang ingin dibeli kemudian cetak invoice untuk dibawa ke cabang Apotek Sehat terdekat");
        System.out.println("Anda dapat melakukan pembayaran secara offline dengan memperlihatkan invoice");
        System.out.println("Dengan Apotek Sehat Online, anda tidak perlu menunggu antrian pada saat membeli obat");

      //  Pelanggan user = new Pelanggan();
       // System.out.println("Masukkan data diri anda terlebih dahulu untuk melakukan pemesanan");
       // System.out.print("Nama: ");
        //nama = scan.next();
        //Pemain.setNama(nama);
        //System.out.print("No KTP: ");
        //noKtp = scan.next();
        //Pemain.setKtp(noKtp);

    }
    
    /**
     * Method Main
     *
     * @param a command line argument
     */
    public static void main(String[] args){
        System.out.println("*************************************************Pilihan Obat Tablet******************************************************");
        System.out.println("Paracetamol");
        Obat Paracetamol = new ObatTablet("Paracetamol", 7500);
        Paracetamol.setDeskripsi("Kandungan: \nParacetamol 500 mg\nKegunaan: \nUntuk meredakan demam dan nyeri, mengendalikan kadar gula darah dan menjaga fungsi otot."); 
        System.out.println(Paracetamol.getDeskripsi());

        System.out.println("Panadol");
        Obat Panadol = new ObatTablet("Panadol", 12000);
        Panadol.setDeskripsi("Kandungan: \nParacetamol \nKegunaan: \nUntuk meredakan demam dan nyeri."); 
        System.out.println(Panadol.getDeskripsi());

        System.out.println("Bodrex");
        Obat Bodrex = new ObatTablet("Bodrex", 11000);
        Bodrex.setDeskripsi("Kandungan: \nCaffeine 50 mg \nParacetamol 600 mg \nKegunaan: \nUntuk meringankan sakit kepala,sakit gigi dan menurunkan demam."); 
        System.out.println(Bodrex.getDeskripsi());

        System.out.println("Domperidone");
        Obat Domperidone = new ObatTablet("Domperidone", 6500);
        Domperidone.setDeskripsi("Kandungan: \nDomperidone 10 mg  \nKegunaan: \nUntuk meredakan mual dan muntah,mempercepat kontraksi usus atau lambung,serta meningkatkan produksi ASI."); 
        System.out.println(Domperidone.getDeskripsi());

        System.out.println("Amlodipine");
        Obat Amlodipine = new ObatTablet("Amlodipine", 26400);
        Amlodipine.setDeskripsi("Kandungan: \nAmlodipine 10 mg \nKegunaan: \nUntuk mengontrol tekanan darah."); 
        System.out.println(Amlodipine.getDeskripsi());

        System.out.println("Promag");
        Obat Promag = new ObatTablet("Promag", 9000);
        Promag.setDeskripsi("Kandungan: \nHydrotalcite 200 mg \nMg(OH)2 150 mg \nSimethicone 50 mg \nKegunaan: \nUntuk meringankan gejala-gejala yang berhubungan dengan asam lambung."); 
        System.out.println(Promag.getDeskripsi());

        System.out.println("Entrostop");
        Obat Entrostop = new ObatTablet("Entrostop", 17800);
        Entrostop.setDeskripsi("Kandungan: \nAttapulgite koloid aktif 650 mg \nPectin 50 mg \nKegunaan: \nUntuk mengatasi diare, menyerap racun, dan memadatkan tinja."); 
        System.out.println(Entrostop.getDeskripsi());

        System.out.println("Lodia");
        Obat Lodia = new ObatTablet("Lodia", 24100);
        Lodia.setDeskripsi("Kandungan: \nLoperamide HCL 2 mg \nKegunaan: \nUntuk diare akut non spesifik dan diare kronik."); 
        System.out.println(Lodia.getDeskripsi());

        System.out.println("Sangobion");
        Obat Sangobion = new ObatTablet("Sangobion", 22600);
        Sangobion.setDeskripsi("Kandungan: \nFe gluconate 250 mg (setara elemental Fe 30 mg)  \nManganese Sulfate 0.2 mg \nCopper Sulfate 0.2 mg \nvit.C 50 mg \nFolic Acid 1 mg \nvit.B12 7.5 mcg \nKegunaan: \nUntuk membantu pembentukan darah."); 
        System.out.println(Sangobion.getDeskripsi());

        System.out.println("Neurobion");
        Obat Neurobion = new ObatTablet("Neurobion", 48000);
        Neurobion.setDeskripsi("Kandungan: \nVitamin B1 100 mg \nVitamin B6 100 \nVitamin B12 5000 mcg \nKegunaan: \nUntuk defisiensi Vitamin B1,B6 dan B12."); 
        System.out.println(Neurobion.getDeskripsi());

        System.out.println("******************************************************Pilihan Obat Cair***************************************************");
        System.out.println("Termorex");
        Obat Termorex = new ObatCair("Termorex",11000);
        Termorex.setDeskripsi("Kandungan: \nTiap sendok takar (5 ml) mengandung : \nParacetamol 120 mg \nPseudoephedrine HCl 7.5 mg \nGliseril guaiakoalat 25 mg \nChlorpheniramine Maleate 0.5 mg \nKegunaan: \nUntuk meringankan gejala flu");
        System.out.println(Termorex.getDeskripsi());
    }
}
