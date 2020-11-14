package OOP_extra_exercise;

public class Temperature {

	public Double Fahrenheit;
	public Double Celcius;

	public Temperature(Double FahrenheitValue, Double CelciusValue) {

		if (CelciusValue == null) {
			this.Fahrenheit = FahrenheitValue;
			this.Celcius = FahrenheitToCelcius(FahrenheitValue);
		} else if (FahrenheitValue == null) {
			this.Celcius = CelciusValue;
			this.Fahrenheit = CelciusToFahrenheit(CelciusValue);
		} else {
			System.out.println("ERROR");
		}

	}

	public double FahrenheitToCelcius(Double FahrenheitValue) {
		Double CelciusValue = (FahrenheitValue - 32) * 0.5555555;
		return CelciusValue;
	}

	public double CelciusToFahrenheit(Double CelciusValue) {
		Double FahrenheitValue = CelciusValue * 1.8 + 32;
		return FahrenheitValue;
	}

	public void printFTC() {
		System.out.println("---------------------------------------");
		System.out.println(Fahrenheit + " Fahrenheit are " + Celcius + " Celcius");
		System.out.println("---------------------------------------");
	}

	public void printCTF() {
		System.out.println("---------------------------------------");
		System.out.println(Celcius + " Celcius are " + Fahrenheit + " Fahrenheit");
		System.out.println("---------------------------------------");
	}

}