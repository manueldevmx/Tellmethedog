package com.example.tellmethedog.doglist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.tellmethedog.Dog
import com.example.tellmethedog.databinding.DogListItemBinding

class DogAdapter : ListAdapter<Dog, DogAdapter.DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val binding = DogListItemBinding.inflate(LayoutInflater.from(parent.context))
        return DogViewHolder(binding)

    }

    override fun onBindViewHolder(dogViewHolder: DogViewHolder, position: Int) {
        val dog = getItem(position)
        dogViewHolder.bind(dog)
            }

    inner class DogViewHolder(private val binding: DogListItemBinding) : RecyclerView.ViewHolder(binding.root){

            fun bind(dog: Dog){
                binding.dogName.text = dog.name

            }
    }
}