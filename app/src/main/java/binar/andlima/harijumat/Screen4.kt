package binar.andlima.harijumat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen3.*
import kotlinx.android.synthetic.main.activity_screen4.*

class Screen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        val nama1 = intent.getStringExtra("nama")

        go.setOnClickListener {
            val usia1 = masukan_usia.text.toString().toInt()
            val alamat1 = masukan_alamat.text.toString()
            val pekerjaan1 = masukan_Pekerjaan.text.toString()

            var usia2 = ""
            if (usia1 % 2 == 0){
                usia2 = "$usia1, bernilai genap"
            } else {
                usia2 = "$usia1, bernilai ganjil"
            }

            val pindah4 = Intent(this, Screen3::class.java)
            pindah4.putExtra("nama", nama1)
            pindah4.putExtra("usia", usia2)
            pindah4.putExtra("alamat", alamat1)
            pindah4.putExtra("pekerjaan", pekerjaan1)
            startActivity(pindah4)
        }
    }
}