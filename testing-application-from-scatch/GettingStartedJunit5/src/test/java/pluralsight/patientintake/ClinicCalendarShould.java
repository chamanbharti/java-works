package pluralsight.patientintake;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ClinicCalendarShould {

	@Test
	void test() {
		ClinicCalendar calendar = new ClinicCalendar();
		calendar.addAppointment("Jim", "Weaver", "avery", "10/20/2020 2:00 pm");
		List<PatientAppointment> appointments = calendar.getAppointments();
		assertNotNull(appointments);
		assertEquals(1, appointments.size());
		
		PatientAppointment enteredAppointment = appointments.get(0);
		assertEquals("Jim", enteredAppointment.getPatientFirstName());
		assertEquals("Weaver", enteredAppointment.getPatientLastName());
		assertEquals(Doctor.avery, enteredAppointment.getDoctor());
		assertEquals("10/20/2020 2:10 pm", enteredAppointment.getAppointmentDateTime());
	}

}
