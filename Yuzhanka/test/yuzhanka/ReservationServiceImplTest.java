package yuzhanka;

import org.hillel.it.yuzhanka.application.service.ReservationService;
import org.hillel.it.yuzhanka.application.service.impl.ReservationServiceImpl;
import org.junit.Before;

public class ReservationServiceImplTest {
private ReservationService service;

@Before
public void setup() {
	service = new ReservationServiceImpl();
}
}
