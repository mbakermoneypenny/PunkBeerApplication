package com.example.punkbeerapplication.api.response

import Boil_volume
import Ingredients
import Volume

data class Beer (val id : Int,
                 val name : String?,
                 val tagline : String?,
                 val first_brewed : String?,
                 val description : String?,
                 val image_url : String?,
                 val abv : Int,
                 val ibu : Int,
                 val target_fg : Int,
                 val target_og : Int,
                 val ebc : Int,
                 val srm : Double,
                 val ph : Double,
                 val attenuation_level : Double,
                 val volume : Volume?,
                 val boil_volume : Boil_volume?,
                 val method : Method?,
                 val ingredients : Ingredients?,
                 val food_pairing : List<String>,
                 val brewers_tips : String?,
                 val contributed_by : String?)


