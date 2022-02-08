package it.aesys.firstkmmapplication.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import it.aesys.firstkmmapplication.android.databinding.ActivityMainBinding
import it.aesys.viewmodel.MainViewModel
import it.aesys.firstkmmapplication.BR

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.setVariable(BR.viewModel, MainViewModel())
    }
}
