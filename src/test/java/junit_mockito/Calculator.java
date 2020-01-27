package junit_mockito;

public class Calculator {

	CaclculatorService service;

	public Calculator(CaclculatorService service) {
		this.service = service;
	}

	public int add(int i, int j) {
		return i + j;
	}

	public int perform(int i, int j) {
		int computeResult = service.add(i, j) * (i + j);
		return computeResult;
	}
}

//stub, fake object: 