package TADs;

import Exceptions.EmptyQueueException;

public interface MyQueue<T> {

    void enqueue(T element);
    T dequeue() throws EmptyQueueException;
    int size();
    boolean isEmpty();
}
