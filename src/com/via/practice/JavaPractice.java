package com.via.practice;

public class JavaPractice {

	public static void main(String[] args) {
		// runTemperatureConverter();
		// runSum();
		runBankAccountExample();
	}

	private static void runTemperatureConverter() {
		float celciusValue = 31.5f;
		float farenheitValue = Util.convertCelciusToFarenheit(celciusValue);
		System.out.printf("celcius : %f%n", celciusValue);
		System.out.printf("farenheit : %f%n", farenheitValue);
	}

	private static void runSum() {
		int startNum = 1;
		int endNum = 100;

		long sumValue = Util.sumFromTo(startNum, endNum);
		if (sumValue == -1) {
			System.out.println("[E] 시작숫자가 끝숫자보다 큽니다.");
		} else {
			System.out.printf("sum from %d to %d : %d%n", startNum, endNum, sumValue);
		}
	}

	private static void runBankAccountExample() {
		BankAccount ba = new BankAccount("123-456789", "홍길동", 10000);
		ba.printStatus();
		ba.deposit(-20000);
		ba.withDraw(45000);
	}
}
