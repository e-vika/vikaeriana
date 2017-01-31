package vika.eriana.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public barang [] arrBarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);


        showString = "Manipulasi Class Java Android:";
        addSeparator();

        initBarang();
        showString += arrBarang[5].toString();
        addSeparator();
        showString += arrBarang[8].toString();
        showText.setText(showString);
    }
    public void addSeparator()
    {
        showString += "\n---------------------------------\n";
    }

    public void initBarang(){
        arrBarang[0] = new barang("komik",1,15000);
        arrBarang[1] = new barang("novel",1,50000);
        arrBarang[2] = new barang("kamus",1,25000);
        arrBarang[3] = new barang("koran",2,3000);
        arrBarang[4] = new barang("majalah",2,45000);
        arrBarang[5] = new barang("resep masak",1,20000);
        arrBarang[6] = new barang("tts",2,10000);
        arrBarang[7] = new barang("panduan",1,1000);
        arrBarang[8] = new barang("lala",2,3000);
        arrBarang[9] = new barang("tabloit",2,20000);
    }
}
