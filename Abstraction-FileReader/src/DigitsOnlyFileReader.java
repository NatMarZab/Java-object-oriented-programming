public class DigitsOnlyFileReader extends AbstractFileReader{

    public DigitsOnlyFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected String parseLine(String line) {
        // We replace all non-numerical characters with the empty string
        return line.replaceAll("[^0-9]", "");
    }
}
