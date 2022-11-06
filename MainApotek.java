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
        Termorex.setDeskripsi("Kandungan: \nTiap sendok takar (5 ml) mengandung : \nParacetamol 120 mg \nPseudoephedrine HCl 7.5 mg \nGliseril guaiakoalat 25 mg \nChlorpheniramine Maleate 0.5 mg \nKegunaan: \nUntuk meringankan gejala flu.");
        System.out.println(Termorex.getDeskripsi());

        System.out.println("Decolsin");
        Obat Decolsin = new ObatCair("Decolsin",18889);
        Decolsin.setDeskripsi("Kandungan: \nDextromethorphan \nphenylpropanolamine \nParacetamol \nKegunaan: \nUntuk batuk dan flu.");
        System.out.println(Decolsin.getDeskripsi());

        System.out.println("Bisolvon");
        Obat Bisolvon = new ObatCair("Bisolvon",57100);
        Bisolvon.setDeskripsi("Kandungan: \nBromhexine HCL 4 mg \nguaifenesin 100 mg \nKegunaan: \nUntuk meredakan batuk berdahak.");
        System.out.println(Bisolvon.getDeskripsi());

        System.out.println("Anakonidin");
        Obat Anakonidin = new ObatCair("Anakonidin",15200);
        Anakonidin.setDeskripsi("Kandungan: \nParacetamol 120 mg \nSuccus Liquiritae 100 mg \nPseudoephedrine HCL 7.5 mg \nguaifenesin 100 mg \nKegunaan: \nUntuk meredakan batuk dan gejala flu.");
        System.out.println(Anakonidin.getDeskripsi());

        System.out.println("Paratusin");
        Obat Paratusin = new ObatCair("Paratusin",34200);
        Paratusin.setDeskripsi("Kandungan: \nParacetamol 120 mg \nSuccus Liquiritae 100 mg \nPseudoephedrine HCL 7.5 mg \nNoscapine 10 mg \nCholorphenamine maleate 0.5 mg \nKegunaan: \nUntuk meringankan gejala flu.");
        System.out.println(Paratusin.getDeskripsi());

        System.out.println("Dextral");
        Obat Dextral = new ObatCair("Dextral",18400);
        Dextral.setDeskripsi("Kandungan: \nDextromethorpan HBr 10 mg \nGlyceryl Guaiacolate 50 mg \nPhenylpropanolamine HCl 12.5 mg \nChlorpheniramine maleate 1 mg \nKegunaan: \nUntuk mengatasi gejala flu.");
        System.out.println(Dextral.getDeskripsi());

        System.out.println("Silex");
        Obat Silex = new ObatCair("Silex",105300);
        Silex.setDeskripsi("Kandungan: \nEkstrak Thymi Herba Siccum 41.67 mg \nEkstrak Primulae Radix Siccum 10 mg \nEkstrak Althaea Folium Siccum 58.33 mg \nKegunaan: \nUntuk membantu meredakan batuk berdahak, melegakan tenggorokan dan pilek.");
        System.out.println(Silex.getDeskripsi());

        System.out.println("Siladex");
        Obat Siladex = new ObatCair("Siladex",16900);
        Siladex.setDeskripsi("Kandungan: \nChlopheniramine maleate 1 mg \nDextromethorphan Hydrobromide 15 mg \nKegunaan: \nUntuk meredakan batuk tidak berdahak serta alergi.");
        System.out.println(Siladex.getDeskripsi());

        System.out.println("Ambroxol");
        Obat Ambroxol = new ObatCair("Ambroxol",14300);
        Ambroxol.setDeskripsi("Kandungan: \nAmbroxol HCl 15 mg \nKegunaan: \nSebagai sekretolitik pada gangguan saluran nafas akut dan kronis khususnya pada eksaserbasi bronkitis kronis.");
        System.out.println(Ambroxol.getDeskripsi());

        System.out.println("Bufect");
        Obat Bufect = new ObatCair("Bufect",21400);
        Bufect.setDeskripsi("Kandungan: \nIbuprofen 100 mg/ 5ml \nKegunaan: \nUntuk meredakan nyeri.");
        System.out.println(Bufect.getDeskripsi());
    }
}
