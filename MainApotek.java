import java.util.Scanner;

/**
 * Class Main untuk algoritma jalannya Apotek Sehat Online
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class MainApotek {
    private boolean yakin;
    private boolean yangbener;

    /**
     * Constructor tanpa parameter
     */
    public MainApotek() {

    }

    public void setYakin(boolean fix) {
        this.yakin = fix;
    }

    public void cekObatTablet(int Paracetamol, int Panadol, int Bodrex, int Domperidone, int Amlodipine) {
        if ((Paracetamol > 0) && (Panadol <= 0) && (Bodrex <= 0) && (Domperidone <= 0) && (Amlodipine <= 0)) {
            System.out.println("Paracetamol : " + Paracetamol + "buah");
        } else if ((Paracetamol > 0) && (Panadol > 0) && (Bodrex <= 0) && (Domperidone <= 0) && (Amlodipine <= 0)) {
            System.out.println("Panadol : " + Panadol + "buah");
        } else if ((Paracetamol > 0) && (Panadol > 0) && (Bodrex > 0) && (Domperidone <= 0) && (Amlodipine <= 0)) {
            System.out.println("Bodrex : " + Bodrex + "buah");
        } else if ((Paracetamol > 0) && (Panadol > 0) && (Bodrex > 0) && (Domperidone > 0) && (Amlodipine <= 0)) {
            System.out.println("Domperidone : " + Domperidone + "buah");
        } else if ((Paracetamol > 0) && (Panadol > 0) && (Bodrex > 0) && (Domperidone > 0) && (Amlodipine > 0)) {
            System.out.println("Amlodipine : " + Amlodipine + "buah");
        }
    }

    public boolean yakin() {
        Scanner scan = new Scanner(System.in);
        int serius;
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println("Apakah anda mau memesan?");
        System.out.println("1. Ya");
        System.out.println("2.Tidak");
        serius = scan.nextInt();
        if (serius == 1) {
            return true;
        }
        return false;
    }

    public void menuObat() {
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(
                "------------------------------------------------Menu Obat-----------------------------------------------");
        System.out.println("1. Obat Tablet");
        System.out.println("2. Obat Cair");
        System.out.println("3. Obat Salep");
        System.out.print("Masukkan pilihan jenis obat yang ingin anda pesan: ");
    }

    public void menuTablet() {
        Scanner scan = new Scanner(System.in);
        MainApotek ma = new MainApotek();
        int tablet;
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
            System.out.println("Masukkan pilihan obat tablet yang ingin anda pesan: ");
            tablet = scan.nextInt();

            while ((tablet < 1) || (tablet > 10)) { // untuk pelanggan yang salah menginput jenis
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
                ma.yangbener = ma.yakin();
            } else if (tablet == 2) {
                System.out.println("Panadol");
                Obat Panadol = new ObatTablet("Panadol", 12000);
                Panadol.setDeskripsi("Kandungan: \nParacetamol \nKegunaan: \nUntuk meredakan demam dan nyeri.");
                System.out.println(Panadol.getDeskripsi());
                Panadol.caraPakai();
                ma.yangbener = ma.yakin();
            } else if (tablet == 3) {
                System.out.println("Bodrex");
                Obat Bodrex = new ObatTablet("Bodrex", 11000);
                Bodrex.setDeskripsi(
                        "Kandungan: \nCaffeine 50 mg \nParacetamol 600 mg \nKegunaan: \nUntuk meringankan sakit kepala,sakit gigi dan menurunkan demam.");
                System.out.println(Bodrex.getDeskripsi());
                Bodrex.caraPakai();
                ma.yangbener = ma.yakin();
            } else if (tablet == 4) {
                System.out.println("Domperidone");
                Obat Domperidone = new ObatTablet("Domperidone", 6500);
                Domperidone.setDeskripsi(
                        "Kandungan: \nDomperidone 10 mg  \nKegunaan: \nUntuk meredakan mual dan muntah,mempercepat kontraksi usus atau lambung,serta meningkatkan produksi ASI.");
                System.out.println(Domperidone.getDeskripsi());
                Domperidone.caraPakai();
                ma.yangbener = ma.yakin();
            } else if (tablet == 5) {
                System.out.println("Amlodipine");
                Obat Amlodipine = new ObatTablet("Amlodipine", 26400);
                Amlodipine.setDeskripsi(
                        "Kandungan: \nAmlodipine 10 mg \nKegunaan: \nUntuk mengontrol tekanan darah.");
                System.out.println(Amlodipine.getDeskripsi());
                Amlodipine.caraPakai();
                ma.yangbener = ma.yakin();
            } else if (tablet == 6) {
                Obat ob = new ObatTablet();
                ob.caraPakai();
            }

        } while (ma.yangbener);
    }

    public void menuCair() {
        Scanner scan = new Scanner(System.in);
        MainApotek ma = new MainApotek();
        int cair;
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
            System.out.println("Masukkan pilihan obat cair yang ingin anda pesan: ");
            cair = scan.nextInt();

            while ((cair < 1) || (cair > 10)) { // untuk pelanggan yang salah menginput jenis
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
                ma.yakin = ma.yakin();
            } else if (cair == 2) {
                System.out.println("Decolsin");
                Obat Decolsin = new ObatCair("Decolsin", 18889);
                Decolsin.setDeskripsi(
                        "Kandungan: \nDextromethorphan \nphenylpropanolamine \nParacetamol \nKegunaan: \nUntuk batuk dan flu.");
                System.out.println(Decolsin.getDeskripsi());
                Decolsin.caraPakai();
                ma.yakin = ma.yakin();
            } else if (cair == 3) {
                System.out.println("Bisolvon");
                Obat Bisolvon = new ObatCair("Bisolvon", 57100);
                Bisolvon.setDeskripsi(
                        "Kandungan: \nBromhexine HCL 4 mg \nguaifenesin 100 mg \nKegunaan: \nUntuk meredakan batuk berdahak.");
                System.out.println(Bisolvon.getDeskripsi());
                Bisolvon.caraPakai();
                ma.yakin = ma.yakin();
            } else if (cair == 4) {
                System.out.println("Anakonidin");
                Obat Anakonidin = new ObatCair("Anakonidin", 15200);
                Anakonidin.setDeskripsi(
                        "Kandungan: \nParacetamol 120 mg \nSuccus Liquiritae 100 mg \nPseudoephedrine HCL 7.5 mg \nguaifenesin 100 mg \nKegunaan: \nUntuk meredakan batuk dan gejala flu.");
                System.out.println(Anakonidin.getDeskripsi());
                Anakonidin.caraPakai();
                ma.yakin = ma.yakin();
            } else if (cair == 5) {
                System.out.println("Paratusin");
                Obat Paratusin = new ObatCair("Paratusin", 34200);
                Paratusin.setDeskripsi(
                        "Kandungan: \nParacetamol 120 mg \nSuccus Liquiritae 100 mg \nPseudoephedrine HCL 7.5 mg \nNoscapine 10 mg \nCholorphenamine maleate 0.5 mg \nKegunaan: \nUntuk meringankan gejala flu.");
                System.out.println(Paratusin.getDeskripsi());
                Paratusin.caraPakai();
                ma.yakin = ma.yakin();
            }
        } while (ma.yakin);
    }

    public void menuSalep() {
        Scanner scan = new Scanner(System.in);
        MainApotek ma = new MainApotek();
        int salep;
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
            System.out.println("Masukkan pilihan obat salep yang ingin anda pesan: ");
            salep = scan.nextInt();

            while ((salep < 1) || (salep > 10)) { // untuk pelanggan yang salah menginput jenis
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
                ma.yakin = ma.yakin();
            } else if (salep == 2) {
                System.out.println("Kalpanax");
                Obat Kalpanax = new ObatSalep("Kalpanax", 19000);
                Kalpanax.setDeskripsi(
                        "Kandungan: \nMiconazole nitrate 2% \nKegunaan: \nUntuk Pitiriasis versikolor, dermatofitosis, dan mikosis kulit lain.");
                System.out.println(Kalpanax.getDeskripsi());
                Kalpanax.caraPakai();
                ma.yakin = ma.yakin();
            } else if (salep == 3) {
                System.out.println("Gentamicin");
                Obat Gentamicin = new ObatSalep("Gentamicin", 6500);
                Gentamicin.setDeskripsi(
                        "Kandungan: \nGentamicin sulfate 0.1% \nKegunaan: \nUntuk pengobatan topikal infeksi primer dan sekunder pada kulit .");
                System.out.println(Gentamicin.getDeskripsi());
                Gentamicin.caraPakai();
                ma.yakin = ma.yakin();
            } else if (salep == 4) {
                System.out.println("Ketoconazole");
                Obat Ketoconazole = new ObatSalep("Ketoconazole", 10700);
                Ketoconazole.setDeskripsi(
                        "Kandungan: \nKetoconazole 2 % \nKegunaan: \nUntuk Infeksi dermatofita pada kulit atau kuku tangan (tidak pada kuku kaki).");
                System.out.println(Ketoconazole.getDeskripsi());
                Ketoconazole.caraPakai();
                ma.yakin = ma.yakin();
            } else if (salep == 5) {
                System.out.println("Lotasbat");
                Obat Lotasbat = new ObatSalep("Lotasbat", 79900);
                Lotasbat.setDeskripsi(
                        "Kandungan: \nClobetasol propionate 0.05% \nKegunaan: \nUntuk Pengobatan jangka pendek Dermatosis yang resisten.");
                System.out.println(Lotasbat.getDeskripsi());
                Lotasbat.caraPakai();
                ma.yakin = ma.yakin();
            }
        } while (ma.yakin);
    }

    /**
     * Tempat logika Apotek Sehat Online dimasukkan
     */
    public static void apotek() {
        Scanner scan = new Scanner(System.in);
        MainApotek ma = new MainApotek();
        String nama, noKtp;
        int jenis;

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
        System.out.print("KTP: ");
        noKtp = scan.next();
        user.setKtp(noKtp);
        ma.setYakin(true);
        do {
            ma.menuObat();
            jenis = scan.nextInt();

            while ((jenis != 1) && (jenis != 2) && (jenis != 3)) { // untuk pelanggan yang salah menginput jenis
                System.out.println("Anda salah menginput jenis obat, silahkan dicoba untuk menginput ulang");
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                System.out.println("Masukkan pilihan jenis obat yang ingin anda pesan: ");
                jenis = scan.nextInt();
            }

            if (jenis == 1) { // obat tablet
                ma.menuTablet();
            } else if (jenis == 2) { // obat cair
                ma.menuCair();
            } else if (jenis == 3) { // obat salep
                ma.menuSalep();
            }
        } while (ma.yakin);
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
