package org.chenlujjj.qpslimit;

public class TestSleep {

    private static int qpsLimit = 10;

    public static void main(String[] args) {

        while (true) {
            Util.beep();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
