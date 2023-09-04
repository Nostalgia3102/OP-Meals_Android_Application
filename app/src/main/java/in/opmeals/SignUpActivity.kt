package `in`.opmeals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import `in`.opmeals.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private val binding : ActivitySignUpBinding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.signUpBtn.setOnClickListener {
            val intent = Intent(this,LocationActivity::class.java)
            startActivity(intent)
        }

        binding.loginOnRegisterPage.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}