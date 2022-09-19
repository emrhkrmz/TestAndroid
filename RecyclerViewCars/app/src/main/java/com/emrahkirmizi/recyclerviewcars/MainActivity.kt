package com.emrahkirmizi.recyclerviewcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    var carsNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    //Görüntüler Kotlinde tamsayı olarak tutulur

    lateinit var adapter: CarsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        carsNameList.add("Skoda")
        carsNameList.add("Mercedes")
        carsNameList.add("Volkswagen")
        carsNameList.add("Ford")

        detailsList.add("This is the Skoda Fabia")
        detailsList.add("This is the Mercedes A200")
        detailsList.add("This is the Volkswagen Jetta")
        detailsList.add("This is the Ford Focus")

        imageList.add(R.drawable.skoda)
        imageList.add(R.drawable.mercedes)
        imageList.add(R.drawable.volkswagen)
        imageList.add(R.drawable.ford)

        adapter = CarsAdapter(carsNameList,detailsList,imageList,this@MainActivity)

        recyclerView.adapter = adapter

    }
}