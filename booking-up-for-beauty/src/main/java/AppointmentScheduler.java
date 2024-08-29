import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 & appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // "You have an appointment on Friday, March 29, 2019, at 3:00 PM."
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("eeee, MMMM dd, yyyy");
        DateTimeFormatter printer2 = DateTimeFormatter.ofPattern("h:mm a.");
        return "You have an appointment on " + printer.format(appointmentDate) + ", at " + printer2.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
