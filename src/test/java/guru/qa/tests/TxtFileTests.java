package guru.qa.tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static guru.qa.utils.Files.readTextFromPath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;


public class TxtFileTests {
    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedData = "Lorem ipsum dolor sit amet, consectetur adipiscing";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/files/1.csv";
        String expectedData = "Lorem ipsum dolor sit amet, consectetur adipiscing";

        String actualData = readTextFromPath(csvFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}