package com.zm.mypocketschool

import android.content.Intent
import android.database.CursorJoiner
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.zm.mypocketschool.databinding.ActivityLogInBinding
import kotlinx.android.synthetic.main.activity_log_in.*


class LogInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        loginButton.setOnClickListener{
            Intent(this, Navigation::class.java ).also {
                startActivity(it)

            }

        }


    }

}




