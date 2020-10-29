/**
 * ProductoNotFoundException.java Fecha de creación: 28/10/2020, 06:51:21 PM Copyright (c) 2020
 * 3LineDevelopment Todos los derechos reservados. Este software es información confidencial,
 * propiedad de 3LineDevelopment. Esta información confidencial no deberá ser divulgada y solo
 * se podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package omare.com.mx.producto.exceptions;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since
 */
public class ProductoNotFoundException extends Exception {

	/**
	 * TODO [Agregar documentación del atributo]
	 */
	private static final long serialVersionUID = 1L;

	public ProductoNotFoundException(String message) {
		super(message);
	}

	public ProductoNotFoundException(String message, Throwable t) {
		super(message, t);
	}

}
