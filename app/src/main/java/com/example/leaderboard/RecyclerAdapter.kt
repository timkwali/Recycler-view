package com.example.leaderboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.profile.view.*

//CREATE ADAPTER FOR THE RECYCLER
class RecyclerAdapter(private val dataList: List<Data>, var clickListener: OnProfileClickListener):
                      RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    //CREATE VIEW-HOLDER TO CREATE NEW INSTANCES OF THE BLUEPRINT
    class RecyclerViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val photo: ImageView = item.ivProfilePic
        val name: TextView = item.tvName
        val id: TextView = item.tvId
        val serialNo: TextView = item.tvSerialNo

        //GET PROFILE NAME FOR TOAST
        fun initialize(dataList: Data, action: OnProfileClickListener) {
            name.text =  dataList.name

            itemView.setOnClickListener{
                action.onItemClick(dataList, adapterPosition)
            }
        }
    }

    //CREATE PROFILE
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.profile, parent, false)
        return RecyclerViewHolder(item)
    }

    //BIND PROFILE TO THE VIEW
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentProfile = dataList[position]
        holder.photo.setImageResource(currentProfile.ImageResource)
        holder.name.text = currentProfile.name
        holder.id.text = currentProfile.id
        holder.serialNo.text = currentProfile.serialNo

        holder.initialize(dataList[position], clickListener)
    }

    //GET ITEM COUNT
    override fun getItemCount() = dataList.size

}

//SET LISTENER FOR PROFILE CLICK
interface OnProfileClickListener {
    fun onItemClick(dataList: Data, position: Int) {
    }
}