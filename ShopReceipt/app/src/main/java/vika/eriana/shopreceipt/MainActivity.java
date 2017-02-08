package vika.eriana.shopreceipt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA = "vika.eriana.shopreceipt.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showprice (View view) {
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);
        EditText input4 = (EditText) findViewById(R.id.input4);
        EditText input5 = (EditText) findViewById(R.id.input5);
        EditText input6 = (EditText) findViewById(R.id.input6);
        double inp1, inp2, inp3, inp4, inp5, inp6;

        String hasil = "";
        inp1 = Double.parseDouble(input1.getText().toString());
        inp2 = Double.parseDouble(input2.getText().toString());
        inp3 = Double.parseDouble(input3.getText().toString());
        inp4 = Double.parseDouble(input4.getText().toString());
        inp5 = Double.parseDouble(input5.getText().toString());
        inp6 = Double.parseDouble(input6.getText().toString());

        hasil =  "Komik       :" + (inp1 * 20000) + "\n";
        hasil += "Majalah     :" + (inp2 * 25000) + "\n";
        hasil += "Resep       :" + (inp3 * 10000) + "\n";
        hasil += "Koran       :" + (inp4 * 3000) + "\n";
        hasil += "Novel       :" + (inp5 * 45000) + "\n";
        hasil += "TTS         :" + (inp6 * 5000) + "\n";
        hasil +="Total        :"+((inp1 * 20000)+(inp2 * 25000)+(inp3 * 10000)+(inp4 * 3000)+(inp5 * 45000)+(inp6 * 5000))+"\n";

        TextView result = (TextView) findViewById(R.id.result);
        result.setText(hasil);
        Intent intent = new Intent(this, showprice.class);
        intent.putExtra(EXTRA, result.getText().toString());
        startActivity(intent);
    }
}
