public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int start = 1000;
            int end = 3500;

            int randomNumber = start + (int) (Math.random() * ((end + 1) - start));
            System.out.println(randomNumber);
        }
    }
}
