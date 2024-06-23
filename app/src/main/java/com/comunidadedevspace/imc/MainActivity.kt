package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperando os componentes de EditText


        // Criar uma variável e associar(=) o componente de UI<EditText>

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        // Ação do botão
        btnCalcular.setOnClickListener{

            // Recuperando o texto digitado no edtpeso
            val peso: Float = edtPeso.text.toString().toFloat()

            // Recuperando o texto digitado na altura
            val altura: Float = edtAltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            println("Som do botão")
        }

    }
}