package com.nadila.foodrestaurant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nadila.foodrestaurant.databinding.ActivityDetailBinding
import com.nadila.foodrestaurant.model.Recipes

class DetailActivity : AppCompatActivity() {
    private lateinit var detailBinding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)
        setContentView(R.layout.activity_detail)
        ShowData()
    }

    private fun ShowData(){
        val getData = intent.getParcelableExtra<Recipes>(RECIPE_DATA) as Recipes
        Glide.with(this).load(getData.pictures).into(detailBinding.ivDetail)
        detailBinding.tvNameDetail.text= getData.name
        detailBinding.tvDescriptionDetail.text = getData.description
        detailBinding.tvIngredients.text = getData.ingredients
        detailBinding.tvInstruction.text = getData.instructions
        detailBinding.tvValueCalories.text = getData.calories
        detailBinding.tvValueCarbo.text = getData.carbo
        detailBinding.tvValueProtein.text = getData.protein
    }
    companion object{
        const val RECIPE_DATA = "recipe_data"
    }
}