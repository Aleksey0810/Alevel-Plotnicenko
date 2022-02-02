package com.plotnichenko.hw15.task2;

import java.util.Comparator;

public class BoxVolume implements Comparator<Box> {
    @Override
    public int compare(Box a, Box b) {
        if (a.volume == 0 || b.volume == 0) {
            if (a.volume == 0) {
                return -1;
            }
            return 1;
        }
        return Integer.compare(b.volume, a.volume);
    }
}
