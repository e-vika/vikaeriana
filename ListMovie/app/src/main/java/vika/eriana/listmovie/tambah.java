package vika.eriana.listmovie;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class tambah extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);


        Spinner spinner = (Spinner) findViewById(R.id.pilihrating);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pil_rating, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    public void addFilm(View view){
        String tittle = ((EditText) findViewById(R.id.inpjudul)).getText().toString();
        int year = Integer.parseInt(((EditText) findViewById(R.id.year)).getText().toString());
        double rating = Double.parseDouble(((Spinner)findViewById(R.id.pilihrating)).getSelectedItem().toString());
        String description = (((EditText)findViewById(R.id.inpdeskripsi)).getText().toString());

        Movie movie = new Movie(tittle,description,rating,year);

        Intent intent = new Intent();
        intent.putExtra("listmovie.result", movie);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
