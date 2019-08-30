package ee.bizware.hiearchy

import ee.bizware.hiearchy.widget.TextView

fun main(){
    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened
}