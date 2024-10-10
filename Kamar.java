package reservasihotel;

public class Kamar {
    private String tipeKamar;
    private double harga;
    private boolean tersedia;

    public Kamar(String tipeKamar, double harga) {
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.tersedia = true;  // Kamar defaultnya tersedia
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public double getHarga() {
        return harga;
    }

    public boolean tersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    @Override
    public String toString() {
        return "Tipe: " + tipeKamar + ", Harga: Rp " + harga + ", Tersedia: " + (tersedia ? "Ya" : "Tidak");
    }
}
