package guru.qa.tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static guru.qa.utils.Files.getPdf;
import static org.hamcrest.MatcherAssert.assertThat;


public class PdfFileTests {
    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/files/1.pdf";
        String expectedData = "Lorem ipsum dolor sit amet, consectetur adipiscing \n" +
                "elit. Nunc ac faucibus odio";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }

}