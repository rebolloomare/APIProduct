/**
 * ProductoAPI.java Fecha de creación: 22/10/2020, 05:32:39 PM Copyright (c) 2020
 * 3LineDevelopment Todos los derechos reservados. Este software es información confidencial,
 * propiedad de 3LineDevelopment. Esta información confidencial no deberá ser divulgada y solo
 * se podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package omare.com.mx.producto.api;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	/**
	 * TODO [Agregar documentación del atributo]
	 */
	private final Logger logger = LoggerFactory.getLogger(ProductoAPI.class);

	/**
	 * TODO [Agregar documentación del atributo]
	 */
	@Autowired
	private ProductoService productoService;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author Omar Rebollo (omar.rebollo@gmail.com)
	 * @param producto
	 */
	@PostMapping("/registraProducto")
	public void registraProducto(@RequestBody Producto producto) {
		logger.info("ProductoAPI: inicia registraProducto");
		productoService.save(producto);
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author Omar Rebollo (omar.rebollo@gmail.com)
	 * @return
	 */
	@GetMapping("/obtieneProductos")
	public List<Producto> getAllProducts() {
		final long start = System.nanoTime();
		logger.info("ProductoAPI: inicia getAllProducts");
		List<Producto> products = productoService.getAllProducts();
		final long end = System.nanoTime();
		logger.info("time: " + ((end - start) / 1000000) + " ms");
		logger.info("time: " + ((end - start) / 1000000000) + " seconds");
		logger.info("ProductoAPI: Termina getAllProducts");
		return products;
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author Omar Rebollo (omar.rebollo@gmail.com)
	 * @param nombre
	 * @return
	 */
	@GetMapping("/obtieneProducto/{nombre}")
	public List<Producto> getProduct(@PathVariable String nombre) {
		final long start = System.nanoTime();
		logger.info("ProductoAPI: inicia getProduct");
		List<Producto> productos = productoService.getProducto(nombre);
		final long end = System.nanoTime();
		logger.info("time: " + ((end - start) / 1000000) + " ms");
		logger.info("time: " + ((end - start) / 1000000000) + " seconds");
		logger.info("ProductoAPI: termina getProduct");
		return productos;
	}

	@DeleteMapping("/eliminaProducto/{id}")
	public void deleteProducto(@PathVariable String id) {
		final long start = System.nanoTime();
		logger.info("ProductoAPI: inicia getProduct");
		productoService.delete(id);
		final long end = System.nanoTime();
		logger.info("time: " + ((end - start) / 1000000) + " ms");
		logger.info("time: " + ((end - start) / 1000000000) + " seconds");
		logger.info("ProductoAPI: termina getProduct");
	}

}
