package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.roomdatabase.activity.DetailActivity;

public class MainActivity extends AppCompatActivity {

    // BUTTON
    Button update;
    Button delete;

    // EDIT TEXT
    EditText Nama;
    EditText NIM;
    EditText Kejuruan;
    EditText Alamat;

    String GetNama;
    String GetNIM;
    String GetKejuruan;
    String GetAlamat;


private  EditText Nama,

    Button btRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRoom = findViewById(R.id.btRoom);

        btRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
