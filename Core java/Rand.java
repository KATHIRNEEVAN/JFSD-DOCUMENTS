import java.util.Random;

public class Rand{
    public static void main(String[] args) {
        Random random = new Random();
        int randomInteger = random.nextInt(10) + 1;
        System.out.println("Random integer between 1 and 10: " + randomInteger);
    }
}