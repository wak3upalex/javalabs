import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hero mainHero = new Hero();

        //default output strategy
        mainHero.moving();
        String answer;
        int checker = 1;
        while (checker == 1) {
            System.out.println("Enter one of the strategies (walk, ride, fly): ");
            answer = in.nextLine();
            switch (answer) {
                case "walk":
                    mainHero.setMovement(new Walk());
                    mainHero.moving();
                    break;
                case "ride":
                    mainHero.setMovement(new Ride());
                    mainHero.moving();
                    break;
                case "fly":
                    mainHero.setMovement(new Fly());
                    mainHero.moving();
                    break;
                default:
                    System.out.println("Wrong command! Try again!");
            }
            System.out.println("Do you want to use commands again? Enter y - if you want, else type anything");
            answer = in.nextLine();
            if (answer.equals("y")) {
                checker = 1;
            } else {
                checker = 0;
            }


        }
    }
}