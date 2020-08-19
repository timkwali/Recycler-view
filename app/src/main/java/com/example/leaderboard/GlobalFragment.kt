package com.example.leaderboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_global.*


class GlobalFragment : Fragment(), OnProfileClickListener  {

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

        //
        var dataList = list
        rvMainContent.adapter =  RecyclerAdapter(dataList, this)
        rvMainContent.layoutManager = LinearLayoutManager(this.context)
        rvMainContent.setHasFixedSize(true)
    }


    //DATA LIST FOR RECYCLER VIEW
    var list = listOf<Data>(
        Data(R.mipmap.ari, "ARI TAMUNOMIEBI", "343536 XP", "1"),
        Data(R.mipmap.abdul, "ABDULRASAQ DUROSOMO", "378638 AD", "2"),
        Data(R.mipmap.osehiase, "OSEHIASE EHILEN", "098762 GJ", "3"),
        Data(R.mipmap.timring, "TIMRING TIMKWALI", "378490 YT", "4"),
        Data(R.mipmap.david, "DAVID OMU", "948940 PQ", "5"),
        Data(R.mipmap.kingsley, "KINGSLEY IZUNDU", "094488 YR", "6"),
        Data(R.mipmap.omodo, "OMODO OGHENEKOME", "983480 UT", "7"),
        Data(R.mipmap.oyedele, "OYEDELE SAMUEL", "843748 OI", "8"),
        Data(R.mipmap.oladapo, "OLADAPO OLADOKUN", "984724 65", "9"),
        Data(R.mipmap.olalekan, "OLALEKAN FAGBEMI", "874632 HF", "10"),
        Data(R.mipmap.victor, "VICTOR ADEWUMI", "723230 RE", "11"),
        Data(R.mipmap.fredrick, "FREDRICK CHIBUZOR OSUALA", "057234 UU", "12"),
        Data(R.mipmap.daniel, "DANIEL OGUNLEYE AYODEJI", "447849 GF", "13"),
        Data(R.mipmap.samuel, "SAMUEL OCHUBA", "344870 KL", "14"),
        Data(R.mipmap.ransom, "RANSOM AHANMISI", "534409 RW", "15"),
        Data(R.mipmap.emmanuel, "EMMANUEL UTUTU", "182159 MB", "16")
    )

    //IMPLEMENT CLICK ACTIONS
    override fun onItemClick(dataList: Data, position: Int) {
        super.onItemClick(dataList, position)
        val crntProfile = list[position]
        Toast.makeText(this.context, "Hi ${dataList.name}", Toast.LENGTH_SHORT).show()
//        this.context?.setTheme(R.style.recyclerItem)


    }
}