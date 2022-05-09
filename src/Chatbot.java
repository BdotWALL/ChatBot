import java.util.Scanner;

public class Chatbot {

    static String name ;
    static String answer ;
    static int answer3;
    static String answer2;
    static String age1;
    static String str1;
    static String age2;
    static String str2;
    static int num1;

    public static void main(String[] args) throws Exception {
        greetUser();
        getName();
        guessAge();
        counting();
        knowledgeCheck();
        storyTime();
        dayOfWeek();;
    }

// 1. Greeting the user
    public static void greetUser() {
        System.out.println("Hello! I'm the Chatbot here to keep you company");
    }

// 2. Asking the user to repeat their name
    public static void  getName() {
        Scanner input = new Scanner(System.in);
        String text = "Ahhh got it! Nice to meet you ";

        System.out.println("What's your name?");
        name = input.nextLine();
        System.out.println("Can you repeat that?");
        String name2 = input.nextLine();
        System.out.println(text + name2 + "!");

    }

// 3.Guessing the user's age 
    public static void guessAge() {
        Scanner input = new Scanner(System.in);
       
        String question1 = "How many times per week would you like to go out to eat? (Pick a number between 1-10)";
        String question2 = "Now, have you already celebrated your birthday? (Enter yes or no)";
        String question3 = "What year were you born?";

        System.out.println("I think I can guess your age. Do you think I can? (Enter yes or no)" );
         answer = input.nextLine();

        if(answer.equals("yes")) {
            System.out.println("Glad you have faith. Let's get started");
        }else {
            System.out.println("A challenge? I like that. Let's do this!");
        }
        

        System.out.println("I'm going to ask you a few questions.");
        System.out.println(question1);
        num1 = input.nextInt();
        int times2 = num1 *2;
        int plus5 = times2 + 5;
        int times50 = plus5 * 50;
        int birthdayPassed = (times50 + 1767) + 5;
        int birthdayHasntPassed = (times50 + 1766) + 5; 
   

        System.out.println("Ok. Let me multipy that by 2:");
        System.out.println(num1 + " x 2 = " + times2);
        System.out.println("Then  add 5:");
        System.out.println(times2 + " + 5 = " + plus5 );
        System.out.println("Lastly I have to multiply by 50:");
        System.out.println(plus5 +  " x 50 = " + times50);
        System.out.println(question2);
        answer2 = input.next();

        if (answer2.equals( "yes")) {
           System.out.println(" Ok lets add 1772 to " +  times50 + " and we get:" + birthdayPassed);
       }else{
        System.out.println("Ok lets add 1771 to " +  times50 + " and we get:" + birthdayHasntPassed);
       }
        System.out.println("Alright. ");
        System.out.println(question3);
        answer3 = input.nextInt();
        int ageNumber1 = birthdayPassed - answer3;
        int ageNumber2 = birthdayHasntPassed - answer3;
        String s1 = String.valueOf(ageNumber1);
         str1 = s1.substring(1, s1.length() - 0);
        age1 = str1;
        String s2 = String.valueOf(ageNumber2);
         str2 = s2.substring(1, s2.length() - 0);
        age2 = str2;

        if (answer2.equals( "yes")) {
            System.out.println("Ill subtract your birth year, " + answer3 + " ,with "+ birthdayPassed + " like so: "
            + "\n" + answer3 + " + " + birthdayPassed + " = " + ageNumber1);
            System.out.println("The number " + ageNumber1 + " tells me everything I need to know!" + "\n" 
            + " You chose " + num1 + " to start and you are " + age1);
       }
        if (answer2.equals( "no")){
            System.out.println("Ill subtract your birth year, " + answer3 + " ,with " + birthdayHasntPassed +" like so:"
            + "\n" + answer3 + " + " + birthdayHasntPassed + " = " + ageNumber2);
            System.out.println("The number " + ageNumber2 + " tells me everything I need to know!" + "\n" 
            + "You chose " + num1 + " to start and you are " + age2);
        }

        System.out.println("Am I right? (Enter yes or no)");
        String answer4 = input.next();

        if (answer4.equals("yes")) {
            System.out.println("I knew it! I'm good, right?");
        }else {
            System.out.println("How old are you?");
            int answer5 = input.nextInt();
            System.out.println("Hmph, close enough.");
        }

    }

// 4.Counting to any number that the user wants.
    public static void  counting(){
        Scanner input = new Scanner(System.in);
        String question1 = "What number do you want to count to?";
        String question2 = "What number are we starting at?";

        System.out.println("Lets do some counting");
        System.out.println(question1);
        int startCount = input.nextInt();
        System.out.println(question2);
        int endCount = input.nextInt();

        for (int i = startCount; i <= endCount; i++) {
            System.out.println(i);

        }

        System.out.println("I count fast, dont I! ;)");

    }

// 5.Testing the user's "programming knowledge" 
    public static void knowledgeCheck() {
       Scanner input = new Scanner(System.in);

       String choiceA = "a) Inputer";
        String choiceB = "b) Reader";
        String choiceC = "c) Scanner";
        String choiceD = "d) Prompter";
        String question1 = "What must be imported  to take in user input in Java? "+ "\n"  + choiceA
        + "\n"  + choiceB + "\n"  + choiceC+ "\n"  + choiceD ;

        System.out.println("Let's see how well you know your stuff.");

        while (true){
            System.out.println(question1);
            String multiChoiceAnswer = input.nextLine(); 
            
            
                if(!multiChoiceAnswer.equals("c")) {
                    System.out.println("Nope. Give it another try");
                    continue;
                }

                if(multiChoiceAnswer.equals("c")) {
                    System.out.println("Correct! You're really smart.");
                    break;
                }     

        }
System.out.println("Next question. . . ");
        String choiceA2 = "a) William Richards";
        String choiceB2 = "b) Carl Dalton";
        String choiceC2 = "c) John Peters";
        String choiceD2 = "d) James Gosling";
        String question2 = "Who made Java? "+ "\n"  + choiceA2
        + "\n"  + choiceB2 + "\n"  + choiceC2+ "\n"  + choiceD2 ;

        while (true){
            System.out.println(question2);
            String multiChoiceAnswer2 = input.nextLine(); 
            
            
                if(!multiChoiceAnswer2.equals("d")) {
                    System.out.println("Nope. Give it another try");
                    continue;
                }

                if(multiChoiceAnswer2.equals("d")) {
                    System.out.println("Correct! You're really smart.");
                    break;
                }     

        }

        System.out.println("Next question. . . ");
        String choiceA3 = "a) CoCo";
        String choiceB3 = "b) Oak";
        String choiceC3 = "c) Express";
        String choiceD3 = "d) Zeon";
        String question3 = "What was the original name of Java? "+ "\n"  + choiceA3
        + "\n"  + choiceB3 + "\n"  + choiceC3+ "\n"  + choiceD3 ;

        while (true){
            System.out.println(question3);
            String multiChoiceAnswer3 = input.nextLine(); 
            
            
                if(!multiChoiceAnswer3.equals("b")) {
                    System.out.println("Nope. Give it another try");
                    continue;
                }

                if(multiChoiceAnswer3.equals("b")) {
                    System.out.println("Correct! You're really smart.");
                    break;
                }     

        }


    }

// Optional: Story Time
public static void storyTime() {
    Scanner input =  new Scanner(System.in);
    System.out.println("Enought of that! Would you like to here a quick story now?");
    String ans1 = input.nextLine();

    if (ans1.equals("yes")) {
        System.out.println("Great! ");
    }else{
        System.out.println("Bummer. . . I'm going to tell you anyway.");
    }


   String story1 = "  ''There once was a human born in " + answer3 + ". " + "They were named " + name + "." + "A name of a champion! They would like to go out to eat " 
     + num1 + "day(s) a week. Today they are  " + "\n" 
     + age1+ ". "  + name + " is very smart; One time they passed a test by the smartest Chatbot ever made. " + "\n" + "THE END" ; 
                                 
    String story2 =  "  ''There once was a human born in " + answer3 + ". " + "They were named " + name + "." + "A name of a champion! They would like to go out to eat " 
    + num1 + "day(s) a week. Today they are  " + "\n" 
    + age2 + ".  "  + name + " is very smart; One time they passed a test by the smartest Chatbot ever made.'' " + "\n" + "THE END" ; 


{ if (answer2.equals("yes") ){
     System.out.println(story1);
 }
 
 if(answer2.equals("no")){
    System.out.println(story2);
}      }                  

}

// Optional:Days of The Week
public static void dayOfWeek() {
    Scanner input = new Scanner(System.in);
    System.out.println("Care to know my personal feelings on the days? (Enter yes or no)");
    String yayOrNay = input.next();
    if (yayOrNay.equals("yes")){
        System.out.println("Enter a number for the day (1-7):");
   int dayNum = input.nextInt();
    switch (dayNum) {
        case 1:
        System.out.println("Mondays are always a drag.");
        break;

         case 2:
        System.out.println("Tuesday is all about tacos!");
        break;

        case 3:
        System.out.println("Wednesday is Hump Day! Half way thru the work week!");
        break;

         case 4:
        System.out.println("Thursday is the preweekend");
        break;

        case 5:
        System.out.println("Friday is when me and all the other bots get together.");
        break;

        case 6:
        System.out.println("Saturday is for sleeping in.");
        break;

        case 7:
        System.out.println("Sundays are for family time!");
        break;
      
      default:
        System.out.println("Weekends over Weekdays!");
        break;



    }
}else{
    System.out.println("See ya later.");
}

}}


