package individualTask;

import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        reverse();
        exercise6();
        exercise10();
        exercise8();
        exercise4();
    }


    private void printJohn() {
        System.out.println("Hello");
        System.out.println("John");
    }

    private static void reverse() {

        StringBuilder reverseWord = new StringBuilder("avaJ");
        reverseWord.reverse();
        System.out.println(reverseWord);

    }

    private static void exercise6() {
        String java = "Java";
        String fundamentals = "Fundamentals";

        String newWord = java.concat(fundamentals).substring(1, 15);
        System.out.println(newWord);


    }

    private static void exercise10() {
        String word = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        char[] wordInChar = word.toCharArray();
        int numbers = 0;
        int letters = 0;

        for (char c : wordInChar) {
            if (Character.toString(c).matches("[0-9]")) {
                numbers++;
            } else if (Character.toString(c).matches("[a-zA-Z]")) {
                letters++;
            }
        }

        System.out.println("numbers: " + numbers);
        System.out.println("letters: " + letters);
    }

    private static void exercise8() {
        int[] integers = new int[]{1, 7, 3, 10, 9};

        int[] integersSorted = Arrays.stream(integers).sorted().toArray();
        System.out.println(integersSorted[integersSorted.length - 2]);

        Arrays.stream(integers).sorted().filter(i -> i == integers[integers.length - 2]).forEach(System.out::println);
    }

    private static void exercise4() {
        int[] integers = new int[100];
        for (int i = 0; i < 100; i++) {
            integers[i] = i;
        }
        Arrays.stream(integers).filter(i -> i % 5 == 0 && i % 3 == 0).forEach(System.out::println);
    }
}
