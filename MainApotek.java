import java.util.Scanner;

/**
 * Class Main untuk algoritma jalannya layanan Apotek Sehat Online
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class MainApotek {
    private boolean yakin;

    /**
     * Constructor tanpa parameter
     */
    public MainApotek() {
    }

    /**
     * Method ini berfungsi untuk melakukan return ke menu sebelumnya
     *
     * @param fix pilihan jika user yakin ingin kembali ke menu sebelumnya
     */
    public void setYakin(boolean fix) {
        this.yakin = fix;
    }

    /**
     * Method ini berfungsi untuk mengecek apakah ada obat tablet yang dipesan
     * pelanggan
     * 
     * @return Paracetamol int yang merepresentasikan jumlah Paracetamol
     * @return Panadol int yang merepresentasikan jumlah Panadol
     * @return Bodrex int yang merepresentasikan jumlah Bodrex
     * @return Domperidone int yang merepresentasikan jumlah Domperidone
     * @return Amplodipine int yang merepresentasikan jumlah Amplodipine
     */
    public void cekObatTablet(int Paracetamol, int Panadol, int Bodrex, int Domperidone, int Amlodipine) {
        System.out.println("OBAT TABLET");
        if ((Paracetamol > 0) || (Panadol > 0) || (Bodrex > 0) || (Domperidone > 0) || (Amlodipine > 0)) {
            Obat tablet = new ObatTablet();
            tablet.caraPakai();
            if (Paracetamol > 0) {
                System.out.println("- Paracetamol\t: " + Paracetamol + " buah");
            }
            if (Panadol > 0) {
                System.out.println("- Panadol\t: " + Panadol + " buah");
            }
            if (Bodrex > 0) {
                System.out.println("- Bodrex\t: " + Bodrex + " buah");
            }
            if (Domperidone > 0) {
                System.out.println("- Domperidone\t: " + Domperidone + " buah");
            }
            if (Amlodipine > 0) {
                System.out.println("- Amlodipine\t: " + Amlodipine + " buah");
            }
        } else {
            System.out.println("\nTidak ada pesanan obat tablet");
        }
    }

    /**
     * Method ini berfungsi untuk mengecek apakah ada obat cair yang dipesan
     * pelanggan
     * 
     * @return Termorex int yang merepresentasikan jumlah Termorex
     * @return Decolsin int yang merepresentasikan jumlah Decolsin
     * @return Bisolvon int yang merepresentasikan jumlah Bisolvon
     * @return Anakonidin int yang merepresentasikan jumlah Anakonidin
     * @return Paratusin int yang merepresentasikan jumlah Paratusin
     */
    public void cekObatCair(int Termorex, int Decolsin, int Bisolvon, int Anakonidin, int Paratusin) {
        System.out.println("\nOBAT CAIR");
        if ((Termorex > 0) || (Decolsin > 0) || (Bisolvon > 0) || (Anakonidin > 0) || (Paratusin > 0)) {
            Obat cair = new ObatCair();
            cair.caraPakai();
            if (Termorex > 0) {
                System.out.println("- Termorex\t: " + Termorex + " buah");
            }
            if (Decolsin > 0) {
                System.out.println("- Decolsin\t: " + Decolsin + " buah");
            }
            if (Bisolvon > 0) {
                System.out.println("- Bisolvon\t: " + Bisolvon + " buah");
            }
            if (Anakonidin > 0) {
                System.out.println("- Anakonidin\t: " + Anakonidin + " buah");
            }
            if (Paratusin > 0) {
                System.out.println("- Paratusin\t: " + Paratusin + " buah");
            }
        } else {
            System.out.println("\nTidak ada pesanan obat cair");
        }
    }

    /**
     * Method ini berfungsi untuk mengecek apakah ada obat salep yang dipesan
     * pelanggan
     * 
     * @return Kalmicetine int yang merepresentasikan jumlah Kalmicetine
     * @return Kalpanax int yang merepresentasikan jumlah Kalpanax
     * @return Gentamicin int yang merepresentasikan jumlah Gentamicin
     * @return Ketoconazole int yang merepresentasikan jumlah Ketoconazole
     * @return Lotasbat int yang merepresentasikan jumlah Lotasbat
     */
    public void cekObatSalep(int Kalmicetine, int Kalpanax, int Gentamicin, int Ketoconazole, int Lotasbat) {
        System.out.println("\nOBAT SALEP");
        if ((Kalmicetine > 0) || (Kalpanax > 0) || (Gentamicin > 0) || (Ketoconazole > 0) || (Lotasbat > 0)) {
            Obat salep = new ObatSalep();
            salep.caraPakai();
            if (Kalmicetine > 0) {
                System.out.println("- Kalmicetine\t: " + Kalmicetine + " buah");
            }
            if (Kalpanax > 0) {
                System.out.println("- Kalpanax\t: " + Kalpanax + " buah");
            }
            if (Gentamicin > 0) {
                System.out.println("- Gentamicin\t: " + Gentamicin + " buah");
            }
            if (Ketoconazole > 0) {
                System.out.println("- Ketoconazole\t: " + Ketoconazole + " buah");
            }
            if (Lotasbat > 0) {
                System.out.println("- Lotasbat\t: " + Lotasbat + " buah");
            }
        } else {
            System.out.println("\nTidak ada pesanan obat salep");
        }
    }

    /**
     * Method ini berfungsi untuk menampilkan menu obat
     */
    public void menuObat() {
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(
                "------------------------------------------------Menu Obat-----------------------------------------------");
        System.out.println("1. Obat Tablet");
        System.out.println("2. Obat Cair");
        System.out.println("3. Obat Salep");
        System.out.println("4. Selesai");
        System.out.print("Masukkan pilihan jenis obat yang ingin anda pesan: ");
    }

    /**
     * Method ini berfungsi untuk menampilkan menu obat tablet
     */
    public void menuTablet() {
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(
                "-----------------------------------------------Obat Tablet----------------------------------------------");
        System.out.println("1. Paracetamol (Rp 7.500)");
        System.out.println("2. Panadol (Rp 12.000)");
        System.out.println("3. Bodrex (Rp 11.100)");
        System.out.println("4. Domperidone (Rp 6.500)");
        System.out.println("5. Amlodipine (Rp 26.400)");
        System.out.println("6. Kembali");
        System.out.print("Masukkan pilihan anda: ");
    }

    /**
     * Method ini berfungsi untuk menampilkan menu obat cair
     */
    public void menuCair() {
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(
                "------------------------------------------------Obat Cair-----------------------------------------------");
        System.out.println("1. Termorex (Rp 11.000)");
        System.out.println("2. Decolsin (Rp 18.889)");
        System.out.println("3. Bisolvon (Rp 57.100)");
        System.out.println("4. Anakonidin (Rp 15.200)");
        System.out.println("5. Paratusin (Rp 34.200)");
        System.out.println("6. Kembali");
        System.out.print("Masukkan pilihan anda: ");
    }

    /**
     * Method ini berfungsi untuk menampilkan menu obat salep
     */
    public void menuSalep() {
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(
                "------------------------------------------------Obat Salep----------------------------------------------");
        System.out.println("1. Kalmicetine (Rp 22.300)");
        System.out.println("2. Kalpanax (Rp 19.000)");
        System.out.println("3. Gentamicin (Rp 6.500)");
        System.out.println("4. Ketoconazole (Rp 10.700)");
        System.out.println("5. Lotasbat (Rp 79.900)");
        System.out.println("6. Kembali");
        System.out.print("Masukkan pilihan anda: ");
    }

    /**
     * Tempat logika Apotek Sehat Online dimasukkan
     */
    public static void apotek() {
        Scanner scan = new Scanner(System.in);
        MainApotek ma = new MainApotek();
        Invoice bill = new Invoice();
        // obat tablet
        Obat Paracetamol = new ObatTablet("Paracetamol", 7500);
        Obat Panadol = new ObatTablet("Panadol", 12000);
        Obat Bodrex = new ObatTablet("Bodrex", 11000);
        Obat Domperidone = new ObatTablet("Domperidone", 6500);
        Obat Amlodipine = new ObatTablet("Amlodipine", 26400);
        // obat cair
        Obat Termorex = new ObatCair("Termorex", 11000);
        Obat Decolsin = new ObatCair("Decolsin", 18889);
        Obat Bisolvon = new ObatCair("Bisolvon", 57100);
        Obat Anakonidin = new ObatCair("Anakonidin", 15200);
        Obat Paratusin = new ObatCair("Paratusin", 34200);
        // obat salep
        Obat Kalmicetine = new ObatSalep("Kalmicetine", 22300);
        Obat Kalpanax = new ObatSalep("Kalpanax", 19000);
        Obat Gentamicin = new ObatSalep("Gentamicin", 6500);
        Obat Ketoconazole = new ObatSalep("Ketoconazole", 10700);
        Obat Lotasbat = new ObatSalep("Lotasbat", 79900);

        String nama, noKtp;
        int jenis, tablet, cair, salep;

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
        System.out.print("Nama\t: ");
        nama = scan.next();
        user.setNama(nama);
        System.out.print("KTP\t: ");
        noKtp = scan.next();
        user.setKtp(noKtp);

        ma.setYakin(true);
        do {
            ma.menuObat();
            jenis = scan.nextInt();

            while ((jenis != 1) && (jenis != 2) && (jenis != 3) && (jenis != 4)) { // untuk pelanggan yang salah
                                                                                   // menginput jenis
                System.out.println("Anda salah menginput jenis obat, silahkan dicoba untuk menginput ulang");
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                System.out.print("\nMasukkan pilihan jenis obat yang ingin anda pesan: ");
                jenis = scan.nextInt();
            }

            if (jenis == 1) { // obat tablet
                ma.menuTablet();
                tablet = scan.nextInt();

                while ((tablet < 1) || (tablet > 6)) { // untuk pelanggan yang salah menginput pilihan pada menu obat
                                                       // tablet
                    System.out.println("Anda salah menginput pilihan, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.print("Masukkan pilihan anda: ");
                    tablet = scan.nextInt();
                }

                if (tablet == 1) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Paracetamol");
                    Paracetamol.setDeskripsi(
                            "Kandungan: \n\t- Paracetamol 500 mg\nKegunaan: \n\tUntuk meredakan demam dan nyeri, mengendalikan kadar gula darah dan menjaga fungsi otot.");
                    System.out.println(Paracetamol.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Paracetamol.setJumlah(jumlah);

                    Paracetamol.getSubTotal(Paracetamol.getHarga(), Paracetamol.getJumlah());
                    Paracetamol.isiKeranjangHarga();
                    Paracetamol.isiKeranjangJumlah();
                } else if (tablet == 2) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Panadol");
                    Panadol.setDeskripsi(
                            "Kandungan: \n\t- Paracetamol \nKegunaan: \n\tUntuk meredakan demam dan nyeri.");
                    System.out.println(Panadol.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Panadol.setJumlah(jumlah);

                    Panadol.getSubTotal(Panadol.getHarga(), Panadol.getJumlah());
                    Panadol.isiKeranjangHarga();
                    Panadol.isiKeranjangJumlah();
                } else if (tablet == 3) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Bodrex");
                    Bodrex.setDeskripsi(
                            "Kandungan: \n\t- Caffeine 50 mg \n\t- Paracetamol 600 mg \nKegunaan: \n\tUntuk meringankan sakit kepala, sakit gigi, dan menurunkan demam.");
                    System.out.println(Bodrex.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Bodrex.setJumlah(jumlah);

                    Bodrex.getSubTotal(Bodrex.getHarga(), Bodrex.getJumlah());
                    Bodrex.isiKeranjangHarga();
                    Bodrex.isiKeranjangJumlah();
                } else if (tablet == 4) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Domperidone");
                    Domperidone.setDeskripsi(
                            "Kandungan: \n\t- Domperidone 10 mg  \nKegunaan: \n\tUntuk meredakan mual dan muntah, mempercepat kontraksi usus atau lambung, serta meningkatkan produksi ASI.");
                    System.out.println(Domperidone.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Domperidone.setJumlah(jumlah);

                    Domperidone.getSubTotal(Domperidone.getHarga(), Domperidone.getJumlah());
                    Domperidone.isiKeranjangHarga();
                    Domperidone.isiKeranjangJumlah();
                } else if (tablet == 5) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Amlodipine");
                    Amlodipine.setDeskripsi(
                            "Kandungan: \n\t- Amlodipine 10 mg \nKegunaan: \n\tUntuk mengontrol tekanan darah.");
                    System.out.println(Amlodipine.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Amlodipine.setJumlah(jumlah);

                    Amlodipine.getSubTotal(Amlodipine.getHarga(), Amlodipine.getJumlah());
                    Amlodipine.isiKeranjangHarga();
                    Amlodipine.isiKeranjangJumlah();
                } else if (tablet == 6) {
                    continue;
                }
            } else if (jenis == 2) { // obat cair
                ma.menuCair();
                cair = scan.nextInt();

                while ((cair < 1) || (cair > 6)) { // untuk pelanggan yang salah menginput pilihan pada menu obat cair
                    System.out.println("Anda salah menginput pilihan, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.print("Masukkan pilihan anda: ");
                    cair = scan.nextInt();
                }

                if (cair == 1) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Termorex");
                    Termorex.setDeskripsi(
                            "Kandungan: \nTiap sendok takar (5 ml) mengandung : \n\t- Paracetamol 120 mg \n\t- Pseudoephedrine HCl 7.5 mg \n\t- Gliseril guaiakoalat 25 mg \n\t- Chlorpheniramine Maleate 0.5 mg \nKegunaan: \n\tUntuk meringankan gejala flu.");
                    System.out.println(Termorex.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Termorex.setJumlah(jumlah);

                    Termorex.getSubTotal(Termorex.getHarga(), Termorex.getJumlah());
                    Termorex.isiKeranjangHarga();
                    Termorex.isiKeranjangJumlah();

                } else if (cair == 2) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Decolsin");
                    Decolsin.setDeskripsi(
                            "Kandungan: \n\t- Dextromethorphan \n\t- phenylpropanolamine \n\t- Paracetamol \nKegunaan: \n\tUntuk batuk dan flu.");
                    System.out.println(Decolsin.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Decolsin.setJumlah(jumlah);

                    Decolsin.getSubTotal(Decolsin.getHarga(), Decolsin.getJumlah());
                    Decolsin.isiKeranjangHarga();
                    Decolsin.isiKeranjangJumlah();
                } else if (cair == 3) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Bisolvon");
                    Bisolvon.setDeskripsi(
                            "Kandungan: \n\t- Bromhexine HCL 4 mg \n\t- guaifenesin 100 mg \nKegunaan: \n\tUntuk meredakan batuk berdahak.");
                    System.out.println(Bisolvon.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Bisolvon.setJumlah(jumlah);

                    Bisolvon.getSubTotal(Bisolvon.getHarga(), Bisolvon.getJumlah());
                    Bisolvon.isiKeranjangHarga();
                    Bisolvon.isiKeranjangJumlah();
                } else if (cair == 4) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Anakonidin");
                    Anakonidin.setDeskripsi(
                            "Kandungan: \n\t- Paracetamol 120 mg \n\t- Succus Liquiritae 100 mg \n\t- Pseudoephedrine HCL 7.5 mg \n\t- guaifenesin 100 mg \nKegunaan: \n\tUntuk meredakan batuk dan gejala flu.");
                    System.out.println(Anakonidin.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Anakonidin.setJumlah(jumlah);

                    Anakonidin.getSubTotal(Anakonidin.getHarga(), Anakonidin.getJumlah());
                    Anakonidin.isiKeranjangHarga();
                    Anakonidin.isiKeranjangJumlah();

                } else if (cair == 5) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Paratusin");
                    Paratusin.setDeskripsi(
                            "Kandungan: \n\t- Paracetamol 120 mg \n\t- Succus Liquiritae 100 mg \n\t- Pseudoephedrine HCL 7.5 mg \n\t- Noscapine 10 mg \n\t- Cholorphenamine maleate 0.5 mg \nKegunaan: \n\tUntuk meringankan gejala flu.");
                    System.out.println(Paratusin.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Paratusin.setJumlah(jumlah);

                    Paratusin.getSubTotal(Paratusin.getHarga(), Paratusin.getJumlah());
                    Paratusin.isiKeranjangHarga();
                    Paratusin.isiKeranjangJumlah();
                } else if (cair == 6) {
                    continue;
                }
            } else if (jenis == 3) { // obat salep
                ma.menuSalep();
                salep = scan.nextInt();

                while ((salep < 1) || (salep > 6)) { // untuk pelanggan yang salah menginput pilihan pada menu obat
                                                     // salep
                    System.out.println("Anda salah menginput pilihan, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.print("Masukkan pilihan anda: ");
                    salep = scan.nextInt();
                }

                if (salep == 1) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Kalmicetine");
                    Kalmicetine.setDeskripsi(
                            "Kandungan: \n\t- Chloramphenicol 20 mg \nKegunaan: \n\tUntuk infeksi kulit yang disebabkan oleh bakteri.");
                    System.out.println(Kalmicetine.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Kalmicetine.setJumlah(jumlah);

                    Kalmicetine.getSubTotal(Kalmicetine.getHarga(), Kalmicetine.getJumlah());
                    Kalmicetine.isiKeranjangHarga();
                    Kalmicetine.isiKeranjangJumlah();
                } else if (salep == 2) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Kalpanax");
                    Kalpanax.setDeskripsi(
                            "Kandungan: \n\t- Miconazole nitrate 2% \nKegunaan: \n\tUntuk Pitiriasis versikolor, dermatofitosis, dan mikosis kulit lain.");
                    System.out.println(Kalpanax.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Kalpanax.setJumlah(jumlah);

                    Kalpanax.getSubTotal(Kalpanax.getHarga(), Kalpanax.getJumlah());
                    Kalpanax.isiKeranjangHarga();
                    Kalpanax.isiKeranjangJumlah();
                } else if (salep == 3) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Gentamicin");
                    Gentamicin.setDeskripsi(
                            "Kandungan: \n\t- Gentamicin sulfate 0.1% \nKegunaan: \n\tUntuk pengobatan topikal infeksi primer dan sekunder pada kulit.");
                    System.out.println(Gentamicin.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Gentamicin.setJumlah(jumlah);

                    Gentamicin.getSubTotal(Gentamicin.getHarga(), Gentamicin.getJumlah());
                    Gentamicin.isiKeranjangHarga();
                    Gentamicin.isiKeranjangJumlah();
                } else if (salep == 4) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Ketoconazole");
                    Ketoconazole.setDeskripsi(
                            "Kandungan: \n\t- Ketoconazole 2 % \nKegunaan: \n\tUntuk Infeksi dermatofita pada kulit atau kuku tangan (tidak pada kuku kaki).");
                    System.out.println(Ketoconazole.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Ketoconazole.setJumlah(jumlah);

                    Ketoconazole.getSubTotal(Ketoconazole.getHarga(), Ketoconazole.getJumlah());
                    Ketoconazole.isiKeranjangHarga();
                    Ketoconazole.isiKeranjangJumlah();
                } else if (salep == 5) {
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Lotasbat");
                    Lotasbat.setDeskripsi(
                            "Kandungan: \n\t- Clobetasol propionate 0.05% \nKegunaan: \n\tUntuk Pengobatan jangka pendek Dermatosis yang resisten.");
                    System.out.println(Lotasbat.getDeskripsi());

                    System.out.print("\nMasukkan jumlah obat yang ingin dipesan:");
                    int jumlah = scan.nextInt();
                    Lotasbat.setJumlah(jumlah);

                    Lotasbat.getSubTotal(Lotasbat.getHarga(), Lotasbat.getJumlah());
                    Lotasbat.isiKeranjangHarga();
                    Lotasbat.isiKeranjangJumlah();
                } else if (salep == 6) {
                    continue;
                }
            } else if (jenis == 4) {
                // total harga dari pemesanan obat
                int duit = Paracetamol.isiKeranjangHarga() + Panadol.isiKeranjangHarga() + Bodrex.isiKeranjangHarga()
                        + Domperidone.isiKeranjangHarga() + Amlodipine.isiKeranjangHarga()
                        + Termorex.isiKeranjangHarga() + Decolsin.isiKeranjangHarga() + Bisolvon.isiKeranjangHarga()
                        + Anakonidin.isiKeranjangHarga() + Paratusin.isiKeranjangHarga()
                        + Kalmicetine.isiKeranjangHarga() + Kalpanax.isiKeranjangHarga()
                        + Gentamicin.isiKeranjangHarga() + Ketoconazole.isiKeranjangHarga()
                        + Lotasbat.isiKeranjangHarga();
                // total jumlah obat dari pemesanan obat
                int banyak = Paracetamol.isiKeranjangJumlah() + Panadol.isiKeranjangJumlah()
                        + Bodrex.isiKeranjangJumlah() + Domperidone.isiKeranjangJumlah()
                        + Amlodipine.isiKeranjangJumlah() + Termorex.isiKeranjangJumlah()
                        + Decolsin.isiKeranjangJumlah() + Bisolvon.isiKeranjangJumlah()
                        + Anakonidin.isiKeranjangJumlah() + Paratusin.isiKeranjangJumlah()
                        + Kalmicetine.isiKeranjangJumlah() + Kalpanax.isiKeranjangJumlah()
                        + Gentamicin.isiKeranjangJumlah() + Ketoconazole.isiKeranjangJumlah()
                        + Lotasbat.isiKeranjangJumlah();
                // struk pemesanan obat
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\tSTRUK PEMESANAN OBAT");
                System.out.println("Nama\t: " + user.getNama() + "\nKTP\t: " + user.getKtp());
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                ma.cekObatTablet(Paracetamol.isiKeranjangJumlah(), Panadol.isiKeranjangJumlah(),
                        Bodrex.isiKeranjangJumlah(), Domperidone.isiKeranjangJumlah(), Amlodipine.isiKeranjangJumlah());

                ma.cekObatCair(Termorex.isiKeranjangJumlah(), Decolsin.isiKeranjangJumlah(),
                        Bisolvon.isiKeranjangJumlah(), Anakonidin.isiKeranjangJumlah(), Paratusin.isiKeranjangJumlah());

                ma.cekObatSalep(Kalmicetine.isiKeranjangJumlah(), Kalpanax.isiKeranjangJumlah(),
                        Gentamicin.isiKeranjangJumlah(), Ketoconazole.isiKeranjangJumlah(),
                        Lotasbat.isiKeranjangJumlah());

                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                bill.cetakInvoice(banyak, duit);
                System.out.println("\n\t\t\tStruk ini dapat ditukarkan di cabang Apotek Sehat terdekat");
                System.out.println("\t\t\tTerima Kasih telah menggunakan layanan Apotek Sehat Online");
                System.out.println("\t\t\t\t\tSemoga Anda Puas");
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                ma.setYakin(false);
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
