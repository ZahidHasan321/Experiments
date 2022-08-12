package administration;

import entity.Marksheet;

public class Accounts {
	public static boolean isValid(Marksheet ms) {
		if(ms.isHasPaid()) {
			return true;
		}
		else
			return false;
	}
}
