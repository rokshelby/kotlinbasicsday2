package com.example.day2

import androidx.core.text.isDigitsOnly
data class CoffeeDetails(
    val sugarCount : Int,
    val name : String,
    val size : String,
    val creamAmount : Int
)
fun main(){
    val coffeeForRakeem = CoffeeDetails(0, "rakeem", "tall", 0)
    makeCoffee(coffeeForRakeem)




}
fun makeCoffee(coffeeDetails: CoffeeDetails){
    when(coffeeDetails.sugarCount){
        0->println("Coffee with no sugar for ${coffeeDetails.name} "
        + "and cream amount :${coffeeDetails.creamAmount}")
        1->println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} "
        + "and cream amount :${coffeeDetails.creamAmount}")
        else->println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} "
                + "and cream amount : ${coffeeDetails.creamAmount}")
    }
}