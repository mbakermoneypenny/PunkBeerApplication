package com.example.punkbeerapplication.model

class BeerViewModel(val id: Int, val name: String, val imageUrl: String, val strength: Int, val tagline: String = "", val description: String = "", val foodPairingNotes: List<String>) {

}