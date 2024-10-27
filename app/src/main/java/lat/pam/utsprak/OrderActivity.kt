package lat.pam.utsprak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// Terima data dari intent
        val foodName = intent.getStringExtra("FOOD_NAME") ?: "Default Food"
        val foodDesc = intent.getStringExtra("FOOD_DESC") ?: "Default Description"
        val foodImage = intent.getIntExtra("FOOD_IMAGE", 0)

        val etServings = findViewById<EditText>(R.id.etServings)
        val etName = findViewById<EditText>(R.id.etName)
        val etNotes = findViewById<EditText>(R.id.etNotes)

        val etFoodName = findViewById<TextView>(R.id.etFoodName)
        etFoodName.text = foodName ?: "Unknown"

        findViewById<Button>(R.id.btnOrder).setOnClickListener {
            val servings = etServings.text.toString()
            val name = etName.text.toString()
            val notes = etNotes.text.toString()

            // Intent untuk memindahkan data ke ConfirmationActivity
            val intent = Intent(this, ConfirmationActivity::class.java).apply {
                putExtra("FOOD_NAME", foodName)
                putExtra("SERVINGS", servings)
                putExtra("ORDER_NAME", name)
                putExtra("NOTES", notes)
            }
            startActivity(intent)
        }
    }
}