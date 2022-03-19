package binar.andlima.harijumat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen1.*

class Screen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        go_2.setOnClickListener {
            val pindah1 = Intent(this, Screen2::class.java)
            startActivity(pindah1)
        }
    }
}