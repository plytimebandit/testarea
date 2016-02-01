package org.plytimebandit.testarea;

import org.plytimebandit.testarea.aspect.CallingLog;
import org.springframework.stereotype.Component;

@Component
public class InspectedObject {

    public void run() {
        int i = getOne();
        i = addTwo(i);
        i = square(i);

        System.out.println("Result=" + i);
    }

    private int square(int i) {
        return i*i;
    }

    @CallingLog
    private int addTwo(int i) {
        return i+2;
    }

    @CallingLog
    public int getOne() {
        return 1;
    }
}
