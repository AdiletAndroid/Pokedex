package com.example.pokedex

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.pokedex.databinding.ItemPokemonBinding

class PokemonAdapter(val list: ArrayList<PokemonModel>) :
    RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PokemonViewHolder(val binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PokemonModel) {
            binding.pokemonName.text = model.name
            binding.pokemonNumber.text = model.number
            val drawable = itemView.background as GradientDrawable
            drawable.mutate()
            drawable.setStroke(1, Color.RED)
            when (model.name) {
                pikachu -> {
                    binding.pokemonImg.load(R.drawable.pikachu)
                }
                charmander -> {
                    binding.pokemonImg.load(R.drawable.charmander)
                }
                mew -> {
                    binding.pokemonImg.load(R.drawable.mew)
                }
                squirtle -> {
                    binding.pokemonImg.load(R.drawable.squirtle)
                }
                bulbasaur -> {
                    binding.pokemonImg.load(R.drawable.bulbasaur)
                }
                aron -> {
                    binding.pokemonImg.load(R.drawable.aron)
                }
                ditto -> {
                    binding.pokemonImg.load(R.drawable.ditto)
                }
                butterfree -> {
                    binding.pokemonImg.load(R.drawable.bulbasaur)
                }
                gastly -> {
                    binding.pokemonImg.load(R.drawable.gastly)
                }
            }
        }
    }
}