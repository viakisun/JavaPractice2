
public class JavaPractice {

	public static void main(String[] args) {
		runTemperatureConverter();
		runNextJob();
	}

	private static void runTemperatureConverter() {
		float celciusValue = 31.5f;
		float farenheitValue = Util.convertCelciusToFarenheit(celciusValue);
		System.out.printf("celcius : %f%n", celciusValue);
		System.out.printf("farenheit : %f%n", farenheitValue);
	}
	
	private static void runNextJob() {

	}
}
