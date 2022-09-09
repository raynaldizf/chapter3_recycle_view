package com.example.chapter3_recycle_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudentItem = arrayListOf(
            ListStudent("Raynaldi", "20104042", R.drawable.ic_launcher_foreground),
            ListStudent("Zulfikar", "20104043", R.drawable.ic_launcher_foreground),
            ListStudent("Singgih", "20104044", R.drawable.ic_launcher_foreground),
            ListStudent("Budi", "20104045", R.drawable.ic_launcher_foreground),
            ListStudent("Hartono", "20104046", R.drawable.ic_launcher_foreground),
        )

//        val listProvince = arrayListOf(
//            ProvinceItems("Bali", "Denpasar", R.drawable.bali_gapura_candi_bentar),
//            ProvinceItems("Banten", "Serang", R.drawable.banten_rumah_baduy),
//            ProvinceItems("Bengkulu", "Bengkulu", R.drawable.bengkulu_rumah_bubungan_lima),
//            ProvinceItems("DI Yogyakarta", "Yogyakarta", R.drawable.di_yogyakarta_rumah_joglo),
//            ProvinceItems("DKI Jakarta", "Jakarta", R.drawable.dki_jakarta_rumah_kebaya),
//            ProvinceItems("Gorontalo", "Gorontalo", R.drawable.gorontalo_rumah_dulohupa),
//            ProvinceItems("Jambi", "Jambi", R.drawable.jambi_rumah_panggung),
//            ProvinceItems("Jawa Barat", "Bandung", R.drawable.jawa_barat_rumah_kasepuhan),
//            ProvinceItems("Jawa Tengah", "Semarang", R.drawable.jawa_tengah_rumah_joglo),
//            ProvinceItems("Jawa TImur", "Surabaya", R.drawable.jawa_timur_rumah_joglo),
//            ProvinceItems("Kalimantan Barat", "Potianak", R.drawable.kalimantan_barat_rumah_panjang),
//            ProvinceItems("Kalimantan Selatan", "Banjarbaru", R.drawable.kalimantan_selatan_rumah_bubungan_tinggi),
//            ProvinceItems("Kalimantan Tengah", "Palangkaraya", R.drawable.kalimantan_tengah_rumah_betang),
//            ProvinceItems("Kalimantan Timur", "Samarinda", R.drawable.kalimantan_timur_rumah_lamin),
//            ProvinceItems("Kalimantan Utara", "Tanjung Selor", R.drawable.kalimantan_utara_rumah_baloy),
//            ProvinceItems("Kepulauan Riau", "Tanjung Pinang", R.drawable.kepulauan_riau_rumah_atap_limas_potong),
//            ProvinceItems("Lampung", "Bandar Lampung", R.drawable.lampung_rumah_nuwo_sesat),
//            ProvinceItems("Maluku", "Ambon", R.drawable.maluku_rumah_baileo),
//            ProvinceItems("Maluku Utara", "Soffli", R.drawable.maluku_utara_rumah_sasadu),
//            ProvinceItems("Nusa Tenggara Barat", "Mataram", R.drawable.nusa_tenggara_barat_rumah_dalam_loka),
//            ProvinceItems("Nusa Tenggara Timur", "Kupang", R.drawable.nusa_tenggara_timur_rumah_musalaki),
//            ProvinceItems("Papua Barat", "Manokwari", R.drawable.papua_barat_rumah_mod_aki_aksa),
//            ProvinceItems("Papua", "Jayapura", R.drawable.papua_rumah_honai),
//            ProvinceItems("Papua Selatan", "Merauke", R.drawable.papua_selatan),
//            ProvinceItems("Riau", "Pekanbaru", R.drawable.riau_rumah_adat_selaso_jatuh),
//            ProvinceItems("Papua Tengah", "Nabire", R.drawable.rumah_adat_papua_tengah_karapao),
//            ProvinceItems("Sulawesi Selatan", "Makassar", R.drawable.rumah_adat_sulawesi_selatan),
//            ProvinceItems("Sumatera Utara", "Medan", R.drawable.rumah_bolon_sumatera_utara),
//            ProvinceItems("Aceh", "Banda Aceh", R.drawable.rumah_krong_bade_aceh),
//            ProvinceItems("Bangka Belitung", "Pangkal Pinang", R.drawable.rumah_rakit_bangka_belitung),
//            ProvinceItems("Sulawesi Barat", "Mamuju", R.drawable.sulawesi_barat_rumah_boyang),
//            ProvinceItems("Sulawesi Tengah", "Palu", R.drawable.sulawesi_tengah_rumah_souraja),
//            ProvinceItems("Sulawesi Tenggara", "Kendari", R.drawable.sulawesi_tenggara_rumah_buton),
//            ProvinceItems("Sulawesi Utara", "Manado", R.drawable.sulawesi_utara_rumah_walewangko),
//            ProvinceItems("Sumatera Barat", "Padang", R.drawable.sumatera_barat_rumah_gadang),
//            ProvinceItems("Sumatera Selatan", "Palembang", R.drawable.sumatera_selatan_rumah_limas),
//            )

        var adapterStudent = StudentAdapter(listStudentItem)
//        val adapterProvince = ProvinceAdapter(listProvince)
        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        studentList.adapter = adapterStudent
//        studentList.adapter = adapterProvince
        studentList.layoutManager = lm

        adapterStudent.onClick = {
            var pindah = Intent(this, DetailStudentActivity::class.java)
            pindah.putExtra("detailStudent", it)
            startActivity(pindah)
        }
    }
}