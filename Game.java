
import java.util.Scanner;
import java.util.Random;

class game{
    public static void main(String[] args){
        String passwd = "HARSH";

        // used to encrypted by password

        System.out.println("\n   This Game Is Encrypted... \n\tPlese Enter Your Password");
    
        Scanner Dark = new Scanner(System.in);
        String InputPasswd = Dark.nextLine();
        String uppercase = InputPasswd.toUpperCase();
        // System.out.println(passwd.toLowerCase());
        if(passwd.equals(uppercase)){
            boolean flag = true;
            
            while(flag){
                System.out.println("\nYou're Welcome Mr. "+ passwd +" !!!\n");
                System.out.println("You're in Option \n 1. For Rock Paper Scissor 2. For Guess The Number 3. For Quit The Game. ");
                System.out.println("Choose Your Option " + passwd);
                Scanner option = new Scanner(System.in);
                    
                    int Option = option.nextInt();
                    
                    switch(Option){

                        // Game 1

                        case 1:
                        String str1 = "rock";
                        String str2 = "paper";
                        String str3 = "scissor";

                        int Won = 0;
                        int Lose = 0;
                        int Tie = 0; 
                        
                        for(int j=0; j<=2; j++){
                            Random rand = new Random();
                            int computer = rand.nextInt(1,4);
                            Scanner scan = new Scanner(System.in);
                        
                            System.out.println("\n\t  ### Lets Dies Rock Paper Scissor ### \n\t** Rock... ** Paper... ** Scissor... ");

                            String guess = scan.nextLine();
                            String lowercase = guess.toLowerCase();

                            // System.out.println("\t\t"+computer);
                            // System.out.println("\t\t"+lowercase);
                            if(computer == 1 ){
                                if(str1.equals(lowercase)){
                                    Tie++;
                                    System.out.println("Match Tie ! Play Again \n   MY Choice Was <Rock>");
                                }else
                                if(str2.equals(lowercase)){
                                    Won++;
                                    System.out.println("Congratulation !!! You Won The Match \n   MY Choice Was <Rock>");
                                }else
                                if(str3.equals(lowercase)){
                                    Lose++;
                                    System.out.println("You Lose !!! Batter Luck Next Time \n   My Choice Was <Rock>");
                                }
                                else{
                                    System.out.println("We Could Not Get Your Choice :");
                                }

                            }else
                            if (computer == 2){
                                if(str1.equals(lowercase)){
                                    Lose++;
                                    System.out.println("You Lose !!! Batter Luck Next Time \n   My Choice Was <Paper>");
                                }else
                                if(str2.equals(lowercase)){
                                    Tie++;
                                    System.out.println("Match Tie ! Play Again \n   My Choice Was <Paper>");
                                }else
                                if(str3.equals(lowercase)){
                                    Won++;
                                    System.out.println("Congratulation !!! You Won The Match \n   My Choice Was <Paper>");
                                }
                                else{
                                    System.out.println("We Could Not Get Your Choise :");
                                }
                            }else
                            if(computer == 3){
                                if(str1.equals(lowercase)){
                                    Won++;
                                    System.out.println("Congratulation !!! You Won The Match \n   My Choice Was <Scissor>");
                                }else
                                if(str2.equals(lowercase)){
                                    Lose++;
                                    System.out.println("You Lose !!! Batter Luck Next Time \n   My Choice Was <Scissor>");
                                }else
                                if(str3.equals(lowercase)){
                                    Tie++;
                                    System.out.println("Match Tie ! Play Again \n   My Choice Was <Scissor>");
                                }
                                else{
                                    System.out.println("We Could Not Get Your Choise :");
                                }

                            }else{
                                System.out.println("Someing Went Wrong... Please Contect Harsh :");
                            } 
                        }
                        
                        System.out.format("\n# Won Matchs %d, Lose Matchs %d, Tie Matchs %d #\n", Won, Lose, Tie);
                        System.out.println("\tThank You For Playing...  :)");
                        break;

                        // Game 2
                    
                        case 2: System.out.println(" You Have Selected Game 2. \n\t<Guess The Number>\n");
                        Random rand = new Random();
                        int computer = rand.nextInt(1,100);
                        // System.out.println(computer); // Use This To Get The Guess

                            Scanner scan = new Scanner(System.in);
                            int guess = 0 ;
                            int guesses = 0;

                            while (computer != guess){
                                guesses++;
                            
                                System.out.println("Enter Your Guess : Between 0-100 ");
                                guess = scan.nextInt();
                                guess += 1;
                                if(guess <= 0){
                                    System.out.println("You Guessed Less Then Limit :");
                                }else
                                if(guess >= 100){
                                    System.out.println("You Guess More Then Limit :");
                                }else
                                if(guess == computer){
                                    System.out.println("You Guessed It Right In "+guesses+" Attempts!!!");
                                }else
                                if(guess < computer){
                                    System.out.println("Your Number Is Less Then Actual Number ");
                                }else
                                if(guess > computer){
                                    System.out.println("Your Number Is Greater Then Actual Number ");
                                }else{
                                    System.out.println("Something Went Wrong... Please Contect to Harsh ('_')");
                                }
                            }   
                            System.out.println("Thank You For Playing...  :)");
                            break;

                        // For Exit

                        case 3: System.out.println("You Have Selected To Quit The Game:");
                        System.out.println("\t<Game Is Quiting!>");
                            flag = false;
                            break;

                        default: System.out.println("Something Went Wrong, May You Have Entered A Number Out Of Bound Please Contect to Harsh! ('_')");
                    }
            
            }
        }
        else{
            System.out.println(" Password Mismatch\n     (*_*) Access Denied \n     \nGame Gone Exit...");
        }
    }
}