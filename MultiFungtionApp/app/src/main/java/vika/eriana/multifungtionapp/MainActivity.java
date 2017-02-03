package vika.eriana.multifungtionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA = "vika.eriana.multifungtionapp.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showmessage(View view){
        // contoh penggunaan implicit intent
        Intent intent = new Intent(this, showmessage.class);
        TextView txtmessage = (TextView) findViewById(R.id.txt_message);
        intent.putExtra(EXTRA,txtmessage.getText().toString());
        startActivity(intent);
    }

    public void openBrowser(View view) {
        Intent intent = new Intent(this, IntentExecutor.class);
        intent.putExtra(EXTRA, "Browser");
        startActivity(intent);
    }

    public void openPhone(View view){
        Intent intent = new Intent(this, IntentExecutor.class);
        intent.putExtra(EXTRA, "Phone");
        startActivity(intent);
    }

    public void openMap(View view){
        Intent intent = new Intent(this, IntentExecutor.class);
        intent.putExtra(EXTRA, "Map");
        startActivity(intent);
    }
}
