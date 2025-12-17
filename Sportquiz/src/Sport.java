import java.util.Scanner;
/**
 *  
 */
public class Sport
{
    public static void main(String[]args){

        

        /*Declare a scanner */
        Scanner scan = new Scanner(System.in);

        /* declare score, correct answer, incorrect answers*/
        int score = 0;
        String correctAnswer;
        String incorrectanswer;
        String question ;
        String useranswer;
        String response;
        boolean playAgain;

        /* Display message introducing quiz and its rules*/
        System.out.println("welcome to the sports quiz");
        System.out.println("\n each question you must input answers A,B or C for hint enter H or h");
        System.out.println("answer will be displayed straight after answering");

        do{
            //QUESTION 1*/
            String question1 = "Which country is most known for ice hockey?";
            System.out.println("\n" + question1);
            System.out.println("A) brazil");
            System.out.println("B) canada");
            System.out.println("C) iceland");
            correctAnswer = "B";

            /* 3 process user answer*/

            do{
                /* 3.1 ask the users for answer (Y) */
                System.out.print("enter answer ( A,B,C,H, ) ");
                useranswer = scan.nextLine();

                /*3.2 if answer not (A,B,C,H,h ) display error message and return to to 3.1 */
                if (!useranswer.equalsIgnoreCase("A") && !useranswer.equalsIgnoreCase("B") && !useranswer.equalsIgnoreCase("C")&&  !useranswer.equalsIgnoreCase("H"))
                    System.out.print ("error enter (A,B,C,H,h ) ");
            }while(!useranswer.equalsIgnoreCase("A") && !useranswer.equalsIgnoreCase("B") && !useranswer.equalsIgnoreCase("C")&&  !useranswer.equalsIgnoreCase("H"));

            /*3.3 if put in answer let the user know if their right or wrong (Y) */
            if (useranswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct answer!");
                score+= 3;
            }
            else{
                System.out.println("incorrect answer!");
                score--;

                /* 4 if h/H give user hint then return to step 2 (Y) */
                if(useranswer.equalsIgnoreCase("h"))
                    System.out.println( "hint: the flag is white and red");
                useranswer = scan.nextLine();
                score+= 0.5;

                /* 6 update score after each question(Y) */
                System.out.println("Your current score is: " + score) ; 


            }
          
            System.out.println("After question 1 the score is " + score);
        
            
            
            
            //QUESTION 2*/
            String question2 = "\n\nWhich of the following sports was invented first?";
            System.out.println("\n" + question2);
            System.out.println("A) wrestling");
            System.out.println("B) soccer ");
            System.out.println("C)baseball ");
            correctAnswer = "A";

            /* 3 process user answer*/

            do{
                /* 3.1 ask the users for answer (Y) */
                System.out.print("enter answer ( A,B,C,H,h ) ");
                useranswer = scan.nextLine();

                /*3.2 if answer not (A,B,C,H,h ) display error message and return to to 3.1 */
                if (!useranswer.equalsIgnoreCase("A") && !useranswer.equalsIgnoreCase("B") && !useranswer.equalsIgnoreCase("C")&&  !useranswer.equalsIgnoreCase("H"))
                    System.out.print ("error enter (A,B,C,H,h ) ");

            }while(!useranswer.equalsIgnoreCase("A") && !useranswer.equalsIgnoreCase("B") && !useranswer.equalsIgnoreCase("C")&&  !useranswer.equalsIgnoreCase("H"));

            /*3.3 if put in answer let the user know if their right or wrong (Y) */
            if (useranswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct answer!");
                score+= 3;
            }
            else{
                System.out.println("incorrect answer!");
                score--;

                /* 4 if h/H give user hint then return to step 2 (Y) */
                if(useranswer.equalsIgnoreCase("h"))
                    System.out.println( "hint: the sports involves physical contact");
                useranswer = scan.nextLine();
                score+= 0.5;

                /* 6 update score after each question(Y) */
                System.out.println("Your current score is: " + score) ; 

            }

            System.out.println("After question 2 the score is " + score);

            //QUESTION 3*/
            String question3 = "\n\nWhich sport is Ireland best known for";
            System.out.println("\n" + question3);
            System.out.println("A) gaelic football");
            System.out.println("B) soccer ");
            System.out.println("C)hurling ");
            correctAnswer = "A";

            /* 3 process user answer*/

            do{
                /* 3.1 ask the users for answer (Y) */
                System.out.print("enter answer ( A,B,C,H,h ) ");
                useranswer = scan.nextLine();

                /*3.2 if answer not (A,B,C,H,h ) display error message and return to to 3.1 */
                if (!useranswer.equalsIgnoreCase("A") && !useranswer.equalsIgnoreCase("B") && !useranswer.equalsIgnoreCase("C")&&  !useranswer.equalsIgnoreCase("H"))
                    System.out.print ("error enter (A,B,C,H,h ) ");

            }while(!useranswer.equalsIgnoreCase("A") && !useranswer.equalsIgnoreCase("B") && !useranswer.equalsIgnoreCase("C")&&  !useranswer.equalsIgnoreCase("H"));

            /*3.3 if put in answer let the user know if their right or wrong (Y) */
            if (useranswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct answer!");
                score+= 3;
            }
            else{
                System.out.println("incorrect answer!");
                score--;

                /* 4 if h/H give user hint then return to step 2 (Y) */
                if(useranswer.equalsIgnoreCase("h"))
                    System.out.println( "hint: you can hold the ball in your hand all through out the game");
                useranswer = scan.nextLine();
                score+= 0.5;

                /* 6 update score after each question(Y) */
                System.out.println("Your current score is: " + score) ; 

            }

            System.out.println("After question 3 the score is " + score);

            //QUESTION 4*/
            String question4 = "\n\nWhich country won the FIFA Women's World Cup in 2019? ";
            System.out.println("\n" + question4);
            System.out.println("A) German");
            System.out.println("B) USA ");
            System.out.println("C)Saudia arabia ");
            correctAnswer = "B";

            /* 3 process user answer*/

            do{
                /* 3.1 ask the users for answer (Y) */
                System.out.print("enter answer ( A,B,C,H,h ) ");
                useranswer = scan.nextLine();

                /*3.2 if answer not (A,B,C,H,h ) display error message and return to to 3.1 */
                if (!useranswer.equalsIgnoreCase("A") && !useranswer.equalsIgnoreCase("B") && !useranswer.equalsIgnoreCase("C")&&  !useranswer.equalsIgnoreCase("H"))
                    System.out.print ("error enter (A,B,C,H,h ) ");

            }while(!useranswer.equalsIgnoreCase("A") && !useranswer.equalsIgnoreCase("B") && !useranswer.equalsIgnoreCase("C")&&  !useranswer.equalsIgnoreCase("H"));

            /*3.3 if put in answer let the user know if their right or wrong (Y) */
            if (useranswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct answer!");
                score+= 3;
            }
            else{
                System.out.println("incorrect answer!");
                score--;

                /* 4 if h/H give user hint then return to step 2 (Y) */
                if(useranswer.equalsIgnoreCase("h"))
                    System.out.println( "hint: the county is known for there land scapes ");
                useranswer = scan.nextLine();
                score+= 0.5;  

                /* 6 update score after each question(Y) */
                System.out.println("Your current score is: " + score) ; 

            }
            System.out.println("After question 4 the score is " + score);

            /* 7  end the quiz showing final score and if they would like to play again (R)*/

            System.out.println("do you want play again? (yes//no)");
            response = scan.nextLine();
        }while(response.equalsIgnoreCase("yes"));
       
        /* 7.2  display final score*/
        System.out.println("Your final score is: " + score);
        
       /* 7.3 unique question ()*/
       if(score>= 0 && score<=2){
          System.out.println("what is your favour sports to play");
          scan.nextLine();
         System.out.print(" thank you for playing");
          
        }else if (score>= 2 && score<=12){
          System.out.println("get a prize -  message @hasnancouture on instagram");
          System.out.print("did you message us yes/no");
        scan.nextLine();
          
          if (response.equalsIgnoreCase("yes"))
          System.out.println("promo code for 50% is (i finshed the quiz)");
          
        } if (response.equalsIgnoreCase("no"))
        System.out.println("go message @hasnancouture");
          
          
          
        
       

    }

}
              
        
    
        
    