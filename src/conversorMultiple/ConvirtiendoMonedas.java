package conversorMultiple;

public class ConvirtiendoMonedas {
	private double cantidadDinero;
	private double divisas;

	public double convirtiendoCordobasDolares(double dinero) {
		return dinero / 37;
	}

	public double convirtiendoDolaresCordobas(double dinero) {
		return dinero * 37;
	}

	public double convirtiendoCordobaEuros(double dinero) {
		return dinero / 40.67;
	}

	public double convirtiendoEurosCordobas(double dinero) {
		return dinero * 40.67;
	}

}
