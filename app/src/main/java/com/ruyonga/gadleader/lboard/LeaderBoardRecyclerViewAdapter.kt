package com.ruyonga.gadleader.lboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ruyonga.gadleader.R
import com.ruyonga.gadleader.model.Leaders


class LeaderBoardRecyclerViewAdapter(private val data: List<Leaders>) :
    RecyclerView.Adapter<LeaderViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeaderViewHolder {
        val layoutInflator = LayoutInflater.from(parent.context)
        val view = layoutInflator.inflate(R.layout.leader_board_list_item, parent, false)

        return LeaderViewHolder(view)
    }

    override fun onBindViewHolder(holder: LeaderViewHolder, position: Int) {
        return holder.bind(data[position])
    }

    override fun getItemCount() = data.size
}


class LeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val fullNames: TextView = itemView.findViewById(R.id.fullnames)
    private val details: TextView = itemView.findViewById(R.id.details)
    private val leaderBadge: ImageView = itemView.findViewById(R.id.leaderBadge)

    fun bind(learnerLeaders: Leaders) {
        fullNames.text = learnerLeaders.name
        details.text = learnerLeaders.country
        Glide.with(itemView.context).load(learnerLeaders.badgeUrl).into(leaderBadge)
    }


}