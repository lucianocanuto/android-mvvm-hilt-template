package com.lucianocanuto.templatebasehiltretrofitcleancode.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lucianocanuto.templatebasehiltretrofitcleancode.domain.MensagemRepository
import com.lucianocanuto.templatebasehiltretrofitcleancode.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MensagemRepository
) : ViewModel() {

    private val mensagemObservavel = MutableLiveData<Resource<String>>()
    val mensagem : LiveData<Resource<String>> = mensagemObservavel


    fun pegarMensagem(){
        mensagemObservavel.value = Resource.Carregando()

        try {
            val resultado = repository.pegarMensagem()
            mensagemObservavel.value = Resource.Sucesso(resultado)

        }catch (erro: Exception){
            mensagemObservavel.value = Resource.Erro("Erro ao Carregar Mensagens")
        }
    }
}