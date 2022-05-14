package com.epam.rd.autotasks;

public class CarouselRun {
    protected final int[] arrayCopy = DecrementingCarousel.array.clone();
    protected int position = 0;

    public int next() {
       //throw new UnsupportedOperationException();

        if (isFinished())
            return -1;
        else {
            while (arrayCopy[position %= arrayCopy.length] <= 0) {
                position++;
            }
        }
        return arrayCopy[position++]--;
    }

    public boolean isFinished() {
        //throw new UnsupportedOperationException();

        for (int el : arrayCopy)
            if (el > 0)
                return false;
        return true;
    }

}
