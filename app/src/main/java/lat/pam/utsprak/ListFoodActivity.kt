package lat.pam.utsprak

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class ListFoodActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FoodAdapter
    private lateinit var foodList: List<Food>
    private lateinit var btnLogout: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)

        // Setup RecyclerView
        setupRecyclerView()

        // Setup Data
        prepareData()

        // Setup Logout Button
        setupLogoutButton()
    }

    private fun setupLogoutButton() {
        btnLogout = findViewById(R.id.btnLogout)
        btnLogout.setOnClickListener {
            // Kembali ke MainActivity dan clear stack
            val intent = Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
            finish()
        }
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    private fun prepareData() {
        foodList = listOf(
            Food("Batagor", "Batagor asli enak dari Bandung", R.drawable.batagor),
            Food("Black Salad", "Salad segar yang dibuat secara langsung", R.drawable.black_salad),
            Food("Cappucino", "Kopi cappucino asli yang dibuat dari Kopi Arabica", R.drawable.cappuchino)
        )

        adapter = FoodAdapter(foodList) { food ->
            val intent = Intent(this, OrderActivity::class.java).apply {
                putExtra("FOOD_NAME", food.name)
                putExtra("FOOD_DESC", food.description)
                putExtra("FOOD_IMAGE", food.imageResourceId)
            }
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}