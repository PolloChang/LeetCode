package local.queue.lesson1.practice1;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    private List<Integer> data;
    private int startPoint;
    private int maxIndex;

    /**
     *  Initializes the object with the size of the queue to be k.
     * @param k
     */
    public MyCircularQueue(int k) {
        data = new ArrayList<Integer>();
        maxIndex = k;
        startPoint = 0;
    }

    /**
     * Inserts an element into the circular queue. Return true if the operation is successful.
     * @param value
     * @return
     */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        data.add(value);
        return true;
    }

    /**
     *  Deletes an element from the circular queue. Return true if the operation is successful.
     * @return
     */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        startPoint++;
        return true;
    }

    /**
     * Gets the front item from the queue. If the queue is empty, return -1.
     * @return
     */
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return data.get(startPoint);
    }

    /**
     *  Gets the last item from the queue. If the queue is empty, return -1.
     * @return
     */
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        return data.getLast();
    }

    /**
     * Checks whether the circular queue is empty or not.
     * @return
     */
    public boolean isEmpty() {
        return startPoint >= data.size();
    }

    /**
     *  Checks whether the circular queue is full or not.
     * @return
     */
    public boolean isFull() {
        return  (data.size()-startPoint) >=maxIndex;
    }
}
