package vika.eriana.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class transaksi {
    private ArrayList<barang> Listbarang = new ArrayList<>();

    public void addbarang(barang Barang){
        this.Listbarang.add(Barang);
    }

    public int totaltransaksi(){
        int hasil=0;
        for (int i=0; i< Listbarang.size(); i++){
            hasil += Listbarang.get(i).getHarga();
        }
        return hasil;
    }
    public String printtransaksi(){
        String text = "Barang yang dibeli pada transaksi ini adalah :\n";
        text += "-------------------------------------------------\n";
        for (int i=0; i<Listbarang.size(); i++){
            text +=Listbarang.get(i).toString();
        }
        text +="-------------------------------------------------\n";
        text +=" Total Pembelian:"+totaltransaksi()+"\n";
        text +="-------------------------------------------------\n";
        return text;
    }

    public double averagetransaksi(){
        double hasil=0;
        for (int i=0; i< Listbarang.size(); i++){
            hasil += Listbarang.get(i).getHarga();
        }
        hasil = hasil/Listbarang.size();

        return hasil;
    }
    public String maxbarang(){
        barang max;
        max = Listbarang.get(0);
        for (int i=0; i<Listbarang.size(); i++){
            if (Listbarang.get(i).getHarga()>max.getHarga()){
                max =Listbarang.get(i);
            }
        }

        String namaBarang=max.getNama();
        String text = "Barang termahal pada transaksi adalah : "+namaBarang;
        return text;
    }
}
