package org.example.cleancode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String today = "today => " + NameVariable.today;
        String elapsedTimeInDays = "elapsedTimeInDays => " + NameVariable.elapsedTimeInDays;
        String numberOfFilesInDirectory = "numberOfFilesInDirectory => " + NameVariable.numberOfFilesInDirectory;
        String firstName = "firstName => " + NameVariable.firstName;
        String lastName = "lastName => " + NameVariable.lastName;
        String daysSinceLastModification = "daysSinceLastModification => " + NameVariable.daysSinceLastModification;
        String maxClassesPerStudent = "maxClassesPerStudent => " + NameVariable.maxClassesPerStudent;

        logger.info(today);
        logger.info(elapsedTimeInDays);
        logger.info(numberOfFilesInDirectory);
        logger.info(firstName);
        logger.info(lastName);
        logger.info(daysSinceLastModification);
        logger.info(maxClassesPerStudent);

        logger.info("=======================================================");

        File file = new File(22, false);
        String fileId = "ID File => " + file.getId();
        String flaggedId = "ID Flagged => " + file.getFlagged();

        logger.info(fileId);
        logger.info(flaggedId);
    }
}