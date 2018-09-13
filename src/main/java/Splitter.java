public class Splitter {
    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String SPACE = " ";

    public String splitText(String textToSplit, int breakpoint) {
        StringBuilder output = new StringBuilder(textToSplit);
        int index = 0;

        while (index + breakpoint < output.length()) {
            if ((index = output.lastIndexOf(SPACE, index + breakpoint)) != -1) {
                output.replace(index, index + 1, LINE_SEPARATOR);
            } else if ((index = output.indexOf(SPACE, index + breakpoint)) != -1) {
                output.replace(index, index + 1, LINE_SEPARATOR);
            }
        }

        System.out.println(output.toString());

        return output.toString();
    }
}
