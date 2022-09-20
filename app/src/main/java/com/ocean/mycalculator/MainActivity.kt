package com.ocean.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ocean.mycalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // TextView used to display the input and output
//    lateinit var txtInput: TextView
    private lateinit var binding: ActivityMainBinding
    // Represent whether the lastly pressed key is numeric or not
    var lastNumeric: Boolean = false

    // Represent that current state is in error or not
    var stateError: Boolean = false

    // If true, do not allow to add another DOT
    var lastDot: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}