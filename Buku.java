public class Buku {
String nama,pengarang,penerbit;
int hargaSatuan,jumlah;


Buku(){

}
Buku(String nm, String pg, String pb, int hs, int jm){
    nama = nm;
    pengarang = pg;
    penerbit = pb;
    hargaSatuan = hs;
    jumlah = jm;
}

public int hitungHargaTotal(){
    return hargaSatuan * jumlah;
}

public int hitungDiskon(){
    int hargaTotal = hitungHargaTotal();
    if (hargaTotal >100000 ){
        return hargaTotal * 10/100;
    }else if (hargaTotal >= 50000){
        return hargaTotal * 5/100;
    } else{
        return 0;
    }

}

public int hitungHargaBayar(){
    return hitungHargaTotal() - hitungDiskon();

}

}