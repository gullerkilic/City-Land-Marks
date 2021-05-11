 package com.gullerkilic.landmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var landmarkNames = ArrayList<String>()
        landmarkNames.add("Eiffel Tower")
        landmarkNames.add("Sagrada Familia")
        landmarkNames.add("Colleseum")
        landmarkNames.add("Pisa Tower")

        val eiffelId = R.drawable.eiffel
        val sagradaFamiliaId = R.drawable.sagradafamilia
        val colleseumId = R.drawable.colleseum
        val pisaId = R.drawable.pisa

        val imagesId = ArrayList<Int>()
        imagesId.add(eiffelId)
        imagesId.add(sagradaFamiliaId)
        imagesId.add(colleseumId)
        imagesId.add(pisaId)


        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this,DetailsActivity::class.java)
            intent.putExtra("name",landmarkNames[position])

            intent.putExtra("images",imagesId[position])
            startActivity(intent)

        }

    }

}