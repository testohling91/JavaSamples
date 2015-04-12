package testEnumReturn;

public class TestEnumReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Enum");
		for (LiftLevel l : LiftLevel.values()) {
			System.out.println(l + " potentiometer measures " + l.calcPotReading() + " reading");
		}
		
		LiftLevel whereto = LiftLevel.FIRST;
		System.out.println(whereto + " targets " +whereto.calcPotReading());
	}

}
