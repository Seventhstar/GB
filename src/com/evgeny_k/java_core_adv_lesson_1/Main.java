package com.evgeny_k.java_core_adv_lesson_1;

public class Main {
    public static void main(String[] args) {
        SportActivable[] sportsObjects = new SportActivable[6];
        sportsObjects[0] = new Human("John");
        sportsObjects[1] = new Human("Mary");
        sportsObjects[2] = new Human("Nik");

        sportsObjects[3] = new Cat("Barsik");
        sportsObjects[4] = new Cat("Murzik");
        sportsObjects[5] = new Cat("Chappie");

        Stage[] stages = new Stage[3];
        stages[0] = new Treadmill();
        stages[1] = new Barrier();
        stages[2] = new Treadmill();

        for (SportActivable sportsObject : sportsObjects) {
            for (Stage stage : stages) {
                stage.doStage(sportsObject);
            }
        }
    }
}
