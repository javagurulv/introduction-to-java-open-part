package org.javaguru.mentor.lesson_7_array_and_loops.lessoncode;

class Sum1To100 {

    public int sum1To100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;

            System.out.println("i = " + i);
            System.out.println("Sum = " + sum);

            System.out.println("----------");
        }
        return sum;
    }

}
