package conversorMultiple;

public class ConvirtiendoTemperaturas {

	public double convirtiendoCelsiusFahrenheit(double medidaCelsius) {
		return (medidaCelsius * 1.8) + 32;
	}

	public double convirtiendoFahrenheitCelsius(double medidaFahrenheit) {
		return (medidaFahrenheit - 32) / 1.8;
	}

	public double convirtiendoCelsiusKelvin(double medidaCelsius) {
		return medidaCelsius + 273.15;
	}

	public double convirtiendokelvinCelsius(double medidaKelvin) {
		return medidaKelvin - 273.15;
	}

}
