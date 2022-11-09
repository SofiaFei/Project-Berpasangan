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
    // private boolean yangbener;

    /**
     * Constructor tanpa parameter
     */
    public MainApotek() {

    }

     public void setYakin(boolean fix) {
         this.yakin = fix;
    }

    public void cekObatTablet(int Paracetamol, int Panadol, int Bodrex, int Domperidone, int Amlodipine) {
        if ((Paracetamol > 0) || (Panadol > 0) || (Bodrex > 0) || (Domperidone > 0) || (Amlodipine > 0)) {
            if (Paracetamol > 0) {
                System.out.println("Paracetamol : " + Paracetamol + "buah");
            } 
            if (Panadol > 0) {
                System.out.println("Panadol : " + Panadol + "buah");
            }
            if (Bodrex > 0) {
                System.out.println("Bodrex : " + Bodrex + "buah");  
            }
            if (Domperidone > 0) {
                System.out.println("Domperidone : " + Domperidone + "buah");
            }
            if (Amlodipine > 0) {
                System.out.println("Amlodipine : " + Amlodipine + "buah");
            }
        } else {
            System.out.println("Tidak ada pesanan obat tablet");
        }
    }

    public void cekObatCair(int Termorex, int Decolsin, int Bisolvon, int Anakonidin, int Paratusin){
        if ((Termorex > 0) || (Decolsin > 0) || (Bisolvon > 0) || (Anakonidin > 0) || (Paratusin > 0)) {
            if (Termorex > 0) {
                System.out.println("Termorex : " +Termorex + "buah");
            } 
            if (Decolsin  > 0) {
                System.out.println("Decolsin  : " + Decolsin  + "buah");
            }
            if (Bisolvon > 0) {
                System.out.println("Bisolvon: " + Bisolvon + "buah");  
            }
            if (Anakonidin > 0) {
                System.out.println("Anakonidin : " + Anakonidin + "buah");
            }
            if (Paratusin> 0) {
                System.out.println("Paratusin : " + Paratusin + "buah");
            }
        } else {
            System.out.println("Tidak ada pesanan obat cair");
        }
    }

    public void cekObatSalep(int Kalmicetine, int Kalpanax, int Gentamicin, int Ketoconazole, int Lotasbat){
        if ((Kalmicetine > 0) || (Kalpanax > 0) || (Gentamicin > 0) || (Ketoconazole > 0) || (Lotasbat > 0)) {
            if (Kalmicetine > 0) {
                System.out.println("Kalmicetine : " +Kalmicetine + "buah");
            } 
            if (Kalpanax  > 0) {
                System.out.println("Kalpanax  : " + Kalpanax  + "buah");
            }
            if (Gentamicin > 0) {
                System.out.println("Gentamicin: " + Gentamicin + "buah");  
            }
            if (Ketoconazole > 0) {
                System.out.println("Ketoconazole : " + Ketoconazole + "buah");
            }
            if (Lotasbat> 0) {
                System.out.println("Lotasbat : " + Lotasbat + "buah");
            }
        } else {
            System.out.println("Tidak ada pesanan obat salep");
        }
    }

    // public boolean kembali(int pilih){
        // if (pilih == 6){

    //     }
    // }
    // public boolean yakin() {
        // Scanner scan = new Scanner(System.in);
        // int serius;
        // System.out.println(
        //         "--------------------------------------------------------------------------------------------------------");
        // System.out.println("Apakah anda mau memesan?");
        // System.out.println("1. Ya");
        // System.out.println("2.Tidak");
        // serius = scan.nextInt();
        // if (serius == 1) {
        //     return true;
        // }
        // return false;
    // }

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
            System.out.println("Masukkan pilihan obat tablet yang ingin anda pesan: ");
    }

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
            System.out.println("Masukkan pilihan obat cair yang ingin anda pesan: ");
    }

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
            System.out.println("Masukkan pilihan obat salep yang ingin anda pesan: ");
    }

    /**
     * Tempat logika Apotek Sehat Online dimasukkan
     */
    public static void apotek() {
        Scanner scan = new Scanner(System.in);
        MainApotek ma = new MainApotek();
        Invoice bill = new Invoice();

        Obat Paracetamol = new ObatTablet("Paracetamol", 7500);
        Obat Panadol = new ObatTablet("Panadol", 12000);
        Obat Bodrex = new ObatTablet("Bodrex", 11000);
        Obat Domperidone = new ObatTablet("Domperidone", 6500);
        Obat Amlodipine = new ObatTablet("Amlodipine", 26400);

        Obat Termorex = new ObatCair("Termorex", 11000);
        Obat Decolsin = new ObatCair("Decolsin", 18889);
        Obat Bisolvon = new ObatCair("Bisolvon", 57100);
        Obat Anakonidin = new ObatCair("Anakonidin", 15200);
        Obat Paratusin = new ObatCair("Paratusin", 34200);

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

            while ((jenis != 1) && (jenis != 2) && (jenis != 3) && (jenis != 4)) { // untuk pelanggan yang salah menginput jenis
                System.out.println("Anda salah menginput jenis obat, silahkan dicoba untuk menginput ulang");
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------");
                System.out.println("Masukkan pilihan jenis obat yang ingin anda pesan: ");
                jenis = scan.nextInt();
            }

            if (jenis == 1) { // obat tablet
                ma.menuTablet();
                tablet = scan.nextInt();

                while ((tablet < 1) || (tablet > 6)) { // untuk pelanggan yang salah menginput jenis
                    System.out.println("Anda salah menginput obat tablet, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Masukkan pilihan obat tablet yang ingin anda pesan: ");
                    tablet = scan.nextInt();
                }

                if (tablet == 1) {
                    System.out.println("Paracetamol");
                    
                    Paracetamol.setDeskripsi(
                            "Kandungan: \nParacetamol 500 mg\nKegunaan: \nUntuk meredakan demam dan nyeri, mengendalikan kadar gula darah dan menjaga fungsi otot.");
                    System.out.println(Paracetamol.getDeskripsi());
                    Paracetamol.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Paracetamol.setJumlah(jumlah);


                    Paracetamol.getSubTotal(Paracetamol.getHarga(), Paracetamol.getJumlah());
                    Paracetamol.isiKeranjangHarga();
                    Paracetamol.isiKeranjangjumlah();
                } else if (tablet == 2) {
                    System.out.println("Panadol");
                    
                    Panadol.setDeskripsi("Kandungan: \nParacetamol \nKegunaan: \nUntuk meredakan demam dan nyeri.");
                    System.out.println(Panadol.getDeskripsi());
                    Panadol.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Panadol.setJumlah(jumlah);


                    Panadol.getSubTotal(Panadol.getHarga(), Panadol.getJumlah());
                    Panadol.isiKeranjangHarga();
                    Panadol.isiKeranjangjumlah();
                } else if (tablet == 3) {
                    System.out.println("Bodrex");
                    
                    Bodrex.setDeskripsi(
                            "Kandungan: \nCaffeine 50 mg \nParacetamol 600 mg \nKegunaan: \nUntuk meringankan sakit kepala,sakit gigi dan menurunkan demam.");
                    System.out.println(Bodrex.getDeskripsi());
                    Bodrex.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Bodrex.setJumlah(jumlah);


                    Bodrex.getSubTotal(Bodrex.getHarga(), Bodrex.getJumlah());
                    Bodrex.isiKeranjangHarga();
                    Bodrex.isiKeranjangjumlah();
                } else if (tablet == 4) {
                    System.out.println("Domperidone");
                    
                    Domperidone.setDeskripsi(
                            "Kandungan: \nDomperidone 10 mg  \nKegunaan: \nUntuk meredakan mual dan muntah,mempercepat kontraksi usus atau lambung,serta meningkatkan produksi ASI.");
                    System.out.println(Domperidone.getDeskripsi());
                    Domperidone.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Domperidone.setJumlah(jumlah);


                    Domperidone.getSubTotal(Domperidone.getHarga(), Domperidone.getJumlah());
                    Domperidone.isiKeranjangHarga();
                    Domperidone.isiKeranjangjumlah();
                } else if (tablet == 5) {
                    System.out.println("Amlodipine");
                    
                    Amlodipine.setDeskripsi(
                            "Kandungan: \nAmlodipine 10 mg \nKegunaan: \nUntuk mengontrol tekanan darah.");
                    System.out.println(Amlodipine.getDeskripsi());
                    Amlodipine.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Amlodipine.setJumlah(jumlah);


                    Amlodipine.getSubTotal( Amlodipine.getHarga(),  Amlodipine.getJumlah());
                    Amlodipine.isiKeranjangHarga();
                    Amlodipine.isiKeranjangjumlah();
                } else if (tablet == 6) {
                    continue;
                }
            } else if (jenis == 2) { // obat cair
                ma.menuCair();
                cair = scan.nextInt();

                while ((cair < 1) || (cair > 6)) { // untuk pelanggan yang salah menginput jenis
                    System.out.println("Anda salah menginput obat cair, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Masukkan pilihan obat cair yang ingin anda pesan: ");
                    cair = scan.nextInt();
                }

                if (cair == 1) {
                    System.out.println("Termorex");
                    
                    Termorex.setDeskripsi(
                            "Kandungan: \nTiap sendok takar (5 ml) mengandung : \nParacetamol 120 mg \nPseudoephedrine HCl 7.5 mg \nGliseril guaiakoalat 25 mg \nChlorpheniramine Maleate 0.5 mg \nKegunaan: \nUntuk meringankan gejala flu.");
                    System.out.println(Termorex.getDeskripsi());
                    Termorex.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Termorex.setJumlah(jumlah);


                    Termorex.getSubTotal( Termorex.getHarga(),  Termorex.getJumlah());
                    Termorex.isiKeranjangHarga();
                    Termorex.isiKeranjangjumlah();

                } else if (cair == 2) {
                    System.out.println("Decolsin");
                    
                    Decolsin.setDeskripsi(
                            "Kandungan: \nDextromethorphan \nphenylpropanolamine \nParacetamol \nKegunaan: \nUntuk batuk dan flu.");
                    System.out.println(Decolsin.getDeskripsi());
                    Decolsin.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Decolsin.setJumlah(jumlah);


                    Decolsin.getSubTotal( Decolsin.getHarga(),  Decolsin.getJumlah());
                    Decolsin.isiKeranjangHarga();
                    Decolsin.isiKeranjangjumlah();
                } else if (cair == 3) {
                    System.out.println("Bisolvon");
                    
                    Bisolvon.setDeskripsi(
                            "Kandungan: \nBromhexine HCL 4 mg \nguaifenesin 100 mg \nKegunaan: \nUntuk meredakan batuk berdahak.");
                    System.out.println(Bisolvon.getDeskripsi());
                    Bisolvon.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Bisolvon.setJumlah(jumlah);


                    Bisolvon.getSubTotal( Bisolvon.getHarga(),  Bisolvon.getJumlah());
                    Bisolvon.isiKeranjangHarga();
                    Bisolvon.isiKeranjangjumlah();
                } else if (cair == 4) {
                    System.out.println("Anakonidin");
                    
                    Anakonidin.setDeskripsi(
                            "Kandungan: \nParacetamol 120 mg \nSuccus Liquiritae 100 mg \nPseudoephedrine HCL 7.5 mg \nguaifenesin 100 mg \nKegunaan: \nUntuk meredakan batuk dan gejala flu.");
                    System.out.println(Anakonidin.getDeskripsi());
                    Anakonidin.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Anakonidin.setJumlah(jumlah);


                    Anakonidin.getSubTotal( Anakonidin.getHarga(),  Anakonidin.getJumlah());
                    Anakonidin.isiKeranjangHarga();
                    Anakonidin.isiKeranjangjumlah();
                
                } else if (cair == 5) {
                    System.out.println("Paratusin");
                   
                    Paratusin.setDeskripsi(
                            "Kandungan: \nParacetamol 120 mg \nSuccus Liquiritae 100 mg \nPseudoephedrine HCL 7.5 mg \nNoscapine 10 mg \nCholorphenamine maleate 0.5 mg \nKegunaan: \nUntuk meringankan gejala flu.");
                    System.out.println(Paratusin.getDeskripsi());
                    Paratusin.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Paratusin.setJumlah(jumlah);


                    Paratusin.getSubTotal( Paratusin.getHarga(),  Paratusin.getJumlah());
                    Paratusin.isiKeranjangHarga();
                    Paratusin.isiKeranjangjumlah();
                } else if (cair == 6) {
                    continue;
                }
            } else if (jenis == 3) { // obat salep
                ma.menuSalep();
                salep = scan.nextInt();

                while ((salep < 1) || (salep > 6)) { // untuk pelanggan yang salah menginput jenis
                    System.out.println("Anda salah menginput obat salep, silahkan dicoba untuk menginput ulang");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------");
                    System.out.println("Masukkan pilihan obat salep yang ingin anda pesan: ");
                    salep = scan.nextInt();
                }

                if (salep == 1) {
                    System.out.println("Kalmicetine");
                    
                    Kalmicetine.setDeskripsi(
                            "Kandungan: \nChloramphenicol 20 mg \nKegunaan: \nUntuk infeksi kulit yang disebabkan oleh bakteri.");
                    System.out.println(Kalmicetine.getDeskripsi());
                    Kalmicetine.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Kalmicetine.setJumlah(jumlah);


                    Kalmicetine.getSubTotal( Kalmicetine.getHarga(),  Kalmicetine.getJumlah());
                    Kalmicetine.isiKeranjangHarga();
                    Kalmicetine.isiKeranjangjumlah();
                } else if (salep == 2) {
                    System.out.println("Kalpanax");
                    
                    Kalpanax.setDeskripsi(
                            "Kandungan: \nMiconazole nitrate 2% \nKegunaan: \nUntuk Pitiriasis versikolor, dermatofitosis, dan mikosis kulit lain.");
                    System.out.println(Kalpanax.getDeskripsi());
                    Kalpanax.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Kalpanax.setJumlah(jumlah);


                    Kalpanax.getSubTotal( Kalpanax.getHarga(),  Kalpanax.getJumlah());
                    Kalpanax.isiKeranjangHarga();
                    Kalpanax.isiKeranjangjumlah();
                } else if (salep == 3) {
                    System.out.println("Gentamicin");
                    
                    Gentamicin.setDeskripsi(
                            "Kandungan: \nGentamicin sulfate 0.1% \nKegunaan: \nUntuk pengobatan topikal infeksi primer dan sekunder pada kulit .");
                    System.out.println(Gentamicin.getDeskripsi());
                    Gentamicin.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Gentamicin.setJumlah(jumlah);


                    Gentamicin.getSubTotal( Gentamicin.getHarga(),  Gentamicin.getJumlah());
                    Gentamicin.isiKeranjangHarga();
                    Gentamicin.isiKeranjangjumlah();
                } else if (salep == 4) {
                    System.out.println("Ketoconazole");
                    
                    Ketoconazole.setDeskripsi(
                            "Kandungan: \nKetoconazole 2 % \nKegunaan: \nUntuk Infeksi dermatofita pada kulit atau kuku tangan (tidak pada kuku kaki).");
                    System.out.println(Ketoconazole.getDeskripsi());
                    Ketoconazole.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Ketoconazole.setJumlah(jumlah);


                    Ketoconazole.getSubTotal(  Ketoconazole.getHarga(),   Ketoconazole.getJumlah());
                    Ketoconazole.isiKeranjangHarga();
                    Ketoconazole.isiKeranjangjumlah();
                } else if (salep == 5) {
                    System.out.println("Lotasbat");
                    
                    Lotasbat.setDeskripsi(
                            "Kandungan: \nClobetasol propionate 0.05% \nKegunaan: \nUntuk Pengobatan jangka pendek Dermatosis yang resisten.");
                    System.out.println(Lotasbat.getDeskripsi());
                    Lotasbat.caraPakai();
                    System.out.print("Masukkan jumlah :");
                    int jumlah = scan.nextInt();
                    Lotasbat.setJumlah(jumlah);


                    Lotasbat.getSubTotal(  Lotasbat.getHarga(),   Lotasbat.getJumlah());
                    Lotasbat.isiKeranjangHarga();
                    Lotasbat.isiKeranjangjumlah();
                } else if (salep == 5) {
                } else if (salep == 6) {
                    continue;
                }
            } else if (jenis == 4){
                int duit = Paracetamol.isiKeranjangHarga() + Panadol.isiKeranjangHarga() + Bodrex.isiKeranjangHarga() + Domperidone.isiKeranjangHarga() + Amlodipine.isiKeranjangHarga() + Termorex.isiKeranjangHarga() + Decolsin.isiKeranjangHarga() + Bisolvon.isiKeranjangHarga()+ Anakonidin.isiKeranjangHarga()+Paratusin.isiKeranjangHarga()+Kalmicetine.isiKeranjangHarga()+Kalpanax.isiKeranjangHarga()+Gentamicin.isiKeranjangHarga()+Ketoconazole.isiKeranjangHarga()+Lotasbat.isiKeranjangHarga();
    
                int banyak = Paracetamol.isiKeranjangjumlah() + Panadol.isiKeranjangjumlah() + Bodrex.isiKeranjangjumlah() + Domperidone.isiKeranjangjumlah() + Amlodipine.isiKeranjangjumlah() + Termorex.isiKeranjangjumlah() + Decolsin.isiKeranjangjumlah() + Bisolvon.isiKeranjangjumlah()+ Anakonidin.isiKeranjangjumlah()+Paratusin.isiKeranjangjumlah()+Kalmicetine.isiKeranjangjumlah()+Kalpanax.isiKeranjangjumlah()+Gentamicin.isiKeranjangjumlah()+Ketoconazole.isiKeranjangjumlah()+Lotasbat.isiKeranjangjumlah();

                ma.cekObatTablet(Paracetamol.isiKeranjangjumlah(), Panadol.isiKeranjangjumlah(), Bodrex.isiKeranjangjumlah(), Domperidone.isiKeranjangjumlah(), Amlodipine.isiKeranjangjumlah());

                ma.cekObatCair(Termorex.isiKeranjangjumlah(), Decolsin.isiKeranjangjumlah(), Bisolvon.isiKeranjangjumlah(), Anakonidin.isiKeranjangjumlah(), Paratusin.isiKeranjangjumlah());

                ma.cekObatSalep(Kalmicetine.isiKeranjangjumlah(), Kalpanax.isiKeranjangjumlah(), Gentamicin.isiKeranjangjumlah(), Ketoconazole.isiKeranjangjumlah(), Lotasbat.isiKeranjangjumlah());

                bill.cetakInvoice(duit, banyak);

                ma.setYakin(false);
            }
        } while(ma.yakin);

        
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
