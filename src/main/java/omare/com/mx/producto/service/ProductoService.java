/**
 * ProductoService.java
 * Fecha de creación: 22/10/2020, 05:04:11 PM
 *
 * Copyright (c) 2020 3LineDevelopment 
 * Todos los derechos reservados.
 *
 * Este software es información confidencial, propiedad de
 * 3LineDevelopment. Esta información confidencial
 * no deberá ser divulgada y solo se podrá utilizar de acuerdo
 * a los términos que determine la propia empresa.
 */
package omare.com.mx.producto.service;

import java.util.List;
import omare.com.mx.producto.model.Producto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since 
 */
public interface ProductoService {
	
	/**
	 *  TODO [Agregar documentacion al método]
	 *  @author Omar Rebollo (omar.rebollo@gmail.com)
	 *  @param producto
	 *  @return
	 */
	int save(Producto producto);
	
	/**
	 *  TODO [Agregar documentacion al método]
	 *  @author Omar Rebollo (omar.rebollo@gmail.com)
	 *  @param nombre
	 *  @return
	 */
	Producto getProducto(String nombre);
	
	/**
	 *  TODO [Agregar documentacion al método]
	 *  @author Omar Rebollo (omar.rebollo@gmail.com)
	 *  @return
	 */
	List<Producto> getAllProducts();
	
	/**
	 *  TODO [Agregar documentacion al método]
	 *  @author Omar Rebollo (omar.rebollo@gmail.com)
	 *  @param producto
	 *  @return
	 */
	int delete(Producto producto);

}
