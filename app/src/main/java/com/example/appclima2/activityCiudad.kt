package com.example.appclima2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class activityCiudad : AppCompatActivity() {
    val Tag = "com.example.appclima2.ActivityCiudad.CIUDAD"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudad)
        /*se busca un elemento por id del tipo que declaramos en el activity*/

        val btnIntibuca = findViewById<Button>(R.id.btnIntibuca)
        val btnLaEza = findViewById<Button>(R.id.btnLaEza)
        val btnCamasca = findViewById<Button>(R.id.btnCamasca)

        btnIntibuca.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(Tag, "Ciudad-Intibucá")
            startActivity(intent)
        })

        btnLaEza.setOnClickListener(View.OnClickListener {
            /*Intentar ir de donde estamos hacia donde vamos*/
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(Tag, "Ciudad-La Esperanza")
            startActivity(intent)
        })

        btnCamasca.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(Tag, "Ciudad- Camasca")
            startActivity(intent)
        })
    }
}