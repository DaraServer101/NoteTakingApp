package com.example.notetakingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notetakingapp.databinding.ActivitySignUpBinding

class SignUpActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater);
        setContentView(binding.root);
    }
}