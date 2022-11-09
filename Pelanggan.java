
/**
 * Merepresentasikan Pelanggan yaitu user yang sedang
 * menggunakan layanan Apotek Sehat berbasis Online
 *
 * @author Sofia, Putri Ulfayani
 * @version 9.11.2022
 * @since 3.11.2022
 */
public class Pelanggan {
    private String nama;
    private String ktp;

    /**
     * Constructor untuk membuat Pelanggan baru tanpa parameter
     */
    public Pelanggan() {
    }

    /**
     * Constructor untuk membuat Pelanggan baru dengan parameter
     * 
     * @param nama nama dari pelanggan
     * @param ktp  ktp dari pelanggan
     */
    public Pelanggan(String nama, String ktp) {
        this.nama = nama;
        this.ktp = ktp;
    }

    /**
     * Method ini berfungsi untuk mengembalikan nama dari pelanggan
     *
     * @return nama String yang merepresentasikan nama pelanggan
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Method ini berfungsi untuk menetapkan nama dari pelanggan
     *
     * @param namabaru nama baru dari pelanggan
     */
    public void setNama(String namabaru) {
        this.nama = namabaru;
    }

    /**
     * Method ini berfungsi untuk mengembalikan ktp dari pelanggan
     *
     * @return ktp String yang merepresentasikan ktp pelanggan
     */
    public String getKtp() {
        return this.ktp;
    }

    /**
     * Method ini berfungsi untuk menetapkan ktp dari pelanggan
     *
     * @param ktpbaru ktp baru dari pelanggan
     */
    public void setKtp(String ktpbaru) {
        this.ktp = ktpbaru;
    }
}
