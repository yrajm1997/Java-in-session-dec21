// src/main/java/com/javaexercises/generics/Stack.java

package com.javaexercises.generics;

import java.util.EmptyStackException;

/**
 * Exercise 4.1: Generic Stack
 * Implement a generic stack with proper exception handling
 */
public class Stack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int size;
    
    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    
    /**
     * Pushes an element onto the stack
     * @throws StackOverflowError if the stack is full
     */
    public void push(T element) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    /**
     * Removes and returns the top element
     * @throws EmptyStackException if the stack is empty
     */
    public T pop() {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    /**
     * Returns the top element without removing it
     * @throws EmptyStackException if the stack is empty
     */
    public T peek() {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
}
