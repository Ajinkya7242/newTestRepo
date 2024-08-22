package com.example.testcompanynew

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.example.testcompanynew.UI.DetailsScreenActivity
import com.example.testcompanynew.databinding.ActivityMainBinding
import com.example.testcompanynew.viewmodels.LoginViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.launch
import java.util.regex.PatternSyntaxException
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    val viewModel:LoginViewModel  by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnLogin.setOnClickListener {
            val email=binding.etEmail.text.toString()
            val pass=binding.etPass.text.toString()
            binding.pbMain.isVisible=true
            if(email.isBlank()){
                binding.etEmail.requestFocus()
                binding.etEmail.error="Enter email"
            }
            else if(pass.isEmpty()){
                binding.etPass.requestFocus()
                binding.etPass.error="Enter email"
            }
            else{
                lifecycleScope.launch {
                    viewModel.loginUser(email,pass)
                }
                viewModel.reponse.observe(this, Observer { it->
                    if(it.isSuccess){
                        binding.pbMain.isVisible=false
                        val response=it.getOrNull()
                        Log.d("MainActivity",response.toString())
                        val intent=Intent(this,DetailsScreenActivity::class.java)
                        intent.putExtra("SessionId",response!!.SessionId!!)
                        startActivity(intent)
                        finish()

                    }
                    else{
                        binding.pbMain.isVisible=false
                        Log.d("MainActivity","Unable to Login In")
                        Toast.makeText(this, "Unable to Login In", Toast.LENGTH_SHORT).show()
                    }
                })
            }
        }

    }
}