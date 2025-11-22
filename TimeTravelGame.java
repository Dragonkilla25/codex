import java.util.Scanner;

public class TimeTravelGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        System.out.println("You have traveled 10 years into the past... huh?\n");
        System.out.println("You wake up and see the date is... 2015?!\n");
        System.out.println("After trying to make sense of what's going on, you come to terms that you've gone back in time and decide to redo your life or should you?...\n");

        while (playing) {
            System.out.println("a) You decide to further your soccer career in this time and join a team and enroll in an acadamy.\n");
            System.out.println("b) You decide to get on an early start to leanign coding so by the time your in college your very proficient.\n");
            System.out.println("q): You decide not to mess with the timeline as you dont know what the effects could be. (Quit game)\n");
            System.out.print("choice: ");

            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("a")){
                playing = soccerPath(scanner);
            } else if (choice.equalsIgnoreCase("b")){
                playing = codingPath(scanner);
            } else if (choice.equalsIgnoreCase("q")){
                System.out.println("\nYou decide to not mess with the timeline and decide to live life as close as possible to the original timeline for now...\n");
                playing = false;
            } else {
                System.out.println("\nInvalid choice. Please try again.\n");
                continue;
            }
        }
    }

    private static boolean codingPath(Scanner scanner) {
        
        System.out.println("\nAfter months of learning coding, you have a good grasp of the basics.");
        System.out.println("What do you focus on now?\n");
        System.out.println("1) Building projects to solidify your knowledge");
        System.out.println("2) Joining coding competitions and hackathons");
        System.out.println("3) Decided to still code(not as much) but also focus on soccer ");
        System.out.print("choice: ");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("1")) {
            System.out.println("\nYou built several impressive projects that caught the attention of top tech companies!");
            return false;
        } else if (choice.equalsIgnoreCase("2")) {
            System.out.println("\nYou excelled in competitions and hackathons, winning several awards and gaining recognition in the coding community!");
            return false;
        } else if (choice.equalsIgnoreCase("3")){
            System.out.println("\nYou decided to balance both coding and soccer.");
            soccerPath(scanner);
            return true;
        } else {
            System.out.println("\nInvalid choice. Please try again.\n");
        }
        return false;
    }

    private static boolean soccerPath(Scanner scanner) {

        System.out.println("\nAfter 3 months, your skills improve a lot.");
        System.out.println("What do you focus on now?\n");
        System.out.println("1) Training even harder to go pro");
        System.out.println("2) Balancing soccer with school");
        System.out.println("3) Decide to quit soccer and focus on school/coding");
        System.out.print("choice: ");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("1")){
            System.out.println("\nYou trained so hard you became the best on in your league and started getting attention from scouts!");
            return false;
        } else if (choice.equalsIgnoreCase("2")) {
            System.out.println("\nYou balanced both and got good grades while being a star player on your team!");
            return false;
        } else if (choice.equalsIgnoreCase("3")){
            System.out.println("\nYou decided to quit soccer and focus on school and coding");
            codingPath(scanner);
            return true;
        } else {
            System.out.println("\nInvalid choice. Please try again.\n");
        }
        return false;
    }
}
