package com.emrahkirmizi.recyclerviewcars

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CarsAdapter(
    var carsNameList: ArrayList<String> = ArrayList<String>(),
    var detailsList: ArrayList<String> = ArrayList<String>(),
    var imageList: ArrayList<Int> = ArrayList<Int>(),
    var context: Context
) : RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {

    class CarsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewCarsName: TextView = itemView.findViewById(R.id.textViewCarsName)
        var textViewDetails: TextView = itemView.findViewById(R.id.textViewDetails)
        var imageview: ImageView = itemView.findViewById(R.id.imageView)
        var cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)

        return CarsViewHolder(view)

    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.textViewCarsName.text = carsNameList.get(position)
        holder.textViewDetails.text = detailsList.get(position)
        holder.imageview.setImageResource(imageList.get(position))


        holder.cardView.setOnClickListener {
            Toast.makeText(
                context, "You selected the ${carsNameList.get(position)}",
                Toast.LENGTH_LONG
            ).show()
        }

    }

    override fun getItemCount(): Int {
        return carsNameList.size
    }

}