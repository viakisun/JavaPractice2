
public class JavaPractice {

	public static void main(String[] args) {
		runTemperatureConverter();
		runSum();
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
			System.out.println("[E] ���ۼ��ڰ� �����ں��� Ů�ϴ�.");
		} else {
			System.out.printf("sum from %d to %d : %d%n", startNum, endNum, sumValue);
		}
	}
}
