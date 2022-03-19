package binar.andlima.harijumat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen3.*

class Screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        var nama1 = intent.getStringExtra("nama")
        untuk_nama.text = nama1

        val usia1 = intent.getStringExtra("usia")
        untuk_usia.text = usia1

        val alamat1 = intent.getStringExtra("alamat")
        untuk_alamat.text = alamat1

        val pekerjaan1 = intent.getStringExtra("pekerjaan")
        untuk_pekerjaan.text = pekerjaan1


        go_4.setOnClickListener {


            val pindah3 = Intent(this, Screen4::class.java)
            pindah3.putExtra("nama", nama1)
            startActivity(pindah3)
        }
    }
}