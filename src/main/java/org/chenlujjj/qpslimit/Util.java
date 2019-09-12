package org.chenlujjj.qpslimit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS Z");

    public static void beep() {
        System.out.println(Thread.currentThread().getName() + " : " + dateFormat.format(new Date()) + " : beep");
    }

    public static void beep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        beep();
    }

    public static void beepWithException() {
        beep();
        throw new IllegalArgumentException();
    }
}
