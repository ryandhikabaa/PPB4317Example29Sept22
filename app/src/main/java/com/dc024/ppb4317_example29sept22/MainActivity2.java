package com.dc024.ppb4317_example29sept22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private ListView lvBahasa;
    String bhsprogram [] = {"C++", "Visual Basic", "Delphi",
            "Ruby", "Python", "Ruby", "Pascal", "Clipper",
            "Matlab", "Pearl", "Javascript", "Kotlin", "PHP", "SQL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lvBahasa = findViewById(R.id.lvBahasa);
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity2.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,bhsprogram);
        lvBahasa.setAdapter(arrayAdapter);

        lvBahasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity2.this, "Anda memilih "+ bhsprogram[i],
                        Toast.LENGTH_LONG).show();
            }
        });

    }


}