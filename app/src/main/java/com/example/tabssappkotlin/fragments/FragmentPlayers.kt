package com.example.tabssappkotlin.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tabssappkotlin.Player
import com.example.tabssappkotlin.R
import com.example.tabssappkotlin.RecyclerViewAdapterPlayer
import kotlinx.android.synthetic.main.players_fragment.*

class FragmentPlayers : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.players_fragment, container,  false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        player_recyclerview.layoutManager

        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        player_recyclerview.layoutManager = linearLayoutManager

        val listofplayers:List<Player> = listOf<Player>(
            Player("Rene Mtz", "Renem", "31", "renelbp@gmail.com", R.drawable.rene),
            Player("Juan Perez", "JuanP", "40", "janp@gmail.com", R.drawable.img),
            Player("Rana rene", "jULIOr", "27", "holap@gmail.com", R.drawable.img_4),
            Player("Doroteo Arango","Pancho Villa", "50", "rsisisisp@gmail.com", R.drawable.img_3),
            Player("John F. Kenedy", "Hey Jhon", "60", "reasjfp@gmail.com", R.drawable.img_2),
            Player("Adolph Hitler", "El cacas", "22", "reasdasd@gmail.com", R.drawable.img_1)
        )

        val adapter = RecyclerViewAdapterPlayer(listofplayers, requireContext())
        player_recyclerview.adapter = adapter
    }

}
