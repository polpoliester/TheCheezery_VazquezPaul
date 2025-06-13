package vazquez.paul.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById<Button>(R.id.button_get_started) as Button
        button.setOnClickListener {
            //Moverse a pantalla Register
            var intent: Intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}