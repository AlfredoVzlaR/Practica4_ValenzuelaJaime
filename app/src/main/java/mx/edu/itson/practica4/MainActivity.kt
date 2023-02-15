package mx.edu.itson.practica4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_get_started)

        button.setOnClickListener {
            var intent: Intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}