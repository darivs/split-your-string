import org.junit.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SplitterTest {
    private Splitter splitter = new Splitter();

    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String TEXT_TO_BREAK = "Does Zero-rated_Supply_to_Exporter apply in the Jurisdiction of Sender Location?";
    private static final int BREAKPOINT = 20;

    @Test
    public void splitter_breaks_text_as_much_as_needed() {
        int expectedLinebreaks = 4;

        String output = splitter.splitText(TEXT_TO_BREAK, BREAKPOINT);

        assertThat(occurrencesOfLinebreaks(output)).isEqualTo(expectedLinebreaks).isGreaterThan(0);
    }

    private int occurrencesOfLinebreaks(String splittedText) {
        return (splittedText.split(LINE_SEPARATOR, -1).length) - 1;
    }
}
