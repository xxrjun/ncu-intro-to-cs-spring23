/**
 * Assignment 01
 * Name: 鄒翔宇
 * Student Number: 109403019
 * Course 2023_CE1002_B
 */

import java.util.Scanner;

public class A1_109403019 {

    public static void main(String[] args) {
        // Initialize variables.
        int inputHeight = 0;
        int inputWeight = 0;
        double BMI = 0;

        // Create a Scanner and get user input.
        Scanner input = new Scanner(System.in);
        inputHeight = input.nextInt();
        inputWeight = input.nextInt();


        // Get BMI.
        BMI = calculateBMI(inputHeight, inputWeight);
        //System.out.println("BMI: " + BMI);


        // Output
        if (BMI >= 18.5 && BMI < 24) {
            System.out.println("正常");
        } else if (BMI >= 24 && BMI < 27) {
            System.out.println("過重");
        } else if (BMI >= 27 && BMI < 30) {
            System.out.println("輕度肥胖");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("中度肥胖");
        } else if (BMI >= 35) {
            System.out.println("重度肥胖");
        }

        // Close Scanner.
        input.close();

    }

    public static double calculateBMI(int height, int weight) {
        double heightInMeter = (double)height / 100;

        return weight / (heightInMeter * heightInMeter) ;
    }

}

