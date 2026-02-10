package com.example;

import io.javalin.Javalin;

public class App {

    public static boolean test1() {
        return true;
    }

    public static boolean test2() {
        return true;
    }

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);

        app.get("/", ctx -> ctx.result("hello"));
        app.get("/works", ctx -> ctx.result("it works"));
        app.get("/test1", ctx -> ctx.result(String.valueOf(test1())));
        app.get("/test2", ctx -> ctx.result(String.valueOf(test2())));
    }
}
