package org.chenlujjj.qpslimit;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRateLimiter {

    private static int qpsLimit = 10;

    private static ExecutorService threadPool = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(qpsLimit);

        for (int i = 0; i < qpsLimit; i++) {
            threadPool.submit(() -> {
                while (true) {
                    rateLimiter.acquire(1);
                    Util.beep();
                }
            });
        }
    }
}
