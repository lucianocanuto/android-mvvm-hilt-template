package com.lucianocanuto.templatebasehiltretrofitcleancode.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.lucianocanuto.templatebasehiltretrofitcleancode.R
import com.lucianocanuto.templatebasehiltretrofitcleancode.domain.MensagemRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mensagem: MensagemRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.i("teste", "${mensagem.pegarMensagem()}")

    }
}