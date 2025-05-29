import java.lang.foreign.SymbolLookup;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) throws InterruptedException {
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

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();


        }

    }
