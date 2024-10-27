package lat.pam.utsprak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_confirmation)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Terima data dari intent
        val foodName = intent.getStringExtra("FOOD_NAME")
        val servings = intent.getStringExtra("SERVINGS")
        val orderName = intent.getStringExtra("ORDER_NAME")
        val notes = intent.getStringExtra("NOTES")

        // Tampilkan data di TextView yang sesuai
        findViewById<TextView>(R.id.tvTitle).text = "Order Food Confirmation"
        findViewById<TextView>(R.id.tvFoodName).text = "Food Name: $foodName"
        findViewById<TextView>(R.id.tvServings).text = "Number of Servings: $servings pax"
        findViewById<TextView>(R.id.tvOrderName).text = "Ordering Name: $orderName"
        findViewById<TextView>(R.id.tvNotes).text = "Additional Notes: $notes"

        findViewById<Button>(R.id.backtoMenu).setOnClickListener {
            val intent = Intent(this, ListFoodActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

    }
}