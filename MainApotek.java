import java.util.Scanner;

/**
 * Class Main untuk algoritma jalannya Apotek Sehat Online
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class MainApotek {

    /**
     * Constructor tanpa parameter
     */
    public MainApotek() {

    }

    /**
     * Tempat logika Apotek Sehat Online dimasukkan
     */
    public static void apotek() {
        Scanner scan = new Scanner(System.in);
        String nama, noKtp;
        int jenis, tablet, cair, salep, yakin;

        System.out.println(
                "----------------------------------Selamat datang di Apotek Sehat Online---------------------------------");
        System.out.println("- Disini anda dapat memesan secara online obat yang ingin dibeli pada Apotek Sehat");
        System.out.println(
                "- Checkout obat yang ingin dibeli kemudian cetak invoice untuk dibawa ke cabang Apotek Sehat terdekat");
        System.out.println("- Anda dapat melakukan pembayaran secara offline dengan memperlihatkan invoice");
        System.out.println("- Dengan Apotek Sehat Online, anda tidak perlu menunggu antrian pada saat membeli obat");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");

        Pelanggan user = new Pelanggan();
        System.out.println("Masukkan data diri anda terlebih dahulu untuk melakukan pemesanan");
        System.out.print("Nama: ");
        nama = scan.next();
        user.setNama(nama);
        System.out.print("No KTP: ");
        noKtp = scan.next();
        user.setKtp(noKtp);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(
                "------------------------------------------------Menu Obat-----------------------------------------------");
        System.out.println("1. Obat Tablet");
        System.out.println("2. Obat Cair");
        System.out.println("3. Obat Salep");
        System.out.println("Masukkan pilihan jenis obat yang ingin anda pesan: ");
        jenis = scan.nextInt();

        while ((jenis != 1) && (jenis != 2) && (jenis != 3)) { // untuk pelanggan yang salah menginput jenis
            System.out.println("Anda salah menginput jenis obat, silahkan dicoba untuk menginput ulang");
            System.out.println(
                    "--------------------------------------------------------------------------------------------------------");
            System.out.println("Masukkan pilihan jenis obat yang ingin anda pesan: ");
            jenis = scan.nextInt();
        }

        if (jenis == 1) { // obat tablet
            do {
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                System.out.println(
                        "-----------------------------------------------Obat Tablet----------------------------------------------");
                System.out.println("1. Paracetamol");
                System.out.println("2. Panadol");
                System.out.println("3. Bodrex");
                System.out.println("4. Domperidone");
                System.out.println("5. Amlodipine");
                System.out.println("6. Promag");
                System.out.println("7. Entrostop");
                System.out.println("8. Lodia");
                System.out.println("9. Sangobion");
                System.out.println("10. Neurobion");
                // System.out.println("11. Kembali");
                System.out.println("Masukkan pilihan obat tablet yang ingin anda pesan: ");
                tablet = scan.nextInt();

                while ((tablet < 1) && (tablet > 10)) { // untuk pelanggan yang salah menginput jenis
                    System.out.println("Anda salah menginput obat tablet, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Masukkan pilihan obat tablet yang ingin anda pesan: ");
                    tablet = scan.nextInt();
                }

                if (tablet == 1) {
                    System.out.println("Paracetamol");
                    Obat Paracetamol = new ObatTablet("Paracetamol", 7500);
                    Paracetamol.setDeskripsi(
                            "Kandungan: \nParacetamol 500 mg\nKegunaan: \nUntuk meredakan demam dan nyeri, mengendalikan kadar gula darah dan menjaga fungsi otot.");
                    System.out.println(Paracetamol.getDeskripsi());
                    Paracetamol.caraPakai();
                } else if (tablet == 2) {
                    System.out.println("Panadol");
                    Obat Panadol = new ObatTablet("Panadol", 12000);
                    Panadol.setDeskripsi("Kandungan: \nParacetamol \nKegunaan: \nUntuk meredakan demam dan nyeri.");
                    System.out.println(Panadol.getDeskripsi());
                    Panadol.caraPakai();
                } else if (tablet == 3) {
                    System.out.println("Bodrex");
                    Obat Bodrex = new ObatTablet("Bodrex", 11000);
                    Bodrex.setDeskripsi(
                            "Kandungan: \nCaffeine 50 mg \nParacetamol 600 mg \nKegunaan: \nUntuk meringankan sakit kepala,sakit gigi dan menurunkan demam.");
                    System.out.println(Bodrex.getDeskripsi());
                    Bodrex.caraPakai();
                } else if (tablet == 4) {
                    System.out.println("Domperidone");
                    Obat Domperidone = new ObatTablet("Domperidone", 6500);
                    Domperidone.setDeskripsi(
                            "Kandungan: \nDomperidone 10 mg  \nKegunaan: \nUntuk meredakan mual dan muntah,mempercepat kontraksi usus atau lambung,serta meningkatkan produksi ASI.");
                    System.out.println(Domperidone.getDeskripsi());
                    Domperidone.caraPakai();
                } else if (tablet == 5) {
                    System.out.println("Amlodipine");
                    Obat Amlodipine = new ObatTablet("Amlodipine", 26400);
                    Amlodipine.setDeskripsi(
                            "Kandungan: \nAmlodipine 10 mg \nKegunaan: \nUntuk mengontrol tekanan darah.");
                    System.out.println(Amlodipine.getDeskripsi());
                    Amlodipine.caraPakai();
                } else if (tablet == 6) {
                    System.out.println("Promag");
                    Obat Promag = new ObatTablet("Promag", 9000);
                    Promag.setDeskripsi(
                            "Kandungan: \nHydrotalcite 200 mg \nMg(OH)2 150 mg \nSimethicone 50 mg \nKegunaan: \nUntuk meringankan gejala-gejala yang berhubungan dengan asam lambung.");
                    System.out.println(Promag.getDeskripsi());
                    Promag.caraPakai();
                } else if (tablet == 7) {
                    System.out.println("Entrostop");
                    Obat Entrostop = new ObatTablet("Entrostop", 17800);
                    Entrostop.setDeskripsi(
                            "Kandungan: \nAttapulgite koloid aktif 650 mg \nPectin 50 mg \nKegunaan: \nUntuk mengatasi diare, menyerap racun, dan memadatkan tinja.");
                    System.out.println(Entrostop.getDeskripsi());
                    Entrostop.caraPakai();
                } else if (tablet == 8) {
                    System.out.println("Lodia");
                    Obat Lodia = new ObatTablet("Lodia", 24100);
                    Lodia.setDeskripsi(
                            "Kandungan: \nLoperamide HCL 2 mg \nKegunaan: \nUntuk diare akut non spesifik dan diare kronik.");
                    System.out.println(Lodia.getDeskripsi());
                    Lodia.caraPakai();
                } else if (tablet == 9) {
                    System.out.println("Sangobion");
                    Obat Sangobion = new ObatTablet("Sangobion", 22600);
                    Sangobion.setDeskripsi(
                            "Kandungan: \nFe gluconate 250 mg (setara elemental Fe 30 mg)  \nManganese Sulfate 0.2 mg \nCopper Sulfate 0.2 mg \nvit.C 50 mg \nFolic Acid 1 mg \nvit.B12 7.5 mcg \nKegunaan: \nUntuk membantu pembentukan darah.");
                    System.out.println(Sangobion.getDeskripsi());
                    Sangobion.caraPakai();
                } else if (tablet == 10) {
                    System.out.println("Neurobion");
                    Obat Neurobion = new ObatTablet("Neurobion", 48000);
                    Neurobion.setDeskripsi(
                            "Kandungan: \nVitamin B1 100 mg \nVitamin B6 100 \nVitamin B12 5000 mcg \nKegunaan: \nUntuk defisiensi Vitamin B1,B6 dan B12.");
                    System.out.println(Neurobion.getDeskripsi());
                    Neurobion.caraPakai();
                }
                System.out.println("\n");
                System.out.println("Apakah anda mau memesan?");
                System.out.println("1. Ya");
                System.out.println("2.Tidak");
                yakin = scan.nextInt();
            } while (yakin != 1);

        } else if (jenis == 2) { // obat cair
            do {
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                System.out.println(
                        "------------------------------------------------Obat Cair-----------------------------------------------");
                System.out.println("1. Termorex");
                System.out.println("2. Decolsin");
                System.out.println("3. Bisolvon");
                System.out.println("4. Anakonidin");
                System.out.println("5. Paratusin");
                System.out.println("6. Dextral");
                System.out.println("7. Silex");
                System.out.println("8. Siladex");
                System.out.println("9. Ambroxol");
                System.out.println("10. Bufect");
                System.out.println("Masukkan pilihan obat cair yang ingin anda pesan: ");
                cair = scan.nextInt();

                while ((cair < 1) && (cair > 10)) { // untuk pelanggan yang salah menginput jenis
                    System.out.println("Anda salah menginput obat cair, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Masukkan pilihan obat cair yang ingin anda pesan: ");
                    cair = scan.nextInt();
                }

                if (cair == 1) {
                    System.out.println("Termorex");
                    Obat Termorex = new ObatCair("Termorex", 11000);
                    Termorex.setDeskripsi(
                            "Kandungan: \nTiap sendok takar (5 ml) mengandung : \nParacetamol 120 mg \nPseudoephedrine HCl 7.5 mg \nGliseril guaiakoalat 25 mg \nChlorpheniramine Maleate 0.5 mg \nKegunaan: \nUntuk meringankan gejala flu.");
                    System.out.println(Termorex.getDeskripsi());
                    Termorex.caraPakai();
                } else if (cair == 2) {
                    System.out.println("Decolsin");
                    Obat Decolsin = new ObatCair("Decolsin", 18889);
                    Decolsin.setDeskripsi(
                            "Kandungan: \nDextromethorphan \nphenylpropanolamine \nParacetamol \nKegunaan: \nUntuk batuk dan flu.");
                    System.out.println(Decolsin.getDeskripsi());
                    Decolsin.caraPakai();
                } else if (cair == 3) {
                    System.out.println("Bisolvon");
                    Obat Bisolvon = new ObatCair("Bisolvon", 57100);
                    Bisolvon.setDeskripsi(
                            "Kandungan: \nBromhexine HCL 4 mg \nguaifenesin 100 mg \nKegunaan: \nUntuk meredakan batuk berdahak.");
                    System.out.println(Bisolvon.getDeskripsi());
                    Bisolvon.caraPakai();
                } else if (cair == 4) {
                    System.out.println("Anakonidin");
                    Obat Anakonidin = new ObatCair("Anakonidin", 15200);
                    Anakonidin.setDeskripsi(
                            "Kandungan: \nParacetamol 120 mg \nSuccus Liquiritae 100 mg \nPseudoephedrine HCL 7.5 mg \nguaifenesin 100 mg \nKegunaan: \nUntuk meredakan batuk dan gejala flu.");
                    System.out.println(Anakonidin.getDeskripsi());
                    Anakonidin.caraPakai();
                } else if (cair == 5) {
                    System.out.println("Paratusin");
                    Obat Paratusin = new ObatCair("Paratusin", 34200);
                    Paratusin.setDeskripsi(
                            "Kandungan: \nParacetamol 120 mg \nSuccus Liquiritae 100 mg \nPseudoephedrine HCL 7.5 mg \nNoscapine 10 mg \nCholorphenamine maleate 0.5 mg \nKegunaan: \nUntuk meringankan gejala flu.");
                    System.out.println(Paratusin.getDeskripsi());
                    Paratusin.caraPakai();
                } else if (cair == 6) {
                    System.out.println("Dextral");
                    Obat Dextral = new ObatCair("Dextral", 18400);
                    Dextral.setDeskripsi(
                            "Kandungan: \nDextromethorpan HBr 10 mg \nGlyceryl Guaiacolate 50 mg \nPhenylpropanolamine HCl 12.5 mg \nChlorpheniramine maleate 1 mg \nKegunaan: \nUntuk mengatasi gejala flu.");
                    System.out.println(Dextral.getDeskripsi());
                    Dextral.caraPakai();
                } else if (cair == 7) {
                    System.out.println("Silex");
                    Obat Silex = new ObatCair("Silex", 105300);
                    Silex.setDeskripsi(
                            "Kandungan: \nEkstrak Thymi Herba Siccum 41.67 mg \nEkstrak Primulae Radix Siccum 10 mg \nEkstrak Althaea Folium Siccum 58.33 mg \nKegunaan: \nUntuk membantu meredakan batuk berdahak, melegakan tenggorokan dan pilek.");
                    System.out.println(Silex.getDeskripsi());
                    Silex.caraPakai();
                } else if (cair == 8) {
                    System.out.println("Siladex");
                    Obat Siladex = new ObatCair("Siladex", 16900);
                    Siladex.setDeskripsi(
                            "Kandungan: \nChlopheniramine maleate 1 mg \nDextromethorphan Hydrobromide 15 mg \nKegunaan: \nUntuk meredakan batuk tidak berdahak serta alergi.");
                    System.out.println(Siladex.getDeskripsi());
                    Siladex.caraPakai();
                } else if (cair == 9) {
                    System.out.println("Ambroxol");
                    Obat Ambroxol = new ObatCair("Ambroxol", 14300);
                    Ambroxol.setDeskripsi(
                            "Kandungan: \nAmbroxol HCl 15 mg \nKegunaan: \nSebagai sekretolitik pada gangguan saluran nafas akut dan kronis khususnya pada eksaserbasi bronkitis kronis.");
                    System.out.println(Ambroxol.getDeskripsi());
                    Ambroxol.caraPakai();
                } else if (cair == 10) {
                    System.out.println("Bufect");
                    Obat Bufect = new ObatCair("Bufect", 21400);
                    Bufect.setDeskripsi("Kandungan: \nIbuprofen 100 mg/ 5ml \nKegunaan: \nUntuk meredakan nyeri.");
                    System.out.println(Bufect.getDeskripsi());
                    Bufect.caraPakai();
                }
                System.out.println("\n");
                System.out.println("Apakah anda mau memesan?");
                System.out.println("1. Ya");
                System.out.println("2.Tidak");
                yakin = scan.nextInt();
            } while (yakin != 1);

        } else if (jenis == 3) { // obat salep
            do {
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                System.out.println(
                        "------------------------------------------------Obat Salep----------------------------------------------");
                System.out.println("1. Kalmicetine");
                System.out.println("2. Kalpanax");
                System.out.println("3. Gentamicin");
                System.out.println("4. Ketoconazole");
                System.out.println("5. Lotasbat");
                System.out.println("6. Bioplaceton");
                System.out.println("7. PagodaSalep");
                System.out.println("8. PikangShuang");
                System.out.println("9. Acyclovir");
                System.out.println("10. Scabimite");
                System.out.println("Masukkan pilihan obat salep yang ingin anda pesan: ");
                salep = scan.nextInt();

                while ((salep < 1) && (salep > 10)) { // untuk pelanggan yang salah menginput jenis
                    System.out.println("Anda salah menginput obat salep, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Masukkan pilihan obat salep yang ingin anda pesan: ");
                    salep = scan.nextInt();
                }

                if (salep == 1) {
                    System.out.println("Kalmicetine");
                    Obat Kalmicetine = new ObatSalep("Kalmicetine", 22300);
                    Kalmicetine.setDeskripsi(
                            "Kandungan: \nChloramphenicol 20 mg \nKegunaan: \nUntuk infeksi kulit yang disebabkan oleh bakteri.");
                    System.out.println(Kalmicetine.getDeskripsi());
                    Kalmicetine.caraPakai();
                } else if (salep == 2) {
                    System.out.println("Kalpanax");
                    Obat Kalpanax = new ObatSalep("Kalpanax", 19000);
                    Kalpanax.setDeskripsi(
                            "Kandungan: \nMiconazole nitrate 2% \nKegunaan: \nUntuk Pitiriasis versikolor, dermatofitosis, dan mikosis kulit lain.");
                    System.out.println(Kalpanax.getDeskripsi());
                    Kalpanax.caraPakai();
                } else if (salep == 3) {
                    System.out.println("Gentamicin");
                    Obat Gentamicin = new ObatSalep("Gentamicin", 6500);
                    Gentamicin.setDeskripsi(
                            "Kandungan: \nGentamicin sulfate 0.1% \nKegunaan: \nUntuk pengobatan topikal infeksi primer dan sekunder pada kulit .");
                    System.out.println(Gentamicin.getDeskripsi());
                    Gentamicin.caraPakai();
                } else if (salep == 4) {
                    System.out.println("Ketoconazole");
                    Obat Ketoconazole = new ObatSalep("Ketoconazole", 10700);
                    Ketoconazole.setDeskripsi(
                            "Kandungan: \nKetoconazole 2 % \nKegunaan: \nUntuk Infeksi dermatofita pada kulit atau kuku tangan (tidak pada kuku kaki).");
                    System.out.println(Ketoconazole.getDeskripsi());
                    Ketoconazole.caraPakai();
                } else if (salep == 5) {
                    System.out.println("Lotasbat");
                    Obat Lotasbat = new ObatSalep("Lotasbat", 79900);
                    Lotasbat.setDeskripsi(
                            "Kandungan: \nClobetasol propionate 0.05% \nKegunaan: \nUntuk Pengobatan jangka pendek Dermatosis yang resisten.");
                    System.out.println(Lotasbat.getDeskripsi());
                    Lotasbat.caraPakai();
                } else if (salep == 6) {

                } else if (salep == 7) {

                } else if (salep == 8) {

                } else if (salep == 9) {

                } else if (salep == 10) {

                }
                System.out.println("\n");
                System.out.println("Apakah anda mau memesan?");
                System.out.println("1. Ya");
                System.out.println("2.Tidak");
                yakin = scan.nextInt();
            } while (yakin != 1);
        }
    }

    /**
     * Method Main
     *
     * @param a command line argument
     */
    public static void main(String[] args) {
        apotek();
    }
}
