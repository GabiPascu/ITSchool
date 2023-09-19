package session5.challenges;

public class Challenge3 {

    //Given an array of integers, write a program to count and print the number of negative integers in the array.

        public static void main(String[] args) {
            int[] arr = {-1, 2, -3, 4, -5, 6, -7};

            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    count++;
                }
            }

            System.out.println("Number of negative integers in the array: " + count);
        }
    }
