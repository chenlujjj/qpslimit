package org.chenlujjj.qpslimit;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduler {

    private static int qpsLimit = 10;

    private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
//        schedule1();

//        schedule2();

        schedule3();

    }

    private static void schedule1() {
        scheduler.scheduleAtFixedRate(() -> Util.beep(), 0, 100, TimeUnit.MILLISECONDS);
    }

    private static void schedule2() {
        scheduler.scheduleAtFixedRate(() -> Util.beep(200), 0, 100, TimeUnit.MILLISECONDS);
    }

    private static void schedule3() {
        scheduler.scheduleAtFixedRate(() -> Util.beepWithException(), 0, 100, TimeUnit.MILLISECONDS);
    }

}
