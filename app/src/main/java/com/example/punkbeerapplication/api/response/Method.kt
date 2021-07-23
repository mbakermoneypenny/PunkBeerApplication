package com.example.punkbeerapplication.api.response

import Fermentation
import Mash_temp

data class Method (
    val mash_temp : List<Mash_temp>,
    val fermentation : Fermentation,
    val twist : String
)