package fr.carbuddyweb.dummy;

import org.joda.time.DateTime;
import org.junit.Test;

public class DummyUnitTest {

	@Test
	public void date_time_instanciation_ok() {
		DateTime dt = new DateTime(2016, 4, 14, 0, 0);
		System.out.println(dt);
	}
}
