package com.example.GSCoderpad;

import java.util.ArrayList;

public class Deque {
    ArrayList<Integer> arr;
    int size;
    int k;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public Deque(int K) {
        arr = new ArrayList<>();
        k = K;
        size = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(size > 0){
            arr.add(0,value);
            size--;
            return true;
        }else{
            return false;
        }
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size > 0){
            arr.add(value);
            size--;
            return true;
        }else{
            return false;
        }
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(size < k){
            arr.remove(0);
            size++;
            return true;
        }else{
            return false;
        }
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(size < k){
            arr.remove(arr.size()-1);
            size++;
            return true;
        }else{
            return false;
        }
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(size < k){
            return arr.get(0);
        }
        return -1;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(size < k){
            return arr.get(arr.size()-1);

        }

        return -1;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(size == k){
            return true;
        }else{
            return false;
        }
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
}
