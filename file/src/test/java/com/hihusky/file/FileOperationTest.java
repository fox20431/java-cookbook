package com.hihusky.file;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FileOperationTest {

    // Intellij isn't able to auto refresh project directory.
    // Please do File -> Reload All from Disk if you modify file not by Intellij.

    @Test
    void showProjectRootDirectory() throws IOException {
        File currentDirectory = new File("");
        String absolutePath = currentDirectory.getAbsolutePath();
        String canonicalPath = currentDirectory.getCanonicalPath();
        log.info("The root absolute path: " + absolutePath);
        log.info("The root canonical path: " + canonicalPath);
    }

    @Test
    void createDirectoryAndFile() throws IOException {
        // create directory
        File createdDirectory = new File("src/test/resources/test");
        boolean isDirectoryCreatedSuccessfully = createdDirectory.mkdir();
        log.info("Directory will be created location is: " + createdDirectory.getAbsolutePath());
        if (isDirectoryCreatedSuccessfully) {
            log.info(createdDirectory.getPath() + " is created successfully.");
        } else {
            log.info(createdDirectory.getPath() + " is created failure due to file existed.");
        }
        // create file
        File createdFile = new File("src/test/resources/test.txt");
        log.info("File will be created location is: " + createdFile.getAbsolutePath());
        boolean isFileCreatedSuccessfully = createdFile.createNewFile();
        if (isFileCreatedSuccessfully) {
            log.info(createdFile.getPath() + " is created successfully.");
        } else {
            log.info(createdFile.getPath() + " is created failure due to file existed.");
        }
    }

    @Test
    void createTempDirectoryAndFile() throws IOException {
        // create a temporary directory named randomly and prefixed with method's parameter in system /var directory
        Path tempDirectoryPath = Files.createTempDirectory("test");
        Path tempFilePath = Files.createTempFile("test", ".txt");
        log.info("Temporary directory location is: " + tempDirectoryPath.toString());
        log.info("Temporary file location is: " + tempFilePath.toString());
        // throw FileAlreadyExistsException if file or directory is already exit.
        Path directoryPath = Files.createDirectory(Path.of("src/test/resources/test"));
        Path filePath = Files.createFile(Path.of("src/test/resources/test.txt"));
        log.info("Directory location is: " + directoryPath.toFile().getAbsolutePath());
        log.info("File location is: " + filePath.toFile().getAbsolutePath());
    }

    // if you are clever enough, you can understand
    // that File class and Files class is able to do other operation,
    // such as delete, move and so on.

}
