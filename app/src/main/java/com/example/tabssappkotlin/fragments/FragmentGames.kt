package com.example.tabssappkotlin.fragments

import android.os.Bundle
import android.text.util.Linkify
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tabssappkotlin.Games
import com.example.tabssappkotlin.R
import com.example.tabssappkotlin.RecyclerViewAdapterGames
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.games_fragment.*

class FragmentGames : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        return inflater.inflate(R.layout.games_fragment, container,  false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        games_recyclerview.layoutManager =  GridLayoutManager(requireContext(),2)

        val listofgames:List<Games> = listOf<Games>(
            Games("Mortal Kombat", "Arcade", "Multiplayer", R.drawable.download),
            Games("Gears Of War", "Estrategia", "Multiplayer", R.drawable.gow),
            Games("Call Of Duty",
                "Estrategia", "Multiplayer", R.drawable.cof
            ),
            Games("Mario Kart", "Races", "Multiplayer", R.drawable.mariokart),
            Games("The Legend Of Zelda", "Adventure", "Single Player", R.drawable.zelda),
            Games("Dragon Ball Z Budikai HD Collection","Arcade","Multiplayer", R.drawable.dbz)
        )



        val adapter = RecyclerViewAdapterGames(listofgames, requireContext())
        games_recyclerview.adapter = adapter
        games_recyclerview.setOnClickListener{
            for(i in listofgames.indices) {
                gametitle.setText("https://www.google.com.mx/search?q=+${listofgames[0].gameName}")
                Linkify.addLinks(gametitle, Linkify.WEB_URLS)

            }
            }

        }
    }



