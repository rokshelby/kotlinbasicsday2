package com.example.day2

import androidx.core.text.isDigitsOnly

fun main(){

    println("Enter the customer name")
    var name = readln()


    println("Enter the number of sugars")
    var numOfSugars = readln().toIntOrNull()
    if(numOfSugars == null){
        numOfSugars = 0
    }

    if(name == ""){
        name = "Customer"
    }


    makeCoffee(numOfSugars,name)
}
fun makeCoffee(sugarCount : Int, name : String){
//    if(sugarCount == 0){
//        println("Coffee with no sugar for $name")
//    }
//    else if(sugarCount == 1){
//        println("Coffee with $sugarCount spoon of sugar for $name")
//    }else{
//        println("Coffee with $sugarCount spoons of sugar for $name")
//    }
    when(sugarCount){
        0->println("Coffee with no sugar for $name")
        1->println("Coffee with $sugarCount spoon of sugar for $name")
        else->println("Coffee with $sugarCount spoons of sugar for $name")
    }
}