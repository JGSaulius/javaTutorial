package BinarySearch;
import java.util.Scanner;

public class loopPractice {

    public static void main(String[] args) {

//        // Task 1: Counting up: print counting mubers from 1 to 5
//        int number = 1;
//
//        while (number < 6) {
//            System.out.println("Task 1: Counting Up - Number: " + number);
//            number++;
//        }
//        System.out.println("Start");
//
//        // Task 2: Counting down: print counting numbers from 10 to 1
//        int counting = 10;
//
//        while (counting != 0) {
//            System.out.println("Task 2: Counting Down - Count: " + counting);
//            counting--;
//        }
//        System.out.println("Start");
//
//        // Task 3: Assign variable candies number and variable hungry o true. Print left candies till 0 and information, about luck of candies.
//        int candies = 10;
//        boolean hungry = true;
//
//        while (hungry) {
//            System.out.println("Task 3: Candies - Candies: " + candies);
//            candies--;
//            if (candies == 0) {
//                hungry = false;
//            }
//        }
//        System.out.println("No more candies");
//
//        // Task 4: Print even numbers from 1 to 10 using a while loop.
//        int event = 1;
//        while (event <= 10) {
//            if (event % 2 == 0) {
//                System.out.println("Task 4: Print Even Numbers - " + event);
//            }
//            event++;
//        }
//
//        // Task 5: Print odd numbers from 1 to 10 using a for loop.
//        System.out.print("Task 5: Print Odd Numbers - ");
//        for (int j = 1; j <= 10; j++) {
//            if (j % 2 != 0) {
//                System.out.print(j + " ");
//            }
//        }
//        System.out.println();
//
//        // Task 6: Sum numbers from 1 to 5 using a while loop.
//        int sum = 0;
//        int k = 1;
//        while (k <= 5) {
//            sum += k;
//            k++;
//        }
//        System.out.println("Task 6: Sum = " + sum);
//
//        // Task 7: Multiply numbers from 1 to 5 using a for loop.
//        int product = 1;
//        for (int l = 1; l <= 5; l++) {
//            product *= l;
//        }
//        System.out.println("Task 7: Product = " + product);
//
//        // Task 8: Print numbers divisible by 3 from 1 to 15 using a while loop.
//        int m = 1;
//        System.out.print("Task 8: Print Divisible by 3 - ");
//        while (m <= 15) {
//            if (m % 3 == 0) {
//                System.out.print(m + " ");
//            }
//            m++;
//        }
//        System.out.println();
//
//        // Task 9: Print numbers not divisible by 4 from 1 to 20 using a for loop.
//        System.out.print("Task 9: Print Not Divisible by 4 - ");
//        for (int n = 1; n <= 20; n++) {
//            if (n % 4 != 0) {
//                System.out.print(n + " ");
//            }
//        }
//        System.out.println();
//
//        // Task 10: Print the first 5 powers of 2 using a while loop.
//        int power = 1;
//        int o = 0;
//        while (o < 5) {
//            System.out.println("Task 10: Powers of 2 - 2^" + o + " = " + power);
//            power *= 2;
//            o++;
//        }
//
//        // Task 11: Print the first 4 Fibonacci numbers using a for loop.
//        System.out.print("Task 11: Fibonacci Numbers - ");
//        int a = 0, b = 1;
//        for (int p = 0; p < 4; p++) {
//            System.out.print(a + " ");
//            int temp = a;
//            a = b;
//            b = temp + b;
//        }
//        System.out.println();
//
//        // Task 12: Print numbers from 5 to 0 in reverse using a while loop.
//        int q = 5;
//        System.out.print("Task 12: Reverse Order - ");
//        while (q >= 0) {
//            System.out.print(q + " ");
//            q--;
//        }
//        System.out.println();
//
//        // Task 13: Print numbers from 5 to 15 using a for loop with step 2.
//        System.out.print("Task 13: Print with Step 2 - ");
//        for (int r = 5; r <= 15; r += 2) {
//            System.out.print(r + " ");
//        }
//        System.out.println();
//
//
//        // Task 14: Temperature Conversion:
//        // Print temperature in fahrenheits from 0 to 100 step 10 and its equvelent in Celsius
//        System.out.println("Task 15: Fahrenheit to Celsius Conversion:");
//        for (int fahrenheit = 0; fahrenheit <= 100; fahrenheit += 10) {
//            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
//            System.out.println(fahrenheit + "°F = " + celsius + "°C");
//        }
//
//
//        // Task 15: Monthly Savings
//        // Calculate monthly saving plan for the next 12 months
//        int monthlyIncome = 1500;
//        double savingsPercentage = 0.15;
//        double monthlySavings = monthlyIncome * savingsPercentage;
//        System.out.println("Task 18: Monthly Savings Plan");
//        for (int month = 1; month <= 12; month++) {
//            System.out.println("Month " + month + ": Save $" + monthlySavings);
//        }
//
//        // Task 16: Password Attempts
//        // This code prompts the user to enter their password, checks if it matches the correct password,
//        // and allows up to three attempts.
//        // If the correct password is entered, it prints "Login successful!" and breaks out of the loop.
//        // If the maximum number of attempts is reached without the correct password,
//        // it prints "Maximum attempts reached. Access denied."
//
//        String correctPassword = "secure123";
//        int attempts = 0;
//        System.out.println("Task 19: Password Authentication");
//        while (attempts < 3) {
//            // Simulating incorrect password attempts
//            String userPassword = "wrongpassword";
//            if (!userPassword.equals(correctPassword)) {
//                System.out.println("Incorrect password. Try again.");
//                attempts++;
//            } else {
//                System.out.println("Login successful!");
//                break;
//            }
//        }
//
//
//        // With input
//        String correctPassword2 = "secure123";
//        int maxAttempts = 3;
//        int attempts2 = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Task 19: Password Authentication");
//
//        while (attempts < maxAttempts) {
//            System.out.print("Enter your password: ");
//            String userPassword = scanner.nextLine();
//
//            if (!userPassword.equals(correctPassword)) {
//                System.out.println("Incorrect password. Try again.");
//                attempts++;
//            } else {
//                System.out.println("Login successful!");
//                break;
//            }
//        }
//
//        if (attempts == maxAttempts) {
//            System.out.println("Maximum attempts reached. Access denied.");
//        }
//
//        scanner.close();
//
//        // Task 17: Calculate Electric Vehicle (EV) Range
//
//        // Write a Java code that determines the remaining distance an electric car
//        // can travel based on its kilowatt-hour (kWh) consumption per 100 kilometers
//        // and the size of its battery.
//        // The program should iterate over increasing distances driven every 10 km and,
//        // for each iteration, calculate the energy consumed, remaining battery capacity,
//        // and print the results.
//        // If the remaining battery capacity becomes negative,
//        // the program should output a message indicating that the battery is depleted and stop the calculations.
//        // Task 20: Calculate Electric Vehicle (EV) Range
//
//        // Constants for EV specifications
//        double batterySize = 75; // Battery size in kWh
//        double kWhPer100Km = 18; // Energy consumption rate in kWh per 100 km
//
//        // Variables for simulation
//        int totalKilometers = 200;
//        double remainingBattery;
//
//        System.out.println("Task 20: Calculate Electric Vehicle (EV) Range");
//
//        for (int distanceDriven = 10; distanceDriven <= totalKilometers; distanceDriven += 10) {
//            double energyConsumed = (kWhPer100Km / 100) * distanceDriven; // Energy consumed in kWh
//            remainingBattery = batterySize - energyConsumed;
//
//            // Output results for each iteration
//            System.out.println("Distance Driven: " + distanceDriven + " km");
//            System.out.println("Energy Consumed: " + energyConsumed + " kWh");
//            System.out.println("Remaining Battery: " + remainingBattery + " kWh");
//            System.out.println();
//
//            // Check if the remaining battery is depleted
//            if (remainingBattery < 0) {
//                System.out.println("Battery depleted. Stop driving.");
//                break;
//            }
//        }
//
//
//
//        // Task 18: Calculate ATM Withdrawal: successful or not
//        int accountBalance = 500;
//        int withdrawalAmount = 100;
//        System.out.println("Task 22: ATM Withdrawal");
//        while (accountBalance >= withdrawalAmount) {
//            System.out.println("Withdrawal successful. Remaining balance: $" + (accountBalance - withdrawalAmount));
//            break;
//        }




        // Switch for the IA tasks
        PasswordCheck.main(args);
        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Hi, what is your name?");
//        String studentName = scanner2.next();
//        System.out.println("Hi, " + studentName);
//
//        System.out.println("Welcome to Computer Science practice!");
//        System.out.println("Task 1: Calculate the file size of an image with a given color depth.");
//        System.out.println("Task 2: Convert a decimal fraction to 8 bits binary (4 bits integer + 4 bits fractional).");
//        System.out.println("Task 3: Convert letters to binary ASCII codes.");
//        boolean noEnd = true;
//        while (noEnd) {
//            System.out.print("Please choose a task (1, 2 or 3) or 0 for random or 9 for exit: ");
//            int taskNumber = scanner2.nextInt();
//
//            if (taskNumber == 0) {
//                taskNumber = 1 + (int) (Math.random() * 3);
//            }
//
//            switch (taskNumber) {
//                case 1:
//                    System.out.println("Task 1: Calculate the file size of an image with a given color depth.");
//                    break;
//                case 2:
//                    System.out.println("Task 2: Convert a decimal fraction to 8 bits binary (4 bits integer + 4 bits fractional).");
//                    break;
//                case 3:
//                    System.out.println("Task 3: Convert letters to binary ASCII codes.");
//                    break;
//                case 9:
//                    noEnd = false;
//                    break;
//                default:
//                    System.out.println("Please, choose correct task");
//
//            }
//
//        }
    }

}




