package `in`.opmeals

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import `in`.opmeals.databinding.ActivityLocationBinding

class LocationActivity : AppCompatActivity() {
    private val binding:ActivityLocationBinding by lazy {
        ActivityLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       val locationList = arrayOf("Kolkata","New Delhi", "Noida")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)

        val autoCompleteTextView = binding.ListOfLocations
        autoCompleteTextView.setAdapter(adapter)
        Log.d(TAG, "Activity created")

        binding.continueBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}