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
            val peso = edtPeso.text

            // Recuperando o texto digitado na altura
            val altura = edtAltura.text
            println("Som do botão")
        }

    }
}