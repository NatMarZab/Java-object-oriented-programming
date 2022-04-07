import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // We´ll create a file reader with a file message.txt:
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("src/Message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());
    }
}
