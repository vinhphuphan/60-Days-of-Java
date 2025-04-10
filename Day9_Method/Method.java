import java.util.Random;

public class Method {
    public static void main(String[] args) {
        System.out.println("1 + 2 = " + add(1,2));
        System.out.println("Generate a random number : " + generateRandomNumber(5,10));

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int generateRandomNumber(int origin,int bound) {
        Random random = new Random();
        int myRandomNum = random.nextInt(origin, bound);
        return myRandomNum;
    }
}
