package com.example.thebestone.khlreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AktifitasUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktifitas_utama);

        final EditText editNamaPengguna;
        final EditText editSandiPengguna;
        Button btnLogin;

        editNamaPengguna = findViewById(R.id.editNamaP);
        editSandiPengguna = findViewById(R.id.editSandiP);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pengguna = editNamaPengguna.getText().toString();
                String sandi = editSandiPengguna.getText().toString();

                if (pengguna.equals("kholil") && sandi.equals("kholil123")) {
                    Intent intent = new Intent(AktifitasUtama.this, AktifitasReferensi.class);
                    intent.putExtra("user", pengguna);
                    startActivity(intent);
                } else if(pengguna.equals("admin") && sandi.equals("admin")){
                    Intent intent = new Intent(AktifitasUtama.this, AktifitasReferensi.class);
                    intent.putExtra("user", pengguna);
                    startActivity(intent);
                } else {
                    Toast.makeText(AktifitasUtama.this, "Upss, Pengguna atau sandi tidak dikenal", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
