package guru.qa.tests;


import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static guru.qa.utils.Files.readTextFromPath;
import static guru.qa.utils.Zip.unzip;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static guru.qa.utils.Files.readTextFromPath;
import static guru.qa.utils.Zip.unzip;

public class ZipFileTests {
    @Test
    void zipWithPasswordTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/files/1.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/1.txt";
        String expectedData = "Lorem ipsum dolor sit amet, consectetur adipiscing";

        unzip(zipFilePath, unzipFolderPath);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void zipTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/files/1.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/1.txt";
        String expectedData = "Lorem ipsum dolor sit amet, consectetur adipiscing";

        unzip(zipFilePath, unzipFolderPath);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

}