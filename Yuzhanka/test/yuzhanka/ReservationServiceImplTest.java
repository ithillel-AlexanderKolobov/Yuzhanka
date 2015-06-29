package yuzhanka;

import org.hillel.it.yuzhanka.application.service.ReservationService;
import org.hillel.it.yuzhanka.application.service.impl.ReservationServiceImpl;
import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.junit.Before;
import org.junit.Test;

public class ReservationServiceImplTest {
private ReservationService service;

@Before
public void setup() {
	service = new ReservationServiceImpl();
}

@Test 
public void testSaveFirstNewReservation(){
	Reservation reservation = new Reservation();
	
	service.save(reservation);
}
}
