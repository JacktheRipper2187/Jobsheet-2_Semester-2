public class BukuMain {
    public static void main(String[] args) {
     
        Buku buku1 = new Buku("Kimetsu no Yaiba", "Koyoharu Gotoge", "Aniplex", 20000, 5);

        System.out.println("Informasi Buku:");
        System.out.println("Nama: " + buku1.nama);
        System.out.println("Pengarang: " + buku1.pengarang);
        System.out.println("Penerbit: " + buku1.penerbit);
        System.out.println("Harga Satuan: " + buku1.hargaSatuan);
        System.out.println("Jumlah: " + buku1.jumlah);

        int hargaTotal = buku1.hitungHargaTotal();
        int diskon = buku1.hitungDiskon();
        int hargaBayar = buku1.hitungHargaBayar();

        System.out.println("\nPerhitungan:");
        System.out.println("Harga Total: " + hargaTotal);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Bayar: " + hargaBayar);
    }
}
