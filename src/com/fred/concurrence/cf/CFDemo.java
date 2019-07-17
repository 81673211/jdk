package com.fred.concurrence.cf;

import java.util.concurrent.CompletableFuture;

public class CFDemo {

    public static void main(String[] args) {
        CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> {
                    System.out.println("-----------");
                    throw new MyExp(null);
                }),
                CompletableFuture.runAsync(() -> {
                    throw new NullPointerException();
                })
        ).exceptionally(throwable -> {

            return null;
        }).join();
    }
}


class MyExp extends RuntimeException {
    private String message;

    private Throwable throwable;

    public MyExp(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}