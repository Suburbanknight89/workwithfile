package guru.qa.tests;


import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static guru.qa.utils.Files.readTextFromPath;
import static guru.qa.utils.Zip.unzip;

public class zipfile2 {
	@Test
	void zipWithPasswordTest() throws IOException, ZipException {
		String zipFilePath = "./src/test/resources/files/1.zip";
		String unzipFolderPath = "./src/test/resources/files/unzip";
		String password = "123";
		String unzipTxtFilePath = "./src/test/resources/files/unzip/1.txt";
		String expectedData = "Lorem ipsum dolor sit amet, consectetur adipiscing";
		unzip(zipFilePath, unzipFolderPath, password);

		String actualData = readTextFromPath(unzipTxtFilePath);

		assertThat(actualData, containsString(expectedData));
	}

	@Test
	void zipTest() throws IOException, ZipException {
		String zipFilePath = "./src/test/resources/files/1.zip";
		String unzipFolderPath = "./src/test/resources/files/unzip";
		String unzipTxtFilePath = "./src/test/resources/files/unzip/1.txt";
		String expectedData = "Lorem ipsum dolor sit amet, consectetur adipiscing";
		String password = "123";

		unzip(zipFilePath, unzipFolderPath, password);

		String actualData = readTextFromPath(unzipTxtFilePath);

		assertThat(actualData, containsString(expectedData));
	}

}