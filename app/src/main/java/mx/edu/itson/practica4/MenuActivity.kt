package mx.edu.itson.practica4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.btnAntojitos) as Button

        btnAntojitos.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            startActivity(intent)
        }
    }
}