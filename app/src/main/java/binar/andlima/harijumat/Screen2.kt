package binar.andlima.harijumat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        go_3.setOnClickListener {
            val nama1 = masukan_nama.text.toString()

            val pindah2 = Intent(this, Screen3::class.java)
            pindah2.putExtra("nama", nama1)
            startActivity(pindah2)
        }
    }
}