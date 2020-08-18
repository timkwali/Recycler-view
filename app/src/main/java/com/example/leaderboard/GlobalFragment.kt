package com.example.leaderboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_global.*


class GlobalFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var dataList = list
        rvMainContent.adapter =  RecyclerAdapter(dataList)
        rvMainContent.layoutManager = LinearLayoutManager(this.context)
        rvMainContent.setHasFixedSize(true)
    }

    //DATA LIST FOR RECYCLER VIEW
    var list = listOf<Data>(
        Data(R.drawable.ic_android, "ARI TAMUNOMIEBI", "343536 XP", "1"),
        Data(R.drawable.ic_android, "ABDULRASAQ DUROSOMO", "378638 AD", "2"),
        Data(R.drawable.ic_android, "OSEHIASE EHILEN", "098762 GJ", "3"),
        Data(R.drawable.ic_android, "TIMRING TIMKWALI", "378490 YT", "4"),
        Data(R.drawable.ic_android, "DAVID OMU", "948940 PQ", "5"),
        Data(R.drawable.ic_android, "KINGSLEY IZUNDU", "094488 YR", "6"),
        Data(R.drawable.ic_android, "OMODO OGHENEKOME", "983480 UT", "7"),
        Data(R.drawable.ic_android, "OYEDELE SAMUEL", "843748 OI", "8"),
        Data(R.drawable.ic_android, "OLADAPO OLADOKUN", "984724 65", "9"),
        Data(R.drawable.ic_android, "OLALEKAN FAGBEMI", "874632 HF", "10"),
        Data(R.drawable.ic_android, "VICTOR ADEWUMI", "723230 RE", "11"),
        Data(R.drawable.ic_android, "FREDRICK CHIBUZOR OSUALA", "057234 UU", "12"),
        Data(R.drawable.ic_android, "DANIEL OGUNLEYE AYODEJI", "447849 GF", "13"),
        Data(R.drawable.ic_android, "SAMUEL OCHUBA", "344870 KL", "14"),
        Data(R.drawable.ic_android, "RANSOM AHANMISI", "534409 RW", "15"),
        Data(R.drawable.ic_android, "EMMANUEL UTUTU", "182159 MB", "16")
    )

}