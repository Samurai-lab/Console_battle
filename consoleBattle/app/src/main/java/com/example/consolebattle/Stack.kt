package com.example.consolebattle

//Task 1
class Stack<E> {

    private var stack: MutableList<E> = mutableListOf()

    fun push(item: E) {
        stack.add(item)
    }

    fun getLast(): E? {
        return stack[stack.size]
    }

    fun pop(): E? {
        return when {
            stack.isEmpty() -> null
            else -> stack.removeAt(stack.lastIndex)

        }
    }

    fun isEmpty(): Boolean {
        return when {
            stack.isEmpty() -> true
            else -> false
        }
    }

    fun getSize () = stack.size

    fun getElement (num: Int) = stack[num]
}