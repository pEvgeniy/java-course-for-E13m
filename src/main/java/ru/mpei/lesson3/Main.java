package ru.mpei.lesson3;

public class Main {
    public static void main(String[] args) {
        int[] grades = {3, 4, 3, 3, 2};

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        for (int grade : grades) {
            System.out.println(grade);
        }

        int i = 0;
        while (i < 5) {
            System.out.println(grades[i]);
            i++;
        }
    }
}
