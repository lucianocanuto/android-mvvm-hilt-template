package com.lucianocanuto.templatebasehiltretrofitcleancode.presentation.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.lucianocanuto.templatebasehiltretrofitcleancode.databinding.ActivityMainBinding
import com.lucianocanuto.templatebasehiltretrofitcleancode.presentation.viewmodel.MainViewModel
import com.lucianocanuto.templatebasehiltretrofitcleancode.util.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    private val mensagemViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        mensagemViewModel.pegarMensagem()

        mensagemViewModel.mensagem.observe(this){ resultado ->

            when(resultado){
                is Resource.Carregando ->{
                    binding.txtMsg.text = "Carregando..."
                }
                is Resource.Sucesso -> {
                    binding.txtMsg.text = resultado.data
                }
                is Resource.Erro -> {
                    binding.txtMsg.text = resultado.mensagem
                }
            }

        }



    }
}