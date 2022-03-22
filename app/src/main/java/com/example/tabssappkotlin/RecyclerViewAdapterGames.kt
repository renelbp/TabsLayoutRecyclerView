package com.example.tabssappkotlin


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapterGames(val listOfGames: List<Games>, val context: Context): RecyclerView.Adapter<RecyclerViewAdapterGames.Viewholder> (){

    class Viewholder(val view: View):RecyclerView.ViewHolder(view){
        fun binding(games: Games){
            view.findViewById<TextView>(R.id.gamenametv).text =games.gameName
            view.findViewById<TextView>(R.id.genretv).text =games.gameGenre
            view.findViewById<TextView>(R.id.numofplayerstv).text = games.numOfPlayers
            view.findViewById<ImageView>(R.id.img_gameiv).setImageResource(games.photo)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            LayoutInflater.from(context).inflate(R.layout.item_games,parent,false))
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        (holder).binding(listOfGames[position])
    }

    override fun getItemCount(): Int {
        return listOfGames.size
    }

    override fun getItemId(position: Int): Long {
        return 0
    }
}