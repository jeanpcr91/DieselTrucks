import java.lang.foreign.SymbolLookup;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*
        boolean isStudent = true;
        boolean isSenior;
        double price = 9.99;

        if (isStudent){
            System.out.println("You get a Student discount of 10%");
            price *= 0.9;
        }
        else{
            price *= 1;
        }

        System.out.printf("The price of a ticket is: $%.2f", price);

         */
        // STRING METHOD
        /*String name = "Jean Paul";

        //int length = name.length();
        //char letter = name.charAt(8);
        //int index = name.indexOf("P");
        //int lastIndex = name.lastIndexOf("u");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name. replace("a","e");

        if (name.isEmpty()){
            System.out.println("Your mame is Empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        if (name.contains("a")){
            System.out.println("Your name contains an 'a' char");
        }
        else{
            System.out.println("Your name DOESN'T contain any 'a' char");
        }

        if(name.equals("password")){
            System.out.println("Your name cant be password");
        }
        else{
            System.out.println("Hello ");
        }

        System.out.println(name);

         */
        // SUBSTRING METHOD
        /*        // This is a method used to extract a portion of a string

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = scanner.nextLine();

        if(email.contains("@")) {

            //String email = "jeanpcr91@gmail.com";

            //String username = email.substring(0,email.indexOf("@"));
            //String domain = email.substring(email.indexOf("@")+1);
            //String domain2 = email.substring(email.indexOf("@"));

            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }
        //System.out.println(domain2);

        scanner.close();

         */
        //WEIGHT CONVERSION PROGRAM
        /*
        Scanner scanner = new Scanner(System.in);

        //Declare variables
        double weight;
        double newWeigth;
        int choice;
        //Welcome message
        System.out.println("Wigth conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        //prompt for user choice
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        //option 1 convert lbs to kgs
        if (choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeigth = weight*0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeigth);
        }
        //option 2 convert kgs to lbs
        else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeigth = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeigth);
        }
        // else print not a valid choice
        else{
            System.out.println("That was not a valid choice");
        }
        scanner.close();

         */
        //TERNARY OPERATOR
        /*
        int score = 70;

        if (score>=6.){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

         */
        /*
        int score = 73;

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

        int number = 3;

        String evenOrOdd = (number%2 == 0) ? "EVEN": "ODD";
        System.out.println(evenOrOdd);

        int hours = 13;

        String timeOfDay = (hours <12) ? "AM" : "PM";
        System.out.println(timeOfDay);

        int income = 60000;

        double taxRate = (income>=40000) ? 0.25 : 0.15;

        System.out.println(taxRate);

         */
        //TEMPERATURE CONVERTER
        /*
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        //System.out.println(temp);
        //System.out.println(unit);

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9/5) + 32 ;

        System.out.printf("%.1f°%s",newTemp, unit);

        scanner.close();

         */
        //ENHANCED SWITCH = replace many if statements
        /*
        String day = "Pizza day";
        switch (day){



            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is the weekend");
            case "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");



            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"-> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("it is the weekend");
            default -> System.out.println(day + " is not a day");
        }

         */
        //NUMBER GUESSING GAME
        /*
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max + 1);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess<randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if (guess>randomNumber) {
                System.out.println("TOO HIGH! Try again");
            }
            else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }


        }while(guess != randomNumber);

        scanner.close();

         */
        //FOR LOOP
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++){

            System.out.println(i);
        }

        scanner.close();

         */
        //COUNTDOWN
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();

         */
        //NESTED LOOPS
        /*
        for (int i = 1; i <= 3; i++){

            for(int j = 1; j <= 9; j++){

                System.out.print(j + " ");

            }
            System.out.println();
        }

         */
        //MATRIX GRAPHICS
        /*
        int rows;
        int columns;
        String symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Matrix Graph");
        System.out.println("You must insert the folowing data: ");
        System.out.print("choose the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("choose the number of columns: ");
        columns = scanner.nextInt();
        System.out.print("choose the String you want: ");
        symbol = scanner.next();

        System.out.println("The matrix will be: " + rows + "*" + columns + " of " + symbol);

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();

         */
        // TRY, CATCH AND FINALLY STATEMENT
        /*
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }

         */
        //EXAMEN SORPRESA
        /*
        int i;
        for(i = 20; i > 0; i-- ){

            System.out.println(i);
        }

         */
        /*
        String text1 = "Chocolate no come chocolate porque el chocolate le hace daño";
        Pattern choc = Pattern.compile("daño", Pattern.CASE_INSENSITIVE);
        Matcher matcher = choc.matcher(text1);
        boolean mathcFound = matcher.find();
        if (mathcFound){

            System.out.printf("Creo que vamos bien");
        }
        else{
            System.out.println("Pipipiiipiiiiii");
        }

         */
        //METHOD DISCUSS
        //method = a block of reusable code that is executed when called ()
        /*
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");

         */
        //BANKING PROGRAM
        /*
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){

            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){

                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;

                default -> System.out.println("invalid choice");
            }

        }

        System.out.println("****************************");
        System.out.println("Thank You, have a nice day!!");
        System.out.println("****************************");

        scanner.close();

        }

        static void showBalance(double balance){
            System.out.println("***************");
            System.out.printf("S %.2f\n", balance);
            System.out.println("***************");
        }
        static double deposit (){

            Scanner scanner1 = new Scanner(System.in);
            double amount;
            System.out.println("Enter an amount to be deposited: ");
            amount = scanner1.nextDouble();

            if(amount < 0){
                System.out.println("***************");
                System.out.println("Amount can't be negative");
                System.out.println("***************");
                return 0;
            }
            else {
                System.out.println("***************");
                System.out.println("The amount has been deposited");
                System.out.println("***************");
                return amount;
            }

        }
        static double withdraw (double balance){

            double amount;
            Scanner scanner2 = new Scanner(System.in);

            System.out.print("Enter the amount to be withdraw: ");
            amount = scanner2.nextDouble();

            if (amount>balance){
                System.out.println("INSUFFICIENT FUNDS");
                return 0;
            }
            else if (amount < 0) {
                System.out.println("Amount can´t be negative");
                return 0;
            }
            else {
                return amount;
            }

         */
        //JAVA DICE ROLLER PROGRAM
        /*
        DECLARE VARIABLES
        GET # OF DICE FROM THE USER
        CHECK IF # OF DICE > 0
        ROLL ALL THE DICE
        GET THE TOTAL
        DISPLAY ASCII OF DICE
         */
        /*

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();

         */
        //ARRAYS
        /*
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[2]  = "pineapple";

        //System.out.println(fruits[3]);

        for (int i = 0; i < fruits.length; i++){

            System.out.print(fruits[i] + " ");
        }

         */
        /*
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 2;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++){

            if (target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not found in the array");
        }

         */
        //SERCH IN AN ARRAY
        /*
        String[] fruits = {"apple", "orange", "banana"};
        String target = "orange";
        boolean isFound = false;

        for (int i = 0; i < fruits.length; i++) {

            if (fruits[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }

        }

         */
    /*
    static void printDie (int roll){

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ● ● ● |
                |       |
                | ● ● ● |
                 -------
                """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }

    }

     */
        //VARARGS
        /*
        System.out.println(add(1, 2, 3, 4));
        System.out.println(average(1, 2, 3, 4));

         */
        //2D ARRAYS
        /*
        String [] fruits = {"apple", "orange", "banana"};
        String [] vegetables = {"potato", "onion", "carrot"};
        String [] meats = {"chicken", "pork", "beef", "fish"};

        String [][] groceries = {fruits, vegetables, meats};

        for (String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

         */
        /*
        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for (char[] row : telephone){
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }}

         */
        //JAVA QUIZ GAME
        /*
        String [] questions = {"What is the main function of a router?",
                               "Which part of the computer is considered the brain?",
                               "What year was Facebook launched?",
                               "Who is known as the father of computer?",
                               "What was the first programming language?"};
        String [][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                               {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                               {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                               {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                               {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"},};

        int [] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score ++;
            }
            else {
                System.out.println("********");
                System.out.println(" WRONG! ");
                System.out.println("********");
            }
        }

        System.out.println("Your final scores is: " + score + " out of " + questions.length);

         */
        //ROCK PAPER SCISSORS
        /*
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String [] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.next().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
            }

            else {
                System.out.println("You lose!");
            }

            System.out.print("Play again (yes/no): ");
            playAgain = scanner.next().toLowerCase();
        }
        while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

         */
        //SLOT MACHINE PROGRAM
        /*
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("*************************");

        while(balance > 0){
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if (bet <=0){
                System.out.println("Bet must be greater than 0");
                continue;
            }
            else {
                balance -= bet;
            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0){

                System.out.println("You won $" + payout);
                balance += payout;

            }
            else {
                System.out.println("Sorry you lost this round");
            }
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.next().toUpperCase();

            if (!playAgain.equals("Y")){
                break;
            }

        }

        System.out.println("GAME OVER! Your final balance is $" + balance);

         */


    }

    //VARARGS variable arguments methods
    /*
    static int add(int... numbers){

        int sum = 0;
        for (int number : numbers){
            sum+= number;
        }
        return sum;

    }
    static double average(double... numbers){
        double total = 0;
        for (double number : numbers){
            total += number;
        }
        return total / numbers.length;
    }

     */
    //JAVA SLOTS MACHINE methods
    /*
    static String [] spinRow () {

        String [] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String [] row = new String [3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){

            row[i] = symbols[random.nextInt(symbols.length)];

        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + row[0] + " | " + row[1] + " | " + row[2]);
        System.out.println("**************");
    }
    static int  getPayout(String[] row, int bet){

        if  (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;

            };
        }
        else if (row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;

            };
        }
        else if (row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;

            };
        }
        else if (row[0].equals(row[2])){
            return switch (row[2]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;

            };
        }
        return 0;
    }

     */

}