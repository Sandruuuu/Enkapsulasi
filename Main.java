public class Main {
    public static void main(String[] args) {
        // Membuat objek Siswa
        Siswa siswa1 = new Siswa("Budi", 15, 85.5);
        
        // Menampilkan informasi siswa
        System.out.println("Nama: " + siswa1.getNama());
        System.out.println("Usia: " + siswa1.getUsia());
        System.out.println("Nilai: " + siswa1.getNilai());

        // Mengubah usia dan nilai
        siswa1.setUsia(17);
        siswa1.setNilai(90.0);

        // Menampilkan informasi siswa setelah diubah
        System.out.println("\nSetelah diubah:");
        System.out.println("Nama: " + siswa1.getNama());
        System.out.println("Usia: " + siswa1.getUsia());
        System.out.println("Nilai: " + siswa1.getNilai());

        // Menguji validasi
        siswa1.setUsia(-5); // Usia tidak valid
        siswa1.setNilai(105); // Nilai tidak valid
    }
}