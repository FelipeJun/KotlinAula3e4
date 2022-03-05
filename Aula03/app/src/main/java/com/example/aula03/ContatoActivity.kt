package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula03.databinding.ActivityContatoBinding

class ContatoActivity : AppCompatActivity() {
    // lateinit inicia esta variavel mais tarde
    lateinit var b: ActivityContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityContatoBinding.inflate(layoutInflater)
        // inflar é carregar o XML e fazer ele aparecer na tela
        setContentView(b.root)
        setContentView(R.layout.activity_contato)
        // clousure ou arrow function
        //evento de click do botão
        b.buttonIrContato.setOnClickListener {
            var msg = """
                |${getString(R.string.ola)}, ${b.editNomeContato.text}!
                |${getString((R.string.seu_telefone))}: ${b.editTel.text}
                |${getString((R.string.seu_email))} ${b.editEmail.text}
                |
                |${getString(R.string.preferencia)}:
                |${getString((R.string.tel))}: ${b.checkTel.isChecked}
                |${getString((R.string.e_mail))}: ${b.checkEmail.isChecked}
            """.trimMargin()
            alert("${getString((R.string.bem_vindo))}",msg,this)
        }

    }
}