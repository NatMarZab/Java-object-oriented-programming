import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;


public abstract class AbstractFileReader {
    private final Path filePath; //Path is a data type built into Java

        //Constructor:
    protected AbstractFileReader(String filePath) {
        // We convert the input filePath into a path object:
        this.filePath = Path.of(filePath);
    }

    public String getPath() {
        return filePath.toString();
    }

    public List<String> readFile() throws IOException { // it turns the output into a list of strings
        // We iterate through the lines of the file, and parse and collect them into a list we return to the user:
        return Files.lines(filePath).map(line -> parseLine(line)).collect(Collectors.toList());
    }

    // The parseLine method should not be implemented here since other classes wil always override it with different implementations. Abstract methods can´t have a body.
    protected abstract String parseLine(String line);
}
