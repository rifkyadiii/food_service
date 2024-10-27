package lat.pam.utsprak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import lat.pam.utsprak.R

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        // Get references to views
        val ivFoodImage = findViewById<ImageView>(R.id.ivFoodImage)
        val tvFoodName = findViewById<TextView>(R.id.tvFoodName)
        val tvServings = findViewById<TextView>(R.id.tvServings)
        val tvOrderingName = findViewById<TextView>(R.id.tvOrderingName)
        val tvNotes = findViewById<TextView>(R.id.tvNotes)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Get data from intent
        val foodName = intent.getStringExtra("FOOD_NAME") ?: "No name"
        val foodImageResId = intent.getIntExtra("FOOD_IMAGE", 0)
        val servings = intent.getStringExtra("SERVINGS") ?: "1"
        val orderingName = intent.getStringExtra("ORDERING_NAME") ?: "No name"
        val notes = intent.getStringExtra("NOTES") ?: "No notes"

        // Set data to views
        ivFoodImage.setImageResource(foodImageResId)
        tvFoodName.text = "Food Name: $foodName"
        tvServings.text = "Number of Servings: $servings pax"
        tvOrderingName.text = "Ordering Name: $orderingName"
        tvNotes.text = "Notes: $notes"

        // Handle back button click
        btnBack.setOnClickListener {
            val intent = Intent(this, ListFoodActivity::class.java)
            // Clear back stack
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}