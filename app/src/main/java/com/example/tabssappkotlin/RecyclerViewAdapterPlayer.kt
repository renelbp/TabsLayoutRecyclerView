package com.example.tabssappkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapterPlayer(val listOfPlayers: List<Player>, val context: Context):
    RecyclerView.Adapter<RecyclerViewAdapterPlayer.Viewholder> (){

    class Viewholder(val view: View):RecyclerView.ViewHolder(view){
        fun binding(player: Player){
            view.findViewById<TextView>(R.id.playernametv).text =player.name
            view.findViewById<TextView>(R.id.nicknametv).text =player.nickName
            view.findViewById<TextView>(R.id.agetv).text = player.age
            view.findViewById<TextView>(R.id.emailtv).text =player.email
            view.findViewById<ImageView>(R.id.img_player).setImageResource(player.playerphoto)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            LayoutInflater.from(context).inflate(R.layout.item_players,parent,false))
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        (holder).binding(listOfPlayers[position])
    }

    override fun getItemCount(): Int {
        return listOfPlayers.size
    }

}