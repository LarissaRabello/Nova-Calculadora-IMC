package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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
            val pesoStr: String = edtPeso.text.toString()

            // Recuperando o texto digitado na altura
            val alturaStr: String = edtAltura.text.toString()

            if(pesoStr == "" || alturaStr == ""){
                // Mostrar mensagem para o usuário
                Snackbar.make(
                    edtPeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()
                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                println("Som do botão")

                // Navegar para a próxima tela
                // Criar o layout da próxima tela
                // Mostrar o resultado na próxima tela

                // Intent é uma classe do próprío Android

                val intent = Intent(this, ResultActivity:: class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)
            }
        }
    }
}