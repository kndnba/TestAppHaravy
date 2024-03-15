package com.example.testappharavy.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testappharavy.R
import com.example.testappharavy.data.Character
import com.squareup.picasso.Picasso

class CharactersAdapter(private val charactersList: MutableList<Character>) :
    RecyclerView.Adapter<CharactersAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.character_iv)
        val txt_name: TextView = itemView.findViewById(R.id.character_name_tv)
        val txt_team: TextView = itemView.findViewById(R.id.character_team_tv)
        val txt_createdby: TextView = itemView.findViewById(R.id.character_createdby_tv)

        fun bind(listItem: Character) {
            image.setOnClickListener {

            }
            itemView.setOnClickListener {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_characters, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount() = charactersList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = charactersList[position]
        holder.bind(listItem)
        Picasso.get().load(charactersList[position].imageurl).into(holder.image)
        holder.txt_name.text = charactersList[position].name
        holder.txt_team.text = charactersList[position].team
        holder.txt_createdby.text = charactersList[position].createdby
    }
}