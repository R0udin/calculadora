package com.example.calculatorteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow


class MainActivity : AppCompatActivity() {
    var isNewOp = true
    var oldNumber = ""
    var op = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {
        if(isNewOp)
            displayTV.setText("")
        isNewOp = false
        var buclick:String = displayTV.text.toString()
        var buselect = view as Button
        when(buselect.id){
            oneBTN.id -> {buclick += "1"}
            twoBTN.id -> {buclick += "2"}
            threeBTN.id -> {buclick += "3"}
            fourBTN.id -> {buclick += "4"}
            fiveBTN.id -> {buclick += "5"}
            sixBTN.id -> {buclick += "6"}
            sevenBTN.id -> {buclick += "7"}
            eightBTN.id -> {buclick += "8"}
            nineBTN.id -> {buclick += "9"}
            zeroBTN.id -> {buclick += "0"}
            pointBTN.id -> {buclick += "."}
            plusminusBTN.id -> {buclick = "-$buclick"}
        }
        displayTV.setText(buclick)
    }

    fun operatorEvent(view: View) {
        isNewOp = true
        oldNumber = displayTV.text.toString()
        var buselect = view as Button
        when(buselect.id){
            multiplyBTN.id -> {op = "*"}
            divideBTN.id -> {op = "/"}
            subtractBTN.id -> {op = "-"}
            addBTN.id -> {op = "+"}
            log.id -> {op = "log"}
            exponentBTN.id -> {op = "^"}
            square.id -> {op = "square"}
            module.id -> {op = "module"}
        }
    }

    fun equalEvent(view: View) {
        var newnumber = displayTV.text.toString()
        var result = 0.0

        when(op){
            "+" -> {result = oldNumber.toDouble() + newnumber.toDouble()}
            "*" -> {result = oldNumber.toDouble() * newnumber.toDouble()}
            "/" -> {result = oldNumber.toDouble() / newnumber.toDouble()}
            "-" -> {result = oldNumber.toDouble() - newnumber.toDouble()}
            "log" -> {result = Math.log(oldNumber.toDouble())}
            "^" -> {result = Math.exp(oldNumber.toDouble())}
            "square" -> {result = oldNumber.toDouble() * oldNumber.toDouble()}
            "module" -> {result = oldNumber.toDouble() - newnumber.toDouble()}
        }
        displayTV.setText(result.toString())


    }

    fun sqrtEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.sqrt(oldNumber.toDouble())
        displayTV.setText(result.toString())
    }
    fun squareEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.sqrt(oldNumber.toDouble())
    }

    fun sinEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.sin(Math.toRadians(oldNumber.toDouble()))
        displayTV.setText(result.toString())
    }

    fun asinEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.asin(Math.toRadians(oldNumber.toDouble()))
        displayTV.setText(result.toString())
    }

    fun cosEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.cos(Math.toRadians(oldNumber.toDouble()))
        displayTV.setText(result.toString())
    }

    fun acosEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.acos(Math.toRadians(oldNumber.toDouble()))
        displayTV.setText(result.toString())
    }

    fun tanEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.tan(Math.toRadians(oldNumber.toDouble()))
        displayTV.setText(result.toString())
    }

    fun factorialEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result: Long = 1
        for (i in 1..oldNumber.toInt()) {
            // factorial = factorial * i;
            result *= i.toLong()
        }
        displayTV.setText(result.toString())
    }

    fun clearEvent(view: View) {
        displayTV.setText("0")
        isNewOp = true
    }

    fun inverseEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = 1 / oldNumber.toDouble()
        displayTV.setText(result.toString())
    }

    fun atanEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.atan(Math.toRadians(oldNumber.toDouble()))
        displayTV.setText(result.toString())
    }

    fun naturalLogEvent(view: View){
        oldNumber = displayTV.text.toString()
        var result = 0.0
        result = Math.log(oldNumber.toDouble())
        displayTV.setText(result.toString())
    }

}