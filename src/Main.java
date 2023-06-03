import java.util.Random; //Random is part of the java.util package
public class Main {
    public static void main(String[] args) {
        Random randomD = new Random();
        int x = randomD.nextInt(6)+1;
        //You choice:
        //double randomD = random.nextDouble();
        //boolean randomD = random.nextBoolean();
        System.out.println(x);
        }
    }
