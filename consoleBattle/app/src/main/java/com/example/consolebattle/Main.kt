package com.example.consolebattle

fun main() {

    var stack: Stack<Any> = Stack()
    stack.push(2)
    stack.push(8)
    stack.push("hello world")
    println(stack.pop())
    println(stack.isEmpty())

}