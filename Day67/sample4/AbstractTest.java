package sample4;

import java.util.Calendar;
import java.util.GregorianCalendar;

//AbstractTest r = AbstractTest.getInstance();
//System.out.println(r.dayInfo());

public abstract class AbstractTest {// ½Ì±ÛÅæ ÆĞÅÏÀ» ±¸Çö

	abstract public String dayinfo();

	public static AbstractTest getInstance() {
		GregorianCalendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case 1:
			return new Sunday();
		case 2:
			return new Monday();
		case 3:
			return new Tuesday();
		case 4:
			return new Wednesday();
		case 5:
			return new Thursday();
		case 6:
			return new Friday();
		case 7:
			return new Saturday();

		}
		return null;
	}
}
