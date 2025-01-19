public class Siswa {
    private String nama;
    private int usia;
    private double nilai;

    // Constructor
    public Siswa(String nama, int usia, double nilai) {
        this.nama = nama;
        setUsia(usia); // Menggunakan setter untuk validasi
        setNilai(nilai); // Menggunakan setter untuk validasi
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk usia
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        if (usia > 0) {
            this.usia = usia;
        } else {
            System.out.println("Usia harus lebih dari 0.");
        }
    }

    // Getter dan Setter untuk nilai
    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus berada antara 0 dan 100.");
        }
    }
}