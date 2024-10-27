package lat.pam.utsprak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import lat.pam.utsprak.ConfirmationActivity

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

        // Terima data dari Intent
        val foodName = intent.getStringExtra("FOOD_NAME")
        val foodImageResId = intent.getIntExtra("FOOD_IMAGE", 0)

        // Tampilkan data di layout
        val ivFoodImage = findViewById<ImageView>(R.id.ivFoodImage)
        val tvFoodName = findViewById<TextView>(R.id.etFoodName)

        // Set data
        tvFoodName.text = foodName
        ivFoodImage.setImageResource(foodImageResId)

        // Set button Place Order
        findViewById<Button>(R.id.btnOrder).setOnClickListener {
            val intent = Intent(this, ConfirmationActivity::class.java)

            // Get values from EditText fields
            val servings = findViewById<EditText>(R.id.etServings).text.toString()
            val orderingName = findViewById<EditText>(R.id.etName).text.toString()
            val notes = findViewById<EditText>(R.id.etNotes).text.toString()

            // Pass all data to ConfirmationActivity
            intent.putExtra("FOOD_NAME", foodName)
            intent.putExtra("FOOD_IMAGE", foodImageResId)
            intent.putExtra("SERVINGS", servings)
            intent.putExtra("ORDERING_NAME", orderingName)
            intent.putExtra("NOTES", notes)

            startActivity(intent)
        }

        // Button untuk kembali ke ListFoodActivity
        findViewById<Button>(R.id.btnBackToList).setOnClickListener {
            val intent = Intent(this, ListFoodActivity::class.java)
            startActivity(intent)
            finish() // Menutup OrderActivity setelah kembali
        }
    }
}