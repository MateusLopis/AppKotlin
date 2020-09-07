package com.example.meuappmateuslopis

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(componente: View) {
        val nomeAluno = et_nome.text.toString()
        val Nota1 = et_nota1.text.toString().toInt()
        val Nota2 = et_nota2.text.toString().toInt()
        val resultado = (Nota1 + Nota2) / 2

        if (nomeAluno.isEmpty() || Nota1 < 0 || Nota1 > 10 || Nota2 < 0 || Nota2 > 10) {
            tv_resultado.visibility = View.VISIBLE
            tv_resultado.text = "Invalido... coloque o nome do aluno"
        } else {
            if (resultado in 0..4) {
                tv_resultado.setTextColor(Color.RED)
                tv_resultado.visibility = View.VISIBLE
                tv_resultado.text = "NOME: ${nomeAluno} MEDIA: ${resultado} Foi de Base"
            } else if
                (resultado in 5..9) {
                    tv_resultado.setTextColor(Color.BLUE)
                    tv_resultado.visibility = View.VISIBLE
                    tv_resultado.text = "NOME: ${nomeAluno} MEDIA: ${resultado} Passou busque sempre o seu melhor!!!!"
                }
            else{
                tv_resultado.setTextColor(Color.GREEN)
                tv_resultado.visibility = View.VISIBLE
                tv_resultado.text = "NOME: ${nomeAluno} MEDIA: ${resultado} de letra moooonstroooo!!!!"
            }
        }
    }

}

