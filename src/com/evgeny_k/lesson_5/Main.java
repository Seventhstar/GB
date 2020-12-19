package com.evgeny_k.lesson_5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Petrov Petr", "Manager", "petr@yahoo.com", "8921123456", 25000, 35);
        employeesArray[2] = new Employee("Anna Gunn", "Accountant", "a.gunn@mail.com", "89811112233", 60000, 42);
        employeesArray[3] = new Employee("Maryl Strip", "Finance boss", "petr@yahoo.com", "8921123456", 25000, 35);
        employeesArray[4] = new Employee("Jack Ma", "Mega boss", "j.ma@baidu.com", "89998877", 125000, 45);

        for (int i = 0; i < 5; i++) {
            if (employeesArray[i].getAge() > 40)
                System.out.println(employeesArray[i]);
        }

    }

}
