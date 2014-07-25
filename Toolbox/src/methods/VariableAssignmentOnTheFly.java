package methods;

public class VariableAssignmentOnTheFly {

	public static void main(String[] args) {

		Double number;

		if ((number = getNumber()) != null) {
			System.out.println(number);
		}
	}

	private static Double getNumber() {
		return 2.0;
	}
	
	/**
	 *DO NOTHING! I'M TESTING A COMMIT FROM A NEW WORKSTATION
	 */
	private void addTest(){
		
	}
}
