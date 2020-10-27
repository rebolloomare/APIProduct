/**
 * ProductoAPI.java
 * Fecha de creación: 22/10/2020, 05:32:39 PM
 *
 * Copyright (c) 2020 3LineDevelopment 
 * Todos los derechos reservados.
 *
 * Este software es información confidencial, propiedad de
 * 3LineDevelopment. Esta información confidencial
 * no deberá ser divulgada y solo se podrá utilizar de acuerdo
 * a los términos que determine la propia empresa.
 */
package omare.com.mx.producto.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import omare.com.mx.producto.model.Producto;
import omare.com.mx.producto.service.ProductoService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since 
 */
@RestController
public class ProductoAPI {
	
	private final Logger logger = LoggerFactory.getLogger(ProductoAPI.class);
	
	@Autowired
	private ProductoService productoService;
	
	@PostMapping("/registraProducto")
	public void registraProducto(@RequestBody Producto producto) {
		logger.info("restcontroller: registra producto");
		productoService.save(producto);
	}

}
