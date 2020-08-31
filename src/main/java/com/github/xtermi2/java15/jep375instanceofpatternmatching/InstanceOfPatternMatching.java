package com.github.xtermi2.java15.jep375instanceofpatternmatching;

public class InstanceOfPatternMatching {

    public String instaceOfTest(Object msg) {
        if (msg instanceof String s && s.length() > 5) {
            System.out.println("length > 5 !!!");
        }

        if (msg instanceof String s) {
            return "this is the poor man's smart-cast feature from kotlin: " + s.length();
        } else {
            return "";
        }
    }
}
