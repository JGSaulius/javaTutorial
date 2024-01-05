public class ConditionalPractice {

    public static void main(String[] args) {

/*        // Task 1: Simple Comparison
        // Assign two integers and print which one is greater or if they are equal.
        int num1 = 5, num2 = 8;
        if (num1 > num2) {
            System.out.println("Task 1: First number is greater.");
        } else if (num1 < num2) {
            System.out.println("Task 1: Second number is greater.");
        } else {
            System.out.println("Task 1: Both numbers are equal.");
        }

        // Task 2: Even or Odd
        // Assign an integer and print whether it's even or odd.
        int number = 12;
        if (number % 2 == 0) {
            System.out.println("Task 2: The number is even.");
        } else {
            System.out.println("Task 2: The number is odd.");
        }

        // Task 3: Positive/Negative/Zero
        // Assign an integer and print if it's positive, negative, or zero.
        int num = -7;
        if (num > 0) {
            System.out.println("Task 3: The number is positive.");
        } else if (num < 0) {
            System.out.println("Task 3: The number is negative.");
        } else {
            System.out.println("Task 3: The number is zero.");
        }

        // Task 4: Leap Year
        // Assign a year and print whether it's a leap year or not.
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Task 4: " + year + " is a leap year.");
        } else {
            System.out.println("Task 4: " + year + " is not a leap year.");
        }

        // Task 5: Vowel or Consonant
        // Assign a character and print whether it's a vowel or consonant.
        char ch = 'A';
        if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println("Task 5: " + ch + " is a vowel.");
        } else {
            System.out.println("Task 5: " + ch + " is a consonant.");
        }

        // Task 6: Largest of Three
        // Assign three integers and print the largest among them.
        int a = 15, b = 9, c = 12;
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("Task 6: The largest number is: " + largest);

        // Task 7: Grade Calculator
        // Assign a score and print the corresponding grade.
        int score = 85;
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Task 7: Your grade is: " + grade);

        // Task 8: Simple Calculator
        // Assign two numbers and an operator, then perform the operation and print the result.
        int num1Calc = 10, num2Calc = 5;
        char operator = '*';
        double result;
        switch (operator) {
            case '+':
                result = num1Calc + num2Calc;
                break;
            case '-':
                result = num1Calc - num2Calc;
                break;
            case '*':
                result = num1Calc * num2Calc;
                break;
            case '/':
                result = (double) num1Calc / num2Calc;
                break;
            default:
                System.out.println("Task 8: Invalid operator");
                return;
        }
        System.out.println("Task 8: Result: " + result);

        // Task 9: Positive Difference
        // Assign two numbers and print their positive difference.
        int num1Diff = 15, num2Diff = 8;
        int difference;
        if (num1Diff > num2Diff) {
            difference = num1Diff - num2Diff;
        } else {
            difference = num2Diff - num1Diff;
        }
        System.out.println("Task 9: The positive difference is: " + difference);

//        // Task 10: Day of Week
//        // Assign a number representing a day of the week and print the corresponding day.*/
//        int dayOfWeek = 1;
//        switch (dayOfWeek) {
//            case 1: {
//                System.out.println("Task 10: Monday" + dayOfWeek);
//                dayOfWeek++;
//            }
//            case 2:
//                System.out.println("Task 10: Tuesday"+dayOfWeek);
//                dayOfWeek++;
//            case 3:
//                System.out.println("Task 10: Wednesday");
//
//            case 4:
//                System.out.println("Task 10: Thursday");
//
//            case 5:
//                System.out.println("Task 10: Friday");
//                break;
//            case 6:
//                System.out.println("Task 10: Saturday");
//                break;
//            case 7:
//                System.out.println("Task 10: Sunday");
//                break;
//            default:
//                System.out.println("Task 10: Invalid day");
//        }
//
//        // Task 11: Temperature Converter
//        // Assign a temperature in Celsius and print its equivalent in Fahrenheit.
//        double celsiusTemp = 25;
//        double fahrenheitTemp = (celsiusTemp * 9/5) + 32;
//        System.out.println("Task 11: " + celsiusTemp + " degrees Celsius is equal to " + fahrenheitTemp + " degrees Fahrenheit.");
//
//        // Task 12: Check for Prime
//        // Assign a number and print whether it's a prime number or not.
//        int numberPrime = 13;
//        boolean isPrime = true;
//        for (int i = 2; i <= Math.sqrt(numberPrime); i++) {
//            if (numberPrime % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println("Task 12: " + numberPrime + " is a prime number.");
//        } else {
//            System.out.println("Task 12: " + numberPrime + " is not a prime number.");
//        }
//
//        // Task 13: Time Converter
//        // Assign seconds and print the equivalent time in hours, minutes, and seconds.
//        int seconds = 3665;
//        int hours = seconds / 3600;
//        int minutes = (seconds % 3600) / 60;
//        int remainingSeconds = seconds % 60;
//        System.out.println("Task 13: Hours: " + hours + ", Minutes: " + minutes + ", Seconds: " + remainingSeconds);
//
//        // Task 14: Character Case Conversion
//        // Assign a character and convert it to uppercase if it's lowercase and vice versa.
//        char chConvert = 'a';
//        if (Character.isLowerCase(chConvert)) {
//            chConvert = Character.toUpperCase(chConvert);
//        } else if (Character.isUpperCase(chConvert)) {
//            chConvert = Character.toLowerCase(chConvert);
//        }
//        System.out.println("Task 14: Converted character: " + chConvert);
//
//        // Task 15: Discount Calculator
//        // Assign original price and discount percentage, then calculate and print the discounted price.
//        double originalPrice = 100.0;
//        double discountPercentage = 20.0;
//        double discountedPrice = originalPrice - (originalPrice * discountPercentage / 100);
//        System.out.println("Task 15: Discounted price: " + discountedPrice);
//
//        // Task 16: Check Palindrome
//        // Assign a string and print whether it's a palindrome or not.
//        String strPalindrome = "";
//        boolean isPalindrome = true;
//        for (int i = 0; i < strPalindrome.length() / 2; i++) {
//            if (strPalindrome.charAt(i) != strPalindrome.charAt(strPalindrome.length() - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//        if (isPalindrome) {
//            System.out.println("Task 16: " + strPalindrome + " is a palindrome.");
//        } else {
//            System.out.println("Task 16: " + strPalindrome + " is not a palindrome.");
//        }
//
//        // Task 17: Age Group Classifier
//        // Assign an age and print whether the person is a child, teenager, adult, or senior.
//        int ageClassifier = 25;
//        if (ageClassifier < 0) {
//            System.out.println("Task 17: Invalid age.");
//        } else if (ageClassifier <= 12) {
//            System.out.println("Task 17: Child");
//        } else if (ageClassifier <= 19) {
//            System.out.println("Task 17: Teenager");
//        } else if (ageClassifier <= 59) {
//            System.out.println("Task 17: Adult");
//        } else {
//            System.out.println("Task 17: Senior");
//        }
//    }




//        int x = 50;
//        double y = 3.84;
//        double z = 1e50;
//        System.out.println(x / 2);  // 25
//        System.out.println(x * y); // 192.0
//        System.out.println(x * x * x); //125000
//        System.out.println(x * x * x * x);//6250000
//        System.out.println(x * z); // 5.0000000000000006e51


//
//        int num = 57;
//        int d = num / 6;
//        int r = num % 6;
//        System.out.println("Div = " + d); // Div = 9
//        System.out.println("Rem = " + r); // Rem = 3
//        System.out.println(6 * d + r); //57



//        String x = "X";
//        String y = "YY";
//        String z = "ZZZ";
//        System.out.println(1 + x + 2 + y + 3 + z);
//        System.out.println(x + y + z + 1 + 2 + 3);
//        System.out.println(x + y + z + (1 + 2) + 3);

       // 1X2YY3ZZZ
        //        XYYZZZ123
      //  XYYZZZ33

//
//        int x = 3, y = 7, z = 10;
//        boolean sum = ((x + y) == z);
//        boolean singleDigits = (x < 5 && y < 5 && z < 5);
//        boolean equation = ((3 * y - 2 * x + z) == 0);
//        boolean multiples = (x % 2 == 0 || y % 3 == 0 || z % 5 == 0);
//        boolean ascendingOrder = (x < y && y < z && z < (x + y));
//        System.out.println("Value of x: " + x);
//        System.out.println("Value of y: " + y);
//        System.out.println("Value of z: " + z);
//        System.out.println("Value of sum: " + sum);
//        System.out.println("Value of singleDigits: " + singleDigits);
//        System.out.println("Value of equation: " + equation);
//        System.out.println("Value of multiples: " + multiples);
//        System.out.println("Value of ascendingOrder: " + ascendingOrder);
   // }


            int   candies = 10;
            boolean hungry = true;

            while (hungry) {
                System.out.println("Candies: "+ candies);
                candies --;
                if (candies == 0) {
                    hungry = false;
                }
            }
            System.out.println("No more candies");

        int   number = 10;

        while (number != 1) {
            System.out.println("Number: "+ number);
            number --;

        }
        System.out.println("No more candies");







    }
}
