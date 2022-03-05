package com.example.aula03

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import com.example.aula03.databinding.ActivityPronomeBinding

class PronomeActivity : AppCompatActivity() {

    lateinit var binding : ActivityPronomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding mais usado, nao esquecer de entra no build.gradle(module) e criar o binding acima
        binding = ActivityPronomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Binding Mais trabalhoso
        val editNome = findViewById<EditText>(R.id.editNome)
        val rgPronome : RadioGroup = findViewById(R.id.rgPronome)
        //Mesma coisa do de cima só que diferente
        var radioEle  = findViewById<RadioButton>(R.id.radioEle)
        var radioEla = findViewById<RadioButton>(R.id.radioEla)
        var radioElix = findViewById<RadioButton>(R.id.radioElu)
        var buttonIr : Button = findViewById(R.id.buttonIr)
        var pronome = when(rgPronome.checkedRadioButtonId){
            R.id.radioEle -> "Ele"
            R.id.radioEla -> "Ela"
            R.id.radioElu -> "Elix"
            else -> "Nada"
        }
        alert("Bem-vindo","ola"+ editNome.text + "Você escolheu o pronome "+ pronome,this)
    }
}