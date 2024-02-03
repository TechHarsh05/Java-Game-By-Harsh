import java.util.Scanner;

class Game{
    public static void main(String[] args){
        String passwd = "HARSH";

        System.out.println("Enter the passwd to Access :");
        Scanner sc = new Scanner(System.in);
        String Inputpasswd = sc.nextLine();
        String uppercase = Inputpasswd.toUpperCase();

        if(passwd.equals(uppercase)){
            System.out.println("You can Access");

        }else{
            System.out.println("\nAccess Denied");
        }
    }
}