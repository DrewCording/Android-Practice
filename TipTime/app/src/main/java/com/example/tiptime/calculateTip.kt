package com.example.tiptime

import java.text.NumberFormat

fun calculateTip(
    amount: Double,
    percent: Double = 15.0,
    roundUp: Boolean
): String {
    var tip = percent / 100 * amount
    
    if(roundUp) {
        tip = kotlin.math.ceil(tip)
    }
    
    return NumberFormat.getCurrencyInstance().format(tip)
}