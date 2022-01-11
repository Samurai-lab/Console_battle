package com.example.consolebattle

class Stack<E> {

    private var stack: MutableList<E> = mutableListOf()

    fun push(item: E) {
        stack.add(item)
    }
    fun pop(): E? {
        return when {
            stack.isEmpty() -> null
            else -> stack[stack.lastIndex]
        }
    }
    fun isEmpty(): Boolean {
        return when {
            stack.isEmpty() -> true
            else -> false
        }
    }


}