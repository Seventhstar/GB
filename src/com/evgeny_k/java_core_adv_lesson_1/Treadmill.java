package com.evgeny_k.java_core_adv_lesson_1;

public class Treadmill extends Stage{
    @Override
    public void doStage(SportActivable sa) {
        sa.run();
    }
}
