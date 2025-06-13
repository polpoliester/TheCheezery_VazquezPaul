package vazquez.paul.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnCold: Button = findViewById(R.id.button_cold_drinks)
        val btnHot: Button = findViewById(R.id.button_hot_drinks)
        val btnSweets: Button = findViewById(R.id.sweets)
        val btnSalties: Button = findViewById(R.id.salties)
        val btnCombos: Button = findViewById(R.id.combos)
        val btnCustom: Button = findViewById(R.id.customizable)


        btnCold.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "coldDrinks")
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "hotDrinks")
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "sweets")
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "salties")
            startActivity(intent)
        }

        btnCombos.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "combos")
            startActivity(intent)
        }

        btnCustom.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "customizable")
            startActivity(intent)
        }
    }
}