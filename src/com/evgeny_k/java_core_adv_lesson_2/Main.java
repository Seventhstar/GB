package com.evgeny_k.java_core_adv_lesson_2;

public class Main {
    private static final int GOOD_SIZE = 4;

    public static void main(String[] args) throws MyArrayDataException {

        String[][] array = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        String[][] illegalSizeArray = new String[2][];
        illegalSizeArray[0] = new String[]{"28", "22"};
        illegalSizeArray[1] = new String[]{"2", "3"};

        String[][] anotherIllegalSizeArray = new String[GOOD_SIZE][];
        anotherIllegalSizeArray[0] = new String[]{"Jhon", "1", "2"};
        anotherIllegalSizeArray[1] = new String[]{"true"};
        anotherIllegalSizeArray[2] = new String[]{"28"};
        anotherIllegalSizeArray[3] = new String[]{"2", "3"};

        String[][] badDataArray = new String[][]{{"1", "Lock", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};


        try {
            System.out.println("Good array amount: " + arrayAmount(array));
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Illegal size array: " + arrayAmount(illegalSizeArray));
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Illegal size array: " + arrayAmount(anotherIllegalSizeArray));
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Bad data array: " + arrayAmount(badDataArray));
        } catch (MySizeArrayException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    private static int arrayAmount(String[][] array) throws MySizeArrayException, MyArrayDataException {
        boolean badSize = false;
        int amount = 0;

        if (array.length != GOOD_SIZE) badSize = true;
        for (String[] row : array) {
            if (row.length != GOOD_SIZE) {
                badSize = true;
                break;
            }
        }

        if (badSize) throw new MySizeArrayException();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    amount += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return amount;
    }


    public static class MySizeArrayException extends Exception {

        public MySizeArrayException() {
            super("Illegal size in array");
        }
    }

    private static class MyArrayDataException extends Throwable {
        public MyArrayDataException(int i, int j) {
            super("Bad data in [" + i + "],[" + j + "]");
        }
    }
}
