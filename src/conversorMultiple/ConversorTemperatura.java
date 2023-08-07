package conversorMultiple;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public void seleccionTemperatura(double medida, String opcionMedida) {
		ConvirtiendoTemperaturas conversion = new ConvirtiendoTemperaturas();
		Interfaces seleccionar = new Interfaces();
		switch (opcionMedida) {
		case "Celsius a fahrenheit":

			String mensaje = String.valueOf(conversion.convirtiendoCelsiusFahrenheit(medida));
			JOptionPane.showMessageDialog(null, "Hola, " + medida + " Celsius equivalen a " + mensaje + " Fahrenheit");
			seleccionar.Seleccion();
			break;
		case "fahrenheit a Celsius":

			String mensaje1 = String.valueOf(conversion.convirtiendoFahrenheitCelsius(medida));
			JOptionPane.showMessageDialog(null, "Hola, " + medida + " Fahrenheit equivalen a " + mensaje1 + " Celsius");
			seleccionar.Seleccion();
			break;
		case "Celsius a kelvin":
			String mensaje2 = String.valueOf(conversion.convirtiendoCelsiusKelvin(medida));
			JOptionPane.showMessageDialog(null, "Hola, " + medida + " Celsius equivalen a " + mensaje2 + " Kelvin");
			seleccionar.Seleccion();
			break;
		case "kelvin a Celsius":
			String mensaje3 = String.valueOf(conversion.convirtiendokelvinCelsius(medida));
			JOptionPane.showMessageDialog(null, "Hola, " + medida + " Kelvin equivalen a " + mensaje3 + " Celsius");
			seleccionar.Seleccion();

			break;

		}
	}

}
