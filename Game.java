import java.util.Random;
import java.util.Scanner;

class Game{
    public static void main(String[] args){
        String passwd = "HARSH";

        System.out.println("Enter the passwd to Access :");
        Scanner sc = new Scanner(System.in);
        String Inputpasswd = sc.nextLine();
        String uppercase = Inputpasswd.toUpperCase();

        if(passwd.equals(uppercase)){
            System.out.println("\nYou're Welcome Mr. "+ passwd +" !!!\n");

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
        
        }else{
            System.out.println("\nAccess Denied");
        }
    }
}