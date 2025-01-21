import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data siswa
        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia siswa: ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan nilai siswa: ");
        double nilai = scanner.nextDouble();

        // Membuat objek Siswa
        Siswa siswa = new Siswa(nama, usia, nilai);

        // Menampilkan data siswa
        System.out.println("Data Siswa:");
        System.out.println("Nama: " + siswa.getNama());
        System.out.println("Usia: " + siswa.getUsia());
        System.out.println("Nilai: " + siswa.getNilai());

        // Mengubah usia
        System.out.print("Ubah usia siswa: ");
        int usiaBaru = scanner.nextInt();
        siswa.setUsia(usiaBaru);

        // Mengubah nilai
        System.out.print("Ubah nilai siswa: ");
        double nilaiBaru = scanner.nextDouble();
        siswa.setNilai(nilaiBaru);

        // Menampilkan data siswa yang telah diubah
        System.out.println("Data Siswa Setelah Diubah:");
        System.out.println("Nama: " + siswa.getNama());
        System.out.println("Usia: " + siswa.getUsia());
        System.out.println("Nilai: " + siswa.getNilai());

        scanner.close();
    }
}
