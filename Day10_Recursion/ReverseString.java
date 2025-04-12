import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This is a programme to reverse a string!");
        System.out.print("Enter your string : ");
        String inputString = scanner.nextLine();
        char[] letters = inputString.toCharArray();
        int left = 0, right = letters.length - 1;
        while (left < right) {
            char temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;

            left++;
            right--;
        }

        System.out.printf("The reverse of %s is %s", inputString,new String(letters));
        scanner.close();
    }
}
