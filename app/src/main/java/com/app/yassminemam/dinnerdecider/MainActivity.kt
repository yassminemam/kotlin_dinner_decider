package com.app.yassminemam.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Chinese", "Indian Food", "Pizza", "McDonalds", "Burger", "Healthy Food")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_decide_food.setOnClickListener {
            val random = Random()
            val randomFoodIndex = random.nextInt(foodList.count())
            tv_dinner_name.text = foodList[randomFoodIndex]
        }

        tv_add_food.setOnClickListener {
            val newFood = et_add_new_food.text.toString()
            foodList.add(newFood)
            et_add_new_food.text.clear()
            
        }
    }
}
