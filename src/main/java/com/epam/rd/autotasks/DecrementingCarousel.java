package com.epam.rd.autotasks;

import java.util.Arrays;

public class DecrementingCarousel {
    static int[] array;
    int numberOfRuns = 0;

    public DecrementingCarousel(int capacity) {
        array = new int[capacity];
        Arrays.fill(array, 0);
    }

    public boolean addElement(int element){
        //throw new UnsupportedOperationException();
        boolean flag = false;
        if (numberOfRuns > 0){return flag;}
        if (element > 0){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0){
                    array[i] = element;
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public CarouselRun run(){
       //throw new UnsupportedOperationException();

        numberOfRuns++;
        if (numberOfRuns > 1){
            return null;
        }
        else {return new CarouselRun();}
    }
}
