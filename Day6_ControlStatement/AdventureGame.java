import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🏝️ Welcome to Adventure Game");
        System.out.println("Your goal is to find the hidden treasure. Choose wisely!");
        System.out.println("You are at a crossroad. Do you want to go left or right?");
        System.out.print("Type 'left' or 'right': ");
        String choice1 = scanner.nextLine().toLowerCase();

        switch (choice1) {
            case "left":
                System.out.println("You walk down a dark path and find a mysterious cave.");
                System.out.println("Do you want to enter the cave or walk past it?");
                System.out.print("Type 'enter' or 'walk': ");
                String choice2 = scanner.nextLine().toLowerCase();

                switch (choice2) {
                    case "enter":
                        System.out.println("Inside the cave, you find a sleeping dragon!");
                        System.out.println("Do you want to fight the dragon or sneak past it?");
                        System.out.print("Type 'fight' or 'sneak': ");
                        String choice3 = scanner.nextLine().toLowerCase();

                        switch (choice3) {
                            case "sneak":
                                System.out.println("😮 You sneak past the dragon and find the treasure behind it. 🏆 You win!");
                                break;
                            case "fight":
                                System.out.println("🔥 The dragon wakes up and defeats you. Game over.");
                                break;
                            default:
                                System.out.println("❌ Invalid choice. The dragon wakes up while you hesitate. Game over.");
                        }
                        break;

                    case "walk":
                        System.out.println("You walk past the cave but fall into a hidden trap. ☠️ Game over.");
                        break;

                    default:
                        System.out.println("❌ Invalid choice. You get lost in the forest. Game over.");
                }
                break;

            case "right":
                System.out.println("You find a river. There's a boat and a bridge.");
                System.out.print("Do you want to take the 'boat' or cross the 'bridge'? ");
                String choice2Right = scanner.nextLine().toLowerCase();

                switch (choice2Right) {
                    case "boat":
                        System.out.println("The boat has a hole... You sink. ☠️ Game over.");
                        break;
                    case "bridge":
                        System.out.println("You cross safely and find the treasure hidden under a tree! 🏆 You win!");
                        break;
                    default:
                        System.out.println("❌ Invalid choice. You hesitate and wild animals find you. Game over.");
                }
                break;

            default:
                System.out.println("❌ Invalid direction. You wander aimlessly. Game over.");
        }

        scanner.close();
    }
}
