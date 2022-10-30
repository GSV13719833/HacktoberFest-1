package com.includehelp

//Declare abstract class
abstract class PaintSheet {
    //abstract property without value
    abstract var value:Int

    //Init Block of Base Class
    init {
        println("Init Block, Base Class")
    }

    //marked function with 'open' to make overridable
    open fun paint(){
        println("Paint Method , Base Class Implementation")
    }

    //final method, so cant be override in subclass
    fun sketch(){
        println("Sketch Method , From Base Class!")
    }

    //Abstract method, without implementation
    abstract fun draw()
}

//declare sub class extendign super class
class Painting : PaintSheet() {

    //override abstract property in subclass
    override var value=10

    //Init Block , Sub class
    init {
        println("Init Block, Child Class")

        //Call Super class implementation of Paint method
        super.paint()
    }

    //implement base class abstract method
    override fun draw(){
        println("draw Method , override in Child Class")
    }

    //Override method, provide different implementation
    override fun paint(){
        println("Paint Method , Child Class Implementation")
    }

    //Declare Method to print Property value
    fun printValue(){
        println("Value : $value")
    }
}

//Main Function, Entry Point of Program
fun main(args:Array<String>){
    //create instance of Painting class (Child class)
    val paint = Painting()

    //call draw method
    paint.draw()

    //call paint method
    paint.paint()

    //call sketch method
    paint.sketch()

    //Call printValue method
    paint.printValue()
}
