import Interfaces.*;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[] nums =  {1, 2, 3, 4, 5};
        int[] repeated = {3,7,7,4,7,1};

        // Exercise 01
        IAverage average = numbers -> {
            float total = 0;
            for (int num: numbers) {
                total += num;
            }
            return total / numbers.length;
        };

        float result1 = average.average(nums);
        System.out.printf("Average: %.2f\n", result1);

        // Exercise 02
        IFactorial factorial = num -> {
            int total = 1;
            for (int i = 1; i <= num; i++) {
                total *= i;
            }
            return total;
        };

        int result2 = factorial.factorial(5);
        System.out.printf("Factorial: %d\n", result2);

        // Exercise 03
        IEven even = num -> num % 2 == 0;
        boolean result3 = even.isEven(8);
        System.out.printf("This number is even? : %b\n", result3);

        // Exercise 04
        IGreaterLower greater = numbers -> {
          int greaterNum = numbers[0];
            for (int num : numbers) {
                if(num > greaterNum) {
                    greaterNum = num;
                }
            }
            return greaterNum;
        };

        int result4 = greater.validate(nums);
        System.out.printf("Greater number in the array: %d\n", result4);

        // Exercise 05
        IGreaterLower lower = numbers -> {
            int lowerNum = numbers[0];
            for (int num : numbers) {
                if(num < lowerNum) {
                    lowerNum = num;
                }
            }
            return lowerNum;
        };

        int result5 = lower.validate(nums);
        System.out.printf("Lower number in the array: %d\n", result5);

        // Exercise 06
        IRepeat repeat = numbers -> {
            int mostRepeated = 0, num = 0;
            HashMap<Integer, Integer> count = new HashMap<>();

            for (int key : repeated) {
                count.merge(key, 1, Integer::sum);
            }

            for (HashMap.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() > num) {
                    num = entry.getValue();
                    mostRepeated = entry.getKey();
                }
            }
            return mostRepeated;
        };

        int result6 = repeat.repeat(repeated);
        System.out.printf("The most repeated number is: %d\n", result6);

        // Exercise 07
        IGreaterNum greaterNum = (num1, num2, num3) -> {
            if(num1 > num2) {
                if(num1 > num3) {
                    return num1;
                }
                else {
                    return num3;
                }
            } else if(num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        };

        int result7 = greaterNum.greater(8,7,19);
        System.out.printf("The greater number is: %d\n", result7);

        // Exercise 08
        IRepeatString word = (str, rep) -> {
            String total = "";
            for (int i = 0; i < rep; i++) {
                total+=str;
            }
            return total;
        };

        String result8 = word.wordRepeater("Hello", 3);
        System.out.println(result8);

    }
}
