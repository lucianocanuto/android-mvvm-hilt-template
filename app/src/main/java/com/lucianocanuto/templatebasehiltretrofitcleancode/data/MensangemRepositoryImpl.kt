package com.lucianocanuto.templatebasehiltretrofitcleancode.data

import com.lucianocanuto.templatebasehiltretrofitcleancode.domain.MensagemRepository
import javax.inject.Inject

class MensangemRepositoryImpl @Inject constructor(): MensagemRepository {
    override fun pegarMensagem(): String {
        return "Bem-vindo à Clean Architecture \uD83D\uDE80"
    }
}