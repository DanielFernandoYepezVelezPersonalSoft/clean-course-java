package org.example.cleancode;

import java.util.Date;

public class NameVariable {
    // día de hoy - today
    // Date ddmmyyy = new Date();
    static final Date today = new Date();

    // días transcurridos - elapsed time in days
    // Integer d = 23;
    static Integer elapsedTimeInDays = 23;

    // número de archivos en un directorio - number of files in directory
    // Integer di = 33;
    static Integer numberOfFilesInDirectory = 33;

    // primer nombre - first name
    // String nombre = "Daniel";
    static String firstName = "Daniel";

    // primer apellido - last name
    // String apellido = "Yepez";
    static String lastName = "Yepez";

    // días desde la última modificación - days since modification
    // Integer dsm = 12;
    static Integer daysSinceLastModification = 12;

    // cantidad máxima de clases por estudiante - max classes per student
    // Integer maxClassesPerStudent = 6;
    static Integer maxClassesPerStudent = 6;

    private NameVariable() {
        // Adicione Este Constructor Para Cumplir Y Por Recomendación De SonarLint
    }

}