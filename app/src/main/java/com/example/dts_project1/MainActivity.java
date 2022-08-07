package com.example.dts_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static char operator;
    double hasil;
    EditText edt1, edt2;
    double operan1, operan2;
    Button btn_tambah, btn_kurang, btn_bagi, btn_kali, btn_hitung, btn_hapus;
    TextView tampilHasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edt1 = findViewById(R.id.edt1);
        this.edt2 = findViewById(R.id.edt2);
        this.btn_tambah = findViewById(R.id.btn_tambah);
        this.btn_kurang = findViewById(R.id.btn_kurang);
        this.btn_kali = findViewById(R.id.btn_kali);
        this.btn_bagi = findViewById(R.id.btn_bagi);
        this.btn_hitung = findViewById(R.id.btn_hitung);
        btn_hapus = findViewById(R.id.btn_hapus);
        this.tampilHasil = findViewById(R.id.hasil);


        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '+';
                operan1 = Double.parseDouble(edt1.getText().toString());
                operan2 = Double.parseDouble(edt2.getText().toString());
            }
        });

        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '-';
                operan1 = Double.parseDouble(edt1.getText().toString());
                operan2 = Double.parseDouble(edt2.getText().toString());
            }
        });

        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '*';
                operan1 = Double.parseDouble(edt1.getText().toString());
                operan2 = Double.parseDouble(edt2.getText().toString());
            }
        });

        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '/';
                operan1 = Double.parseDouble(edt1.getText().toString());
                operan2 = Double.parseDouble(edt2.getText().toString());
            }
        });

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil = hitung(operator,operan1,operan2);
                tampilHasil.setText(String.valueOf(hasil));
            }
        });

        btn_hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilHasil.setText("0");
                edt1.setText("");
                edt2.setText("");
                edt1.requestFocus();
            }
        });

    }

    private double hitung(char operator, double angka1, double angka2) {
        switch (operator) {
            case '+' : {
                return angka1 + angka2;
            }
            case '-' : {
                return angka1 - angka2;
            }
            case '*' : {
                return angka1 * angka2;
            }
            case '/' : {
                return angka1 / angka2;
            }
        }
        return 0;
    }
}