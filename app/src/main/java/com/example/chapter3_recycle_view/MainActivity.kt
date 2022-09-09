package com.example.chapter3_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val listStudentItem = arrayListOf<ListStudent>(
//            ListStudent("Raynaldi", "20104042", R.drawable.ic_launcher_foreground),
//            ListStudent("Zulfikar", "20104043", R.drawable.ic_launcher_foreground),
//            ListStudent("Singgih", "20104044", R.drawable.ic_launcher_foreground),
//            ListStudent("Budi", "20104045", R.drawable.ic_launcher_foreground),
//            ListStudent("Hartono", "20104046", R.drawable.ic_launcher_foreground),
//        )

        val listProvince = arrayListOf<ProvinceItems>(
            ProvinceItems("Kalimantan Barat", "Potianak", R.drawable.kalimantan_barat_rumah_panjang),
            ProvinceItems("Kalimantan Selatan", "Banjarbaru", R.drawable.kalimantan_selatan_rumah_bubungan_tinggi),
            ProvinceItems("Kalimantan Tengah", "Palangkaraya", R.drawable.kalimantan_tengah_rumah_betang),
            ProvinceItems("Kalimantan Timur", "Samarinda", R.drawable.kalimantan_timur_rumah_lamin),
            ProvinceItems("Kalimantan Utara", "Tanjung Selor", R.drawable.kalimantan_utara_rumah_baloy),
            ProvinceItems("Maluku", "Ambon", R.drawable.maluku_rumah_baileo),
            ProvinceItems("Maluku Utara", "Soffli", R.drawable.maluku_utara_rumah_sasadu),
            ProvinceItems("Nusa Tenggara Barat", "Mataram", R.drawable.nusa_tenggara_barat_rumah_dalam_loka),
            ProvinceItems("Nusa Tenggara Timur", "Kupang", R.drawable.nusa_tenggara_timur_rumah_musalaki),
            ProvinceItems("Papua", "Jayapura", R.drawable.papua_rumah_honai),

            )

//        var adapterStudent = StudentAdapter(listStudentItem)
        var adapterProvince = ProvinceAdapter(listProvince)
        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        studentList.adapter = adapterProvince
        studentList.layoutManager = lm
    }
}