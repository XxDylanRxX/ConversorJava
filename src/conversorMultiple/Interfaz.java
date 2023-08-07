package conversorMultiple;

import javax.swing.JOptionPane;

public class Interfaz {
	public static void main(String[] args) {

		String opcionesConversiones = (JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Conversión de monedas", "Conversión de Temperatura" }, "Seleccion")).toString();

		switch (opcionesConversiones) {
		case "Conversión de monedas":
			String opciones = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ",
					"Monedas", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "Dolar A Córdobas", "Córdobas A Dolares", "Euros A Códobas", "Córdobas A Euros" },
					"Seleccion")).toString();
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + opciones);
			String cantidad = JOptionPane.showInputDialog("Introduce la cantidad a cambiar:");
			double cantidadMoneda = Double.parseDouble(cantidad);
			ConversorMonedas convirtiendo = new ConversorMonedas();
			convirtiendo.seleccion(cantidadMoneda, opciones);

			break;

		case "Conversión de Temperatura":

			String opciones1 = (JOptionPane
					.showInputDialog(null, "Elije medida a la que deseas convertir", "Monedas",
							JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Celsius a fahrenheit",
									"fahrenheit a Celsius", "Celsius a kelvin", "kelvin a Celsius" },
							"Seleccion"))
					.toString();
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + opciones1);
			String medida = JOptionPane.showInputDialog("Introduce la cantidad a cambiar:");
			double medidaTemperatura = Double.parseDouble(medida);
			ConversorTemperatura convirtiendoTemperaturas = new ConversorTemperatura();
			convirtiendoTemperaturas.seleccionTemperatura(medidaTemperatura, opciones1);
			break;
		}

	}

}
