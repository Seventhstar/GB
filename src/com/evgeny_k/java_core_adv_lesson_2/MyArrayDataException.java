package com.evgeny_k.java_core_adv_lesson_2;

class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("Bad data in [" + i + "],[" + j + "]");
    }
}