package com.company.ArrayIterator;
import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int currentElement=-1;
    private int currentLength;

    public ArrayIterator(T[] array){
        this.array=array;
        currentLength=this.array.length;

    }

    public T[] getArray() {
        return this.array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(int currentElement) {
        this.currentElement = currentElement;
    }

    public int getCurrentLength() {
        return currentLength;
    }

    public void setCurrentLength(int currentLength) {
        this.currentLength = currentLength;
    }

    @Override
    public boolean hasNext() {
        return getCurrentElement()+1<getCurrentLength();
    }

    @Override
    public T next() {
        setCurrentElement(getCurrentElement()+1);
        return getArray()[getCurrentElement()];
    }

    @Override
    public void remove() {
        for(int i=getCurrentElement();i<getCurrentLength()-1;i++){
            this.array[i]=getArray()[i+1];
        }
        this.array[getCurrentLength()-1]=null;
        setCurrentLength(getCurrentLength()-1);
        setCurrentElement(getCurrentElement()-1);
    }
}
