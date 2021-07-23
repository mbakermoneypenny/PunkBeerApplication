package com.example.punkbeerapplication.utils

import androidx.lifecycle.ViewModel
import com.example.punkbeerapplication.Constants
import com.example.punkbeerapplication.api.response.Beer
import com.example.punkbeerapplication.database.models.BeerDbModel
import com.example.punkbeerapplication.model.BeerViewModel

object Mapper {

    fun toDbModel(response: Beer): BeerDbModel{
        val volume = response.abv
        val name = response.name ?: ""
        val imageUrl = response.image_url ?: ""
        val id = response.id
        val tagline = response.tagline ?: ""
        val description = response.description ?: ""
        val foodPairingNotes = response.food_pairing
        return BeerDbModel(id, name, imageUrl, volume, tagline, description, foodPairingNotes)
    }

    fun toViewModel(dbModel: BeerDbModel): BeerViewModel?{
        if (dbModel.name.isEmpty()) return null
        if (dbModel.tagline.isEmpty()) return null
        if (dbModel.description.length > Constants.DESCRIPTION_LENGTH_LIMIT) return  null
        return BeerViewModel(dbModel.id, dbModel.name, dbModel.imageUrl, dbModel.strength, dbModel.tagline, dbModel.description, dbModel.foodPairingNotes)
    }


}