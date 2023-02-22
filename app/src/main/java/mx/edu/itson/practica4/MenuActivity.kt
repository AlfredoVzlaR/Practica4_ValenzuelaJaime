package mx.edu.itson.practica4

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.btnAntojitos) as Button
        var btnEspecialidades: Button = findViewById(R.id.especialidades) as Button
        var btnCombinations: Button = findViewById(R.id.combinations) as Button
        var btnTortas: Button = findViewById(R.id.tortas) as Button
        var btnSopas: Button = findViewById(R.id.sopas)
        var btnDrinks: Button = findViewById(R.id.drinks)

        btnAntojitos.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }
        btnEspecialidades.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }
        btnCombinations.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Combinations")
            startActivity(intent)
        }
        btnTortas.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)
           

        }
        btnSopas.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)
      

        }
        btnDrinks.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Drinks")
            startActivity(intent)

        }
    }
}