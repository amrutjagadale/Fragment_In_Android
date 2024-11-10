package com.example.fragment_in_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragment_in_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragmentOne.setOnClickListener {
            goToFragment(Fragment_one())
            Toast.makeText(this,"One",Toast.LENGTH_SHORT).show()

        }
        binding.fragmentTwo.setOnClickListener {
            goToFragment(Fragment_two())
            Toast.makeText(this,"Two",Toast.LENGTH_SHORT).show()
        }
    }
    private fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }
}