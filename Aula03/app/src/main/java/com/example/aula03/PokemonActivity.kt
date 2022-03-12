package com.example.aula03

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.aula03.databinding.ActivityPokemonBinding

class PokemonActivity : AppCompatActivity() {
    // Ativar binding
    // variavel com tipo especifico, lateinit var. Ele cria automatico pra cada xml existente.
    lateinit var binding: ActivityPokemonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inicializar o binding
        // .inflate serve para carregar o xml da tela
        binding = ActivityPokemonBinding.inflate(layoutInflater)
        // Colocar binding.root
        setContentView(binding.root)

        // Carregar o componente, o Spinner
        // Criar array list
        // Função pra preencher array, e colocar o tipo do dado
        val pokemonsArray =
            arrayListOf("Escolha um Pokemon!", "Charmander", "Bulbassauro", "Squirtle")

        // Criar o Adapter
        // Instanciar o adapter, chamando o construtor
        // this = contexto, layout de cada item, array com os itens do spinner
        val adapter = ArrayAdapter(this, R.layout.simple_spinner_item, pokemonsArray)
        // Definir layout do spinner fechado
        adapter.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item))

        // Carregamos o spinner
        binding.spinner.adapter = adapter

//        binding.buttonEscolher.setOnClickListener {
//            when (binding.spinner.selectedItemPosition) {
//                // Se for bulbassauro, setar sua imagem
//                1 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.bulbassauro))
//                2 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.charmander))
//                3 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.squirtle))
//                else -> binding.imageView.setImageDrawable(null)
//            }
//        }
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (binding.spinner.selectedItemPosition) {
                    // Se for bulbassauro, setar sua imagem
                    1 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.bulbassauro))
                    2 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.charmander))
                    3 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.squirtle))
                    else -> binding.imageView.setImageDrawable(null)
                }
            }
        }

    }
}