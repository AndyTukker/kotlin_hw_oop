package ee.bizware.hiearchy

import ee.bizware.hiearchy.view.ViewGroup
import ee.bizware.hiearchy.widget.Button
import ee.bizware.hiearchy.widget.TextView

fun main(){
    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened

    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text) // Click me
    button.text = "Don't click me"
    println(button.text) // Don't click me

    val title = TextView("Main Screen")
    val content = ViewGroup()
    content.addView(title)
    val main = ViewGroup()
    main.addView(content)
    //получилась ViewGroup, внутри неё ViewGroup, внутри TextView
 }