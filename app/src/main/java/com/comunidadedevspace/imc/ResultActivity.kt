package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

            val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

            val tv_Result = findViewById<TextView>(R.id.tv_resultado)
            val tv_classificacao = findViewById<TextView>(R.id.tv_classificacao)

            tv_Result.text = result.toString().toString()

            val classificacao: String = if(result <= 18.5f){
                "Abaixo do peso"
            }else if (result >18.5f && result <=24.9f){
                "Peso normal"
            }else if(result >25f && result <=29.9f){
                "Acima do peso"
            }else if(result >30f && result <=39.9f){
                "Obesidade"
            }else{
                "Obesidade grave"
            }

            tv_classificacao.text = classificacao
        }
    }