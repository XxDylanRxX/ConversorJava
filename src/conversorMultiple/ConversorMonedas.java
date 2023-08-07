package conversorMultiple;

import javax.swing.JOptionPane;

public class ConversorMonedas {

	public void seleccion(double dinero, String opcion) {
		Interfaces seleccionar = new Interfaces();

		switch (opcion) {
		case "Dolar A Córdobas":
			ConvirtiendoMonedas conversion = new ConvirtiendoMonedas();
			String mensaje = String.valueOf(conversion.convirtiendoDolaresCordobas(dinero));
			JOptionPane.showMessageDialog(null, "Hola, " + dinero + " dolares equivalen a " + mensaje + " cordobas");
			seleccionar.Seleccion();
			break;
		case "Córdobas A Dolares":
			ConvirtiendoMonedas conversion1 = new ConvirtiendoMonedas();
			String mensaje1 = String.valueOf(conversion1.convirtiendoCordobasDolares(dinero));
			JOptionPane.showMessageDialog(null, "Hola, " + dinero + " cordobas equivalen a " + mensaje1 + " dolares");
			seleccionar.Seleccion();
			break;
		case "Euros A Códobas":
			ConvirtiendoMonedas conversion2 = new ConvirtiendoMonedas();
			String mensaje2 = String.valueOf(conversion2.convirtiendoEurosCordobas(dinero));
			JOptionPane.showMessageDialog(null, "Hola, " + dinero + " Euros equivalen a " + mensaje2 + " cordobas");
			seleccionar.Seleccion();
			break;
		case "Córdobas A Euros":
			ConvirtiendoMonedas conversion3 = new ConvirtiendoMonedas();
			String mensaje3 = String.valueOf(conversion3.convirtiendoCordobaEuros(dinero));
			JOptionPane.showMessageDialog(null, "Hola, " + dinero + " Cordobas equivalen a " + mensaje3 + " Euros");
			seleccionar.Seleccion();
			break;

		}

	}
}
