package org.javaguru.mentor.lesson_5_methods.lessoncode;

class MaxNumber {

    int findMax(int number1, int number2, int number3) {
        int maxNumber = findMax(number1, number2);
        maxNumber = findMax(maxNumber, number3);
        return maxNumber;
    }

    int findMax(int number1, int number2) {
        return Math.max(number1, number2);

        /*if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }*/

        //return (number1 > number2) ? number1 : number2;
    }

}
