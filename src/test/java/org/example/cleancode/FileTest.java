package org.example.cleancode;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class FileTest {
    private static final Logger logger = LoggerFactory.getLogger(FileTest.class);

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
    void testFileIdValue() {
        // Arrange
        File file = new File(24);
        Integer expectFileIdValue, actualFileIdValue;

        // Act
        expectFileIdValue = 24;
        actualFileIdValue = file.getId();

        // Assert
        assertAll(
                () -> assertNotNull(file.getId()),
                () -> assertNull(file.getFlagged()),
                () -> assertNotNull(expectFileIdValue),
                () -> assertNotNull(actualFileIdValue),
                () -> assertNotEquals(33, expectFileIdValue),
                () -> assertNotEquals(23, actualFileIdValue),
                () -> assertEquals(expectFileIdValue, actualFileIdValue)
        );
    }

    @Test
    void testFileFlaggedValue() {
        // Arrange
        File file = new File(true);
        boolean actualFileFlaggedValue;

        // Act
        actualFileFlaggedValue = file.getFlagged();

        // Assert
        assertAll(
                () -> assertNull(file.getId()),
                () -> assertNotNull(file.getFlagged()),
                () -> assumeTrue(actualFileFlaggedValue),
                () -> assertNotEquals(false, actualFileFlaggedValue)
        );
    }

    @Test
    void testFileFilterValue() {
        // Arrange
        File file = new File();
        Optional<String> expectFileArray;

        // Act
        file.setFiles(Arrays.asList(
                        "File One",
                        "File Two",
                        "File Three"
                )
        );

         expectFileArray = file.getFiles()
                    .stream()
                    .filter(file1 -> file1.contains("One"))
                    .findFirst();

        // Assert
        assertAll(
                () -> assertNotNull(file.getFiles()),
                () -> assertNotNull(expectFileArray),
                () -> assertEquals("File One", expectFileArray.orElse("No Tenemos String")),
                () -> assertNotEquals("No Tenemos String", expectFileArray.orElse("File One")),
                () -> assertEquals(3, file.getFiles().size())
        );
    }

    @AfterAll
    static void afterAll() {
        logger.info("Metodo static Que Se Ejecuta En El Último Lugar, Después, De Todas Las Instancias De La Clase Invocadas En Cada Metodo \"@Test\"");
    }
}