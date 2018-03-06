package com.example.thebestone.khlreference;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.zip.Inflater;

/**
 * Created by thebestone on 28/02/18.
 */

public class AktifitasReferensi extends AppCompatActivity{

    ImageView img1, img2, img3, img4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actifitas_referensi);

//        ambil data yang dikirim oleh aktifitas login.
        String user = getIntent().getStringExtra("user");
//        menampilakan pesan untuk menyapa user berdasarkan data yang dikirim dari aktifias sebelumnya
        Toast.makeText(this, "Hi, " + user + " Selemat Datang!", Toast.LENGTH_SHORT).show();

//        inisialisasi
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);


//        ketika image di klik
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                memanggil alert dialog
                showReference("Tayammum", tayammum);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                memanggil alert dialog
                showReference("Wudhu", wudhu);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                memanggil alert dialog
                showReference("Sholat", sholat);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                memanggil alert dialog
                showReference("Tentang Saya", about);
            }
        });

    }


//    membuat menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        mengambil menu dari folder mnu
        getMenuInflater().inflate(R.menu.menu_referensi, menu);

        return super.onCreateOptionsMenu(menu);
    }

//    kejadian ketika menu di klik
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.action_tentang) {
//            menampilkan alert dialog
            AlertDialog.Builder alert = new AlertDialog.Builder(this); // membuat objek aler dialog
            alert.setView(R.layout.app_version); //memasukkan tampilan dari laout kedalam alert dialog
            alert.setPositiveButton("Close", null); // membuat tombol close
            alert.create().show(); // menampilakan alert dialog
        }

        return true;
    }


//    alert dialog, berfungsi untuk menampilkan pesan dengan menggunakan kotak
//    alert dialoh dibuat didalam fungsi agar tidah dilakukan perkodingan ulang
//    agar alet dialog dapat digunakan oleh lebih dari satu kali, fungsi diberikan parameter
//    alert akan mengambil data dari parameter yang ada

    public void showReference(String judul, String pesan){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setCancelable(false); // mengeset agar tidak dapat di cancel
        alert.setTitle(judul); // mengeset judul
        alert.setMessage(pesan); // mengeset pesan
        alert.setPositiveButton("Oke", null); // membuat tobol oke
        alert.create().show(); // menapilkan alert
    }


    //variable untuk menyipan data dari referensi


//    data tayammu
    String tayammum =
            "Urutan Tayamum :\n" +
            "1. Membaca basmalah\n" +
            "2. Tempelkan kedua telapak tangan dengan \n" +
            "3. merengganggkan jari pada tanah atau debu\n" +
            "4. Angkat tangan mu dan tiup kedua telapak tangan yang sudah menempel pada debu, atau usapkan pada pakaian secara perlahan. ( Jika meniup, tiuplah kearah lain dari tempat mengambil debu )\n" +
            "5. Baca do’a atau niat tayamum.\n" +
            "6. Usapkan debu pada wajah.\n" +
            "7. Usapkan debu pada telapak tangan.\n" +
            "8. Ambil debu lagi dan lakukan seperti langkah ke 3 diatas.\n" +
            "Usapkan debu ke lengan kanan dan kiri.";

//    data wudhu
    String wudhu =
            "Urutan wudhu:\n" +
            "1. Mencuci / membasuh kedua telapak tangan tiga kali sambil membaca basmalah.\n" +
            "2. Membersihkan mulut dan lubang hidung, masing-masing sebanyak tiga kali.\n" +
            "3. Membasuh muka sebanyak tiga kali sambil mengucapkan doa niat wudhu.\n" +
            "4. Mencuci / membersihkan tangan kanan dan kiri, mulai dari ujung jari hingga pangkal / batas siku, masing-masing sebanyak tiga kali.\n" +
            "5. Mengusap kepala mulai dari dahi hingga batas rambut bagian atas sebanyak tiga kali.\n" +
            "6. Menyapu / membersihkan kedua telinga mulai bagian daun telinga bawah dan menuju bagian atas, sebanyak tiga kali.\n" +
            "7. Mencuci / membersihkan kaki kanan dan kiri, mulai dari ujung jari merata hingga mata kaki, masing-masing sebanyak tiga kali.\n" +
            "8. Membaca doa setelah wudhu.";

//    data sholat
    String sholat =
            "Urutan sholat:\n" +
            "1. Niat\n" +
            "2. Berdiri menghadap kiblat\n" +
            "3. Takbiratul ikhram\n" +
            "4. Membaca Al-fatihah\n" +
            "5. Ruku\n" +
            "6. Ihtidal\n" +
            "7. Sujud\n" +
            "8. Duduk diantara dua sujud\n" +
            "9. Duduk tasyahud (tahiyat) akhir\n" +
            "10. Salam.";

//    data profile
    String about =
            "Nama    : Khalilurrahman\n" +
            "NIM     : 15112100\n" +
            "Jurusan : TAGK\n" +
            "TTL     : Balikpapan, 16 Des 96";

}
