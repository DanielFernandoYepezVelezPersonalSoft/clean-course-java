package org.example.cleancode;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class NameVariableTest {
    private static final Logger logger = LoggerFactory.getLogger(NameVariableTest.class);

    @BeforeAll
    static void beforeAll() {
        logger.info("Metodo static Que Se Ejecuta Primero Que Las Instancias De La Clase Invocadas En Cada Metodo \"@Test\"");
    }

    @BeforeEach
    void setUp() {
        logger.info("Init Method, Donde Preparamos Antes De Cada \"@Test\", Todos Los Objetos Necesarios Y Repetitivos Para Cada Uno De Los Escenarios Que Queremos Crear");
    }

    @AfterEach
    void tearDown() {
        logger.info("Final Method, Donde Finalizamos O Cerramos Después De Cada \"@Test\", Todos Los Objetos Necesarios Y Repetitivos Para Cada Uno De Los Escenarios Que Queremos Crear");
    }

    @Test
    @DisplayName("Valor De La Variable today")
    void testTodayValue() {
        // Arrange
        Date expectTodayValue, actualTodayValue;

        // Act
        expectTodayValue = new Date();
        actualTodayValue = NameVariable.today;

        // Assert
        assertAll(
                () -> assertNotNull(expectTodayValue),
                () -> assertNotNull(actualTodayValue),
                () -> assertFalse(actualTodayValue instanceof java.sql.Date),
                () -> assertEquals(expectTodayValue.toString(), actualTodayValue.toString())
        );
    }

    @Test
    @DisplayName("Valor De La Variable elapsed.......")
    void testElapsedTimeInDaysValue() {
        // Arrange
        Integer expectElapsedTimeInDays, actualElapsedTimeInDays;

        // Act
        expectElapsedTimeInDays = 23;
        actualElapsedTimeInDays = NameVariable.elapsedTimeInDays;

        // Assert
        assertAll(
                () -> assertNotNull(expectElapsedTimeInDays),
                () -> assertNotNull(actualElapsedTimeInDays),
                () -> assertNotEquals("23.33", String.valueOf(expectElapsedTimeInDays)),
                () -> assertNotEquals("232", String.valueOf(actualElapsedTimeInDays)),
                () -> assertEquals(expectElapsedTimeInDays, actualElapsedTimeInDays)
        );
    }

    @Test
    @DisplayName("Valor De La Variable numberOf....")
    void testNumberOfFilesInDirectoryValue() {
        // Arrange
        Integer expectNumberOfFilesInDirectory, actualNumberOfFilesInDirectory;

        // Act
        expectNumberOfFilesInDirectory = 33;
        actualNumberOfFilesInDirectory = NameVariable.numberOfFilesInDirectory;

        // Assert
        assertAll(
                () -> assertNotNull(expectNumberOfFilesInDirectory, () -> "Variable Is Null!"),
                () -> assertNotNull(actualNumberOfFilesInDirectory, () -> "Variable Is Null!"),
                () -> assumeFalse(!expectNumberOfFilesInDirectory.equals(actualNumberOfFilesInDirectory)),
                () -> assertNotEquals("44.56", String.valueOf(expectNumberOfFilesInDirectory)),
                () -> assertNotEquals("33.3", String.valueOf(actualNumberOfFilesInDirectory)),
                () -> assertEquals(expectNumberOfFilesInDirectory,actualNumberOfFilesInDirectory)
        );
    }

    @Test
    @DisplayName("Valor De Las Variables first Y last")
    void testPersonNameCompleteValue() {
        // Arrange
        String expectFirstName, expectLastName, actualFirstName, actualLastName;

        // Act
        expectFirstName = "Daniel";
        expectLastName = "Yepez";

        actualFirstName = NameVariable.firstName;
        actualLastName = NameVariable.lastName;

        // Assert
        assertAll(
                () -> assertNotNull(expectFirstName, "First Name Expect Is Null!"),
                () -> assertNotNull(expectLastName, "Last Name Expect Is Null!"),
                () -> assertNotNull(actualFirstName, "First Name Actual Is Null!"),
                () -> assertNotNull(actualLastName, "Last Name Actual Is Null!"),
                () -> assumeTrue(actualFirstName.startsWith("D")),
                () -> assumeFalse(!actualFirstName.startsWith("D")),
                () -> assumeTrue(actualLastName.startsWith("Y")),
                () -> assumeFalse(!actualLastName.startsWith("Y")),
                () -> assertNotEquals("Daniel Fernando", actualFirstName),
                () -> assertNotEquals("Yépez", actualLastName),
                () -> assertEquals((expectFirstName + expectLastName), (actualFirstName + actualLastName))
        );
    }

    @Test
    @DisplayName("Valor De La Variable daysSince....")
    void testDaysSinceLastModificationValue() {
        // Arrange
        Integer expectDaysSinceLastModification, actualDaysSinceLastModification;

        // Act
        expectDaysSinceLastModification = 12;
        actualDaysSinceLastModification = NameVariable.daysSinceLastModification;

        // Assert
        assertAll(
                () -> assertNotNull(expectDaysSinceLastModification),
                () -> assertNotNull(actualDaysSinceLastModification),
                () -> assumeFalse(!actualDaysSinceLastModification.equals(expectDaysSinceLastModification)),
                () -> assertNotEquals(44, expectDaysSinceLastModification),
                () -> assertNotEquals(33, actualDaysSinceLastModification),
                () -> assertEquals(expectDaysSinceLastModification, actualDaysSinceLastModification)
        );
    }

    @Test
    @DisplayName("Valor De La Variable max....")
    void testMaxClassesPerStudentValue() {
        // Arrange
        Integer expectMaxClassesPerStudent, actualMaxClassesPerStudent;

        // Act
        expectMaxClassesPerStudent = 6;
        actualMaxClassesPerStudent = NameVariable.maxClassesPerStudent;

        // Assert
        assertNotNull(expectMaxClassesPerStudent, () -> "Variable Is Null");
        assertNotNull(actualMaxClassesPerStudent, () -> "Variable Is Null");
        assumeFalse(!expectMaxClassesPerStudent.equals(actualMaxClassesPerStudent));
        assertNotEquals(1000, expectMaxClassesPerStudent);
        assertNotEquals(220, actualMaxClassesPerStudent);
        assertEquals(expectMaxClassesPerStudent, actualMaxClassesPerStudent);
    }

    @AfterAll
    static void afterAll() {
        logger.info("Metodo static Que Se Ejecuta En El Último Lugar, Después, De Todas Las Instancias De La Clase Invocadas En Cada Metodo \"@Test\"");
    }
    
}