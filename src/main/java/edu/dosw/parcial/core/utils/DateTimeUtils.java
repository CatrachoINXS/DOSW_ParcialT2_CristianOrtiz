package edu.dosw.parcial.core.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {
    private DateTimeUtils() {}

    public static LocalDateTime pasarALocalDateTime(String fecha, String hora) {
        LocalDate fechaFormateada = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalTime horaFormateada = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
        return LocalDateTime.of(fechaFormateada, horaFormateada);
    }
}
