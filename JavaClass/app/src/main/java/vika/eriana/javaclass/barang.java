package vika.eriana.javaclass;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class barang {
    public static final int buku=1;
    public static final int non_buku=2;

    private String nama;
    private int category;
    private int harga;

    public barang(String nama, int category, int harga) {
        this.nama = nama;
        this.setCategory(category);
        this.harga = harga;
    }

    @Override
    public String toString(){
        return nama + " | " +this.getStringCategory() + " | "+this.harga + "\n";
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama()
    {
        return this.nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getCategory() {
        return category;
    }

    public String getStringCategory(){
        if (category == 1)
            return "buku";
        else
            return "non buku";
    }

    public void setCategory(int category) {
        if (category !=1 && category !=2)
            this.category = 2;
        else
            this.category = category;
    }
}
