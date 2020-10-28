/**
 * ProductoAPI.java Fecha de creación: 22/10/2020, 05:32:39 PM Copyright (c) 2020
 * 3LineDevelopment Todos los derechos reservados. Este software es información confidencial,
 * propiedad de 3LineDevelopment. Esta información confidencial no deberá ser divulgada y solo
 * se podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package omare.com.mx.producto.api;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<Producto> registraProducto(@RequestBody Producto producto) {
		final long start = System.nanoTime();
		logger.info("ProductoAPI: inicia registraProducto");
		try {
			Producto newProducto = productoService.save(producto);
			return new ResponseEntity<>(newProducto, HttpStatus.CREATED);
		} catch(Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		} finally {
			final long end = System.nanoTime();
			logger.info("time: " + ((end - start) / 1000000) + " ms");
			logger.info("time: " + ((end - start) / 1000000000) + " seconds");
			logger.info("ProductoAPI: Termina registraProducto");
		}
	}

	@GetMapping("/obtieneProducto/{id}")
	public ResponseEntity<Producto> obtieneProductoById(@PathVariable("id") String id) {
		final long start = System.nanoTime();
		logger.info("ProductoAPI: inicia getAllProducts");
		Optional<Producto> producto = productoService.getProductoById(id);
		if (producto.isPresent()) {
			final long end = System.nanoTime();
			logger.info("time: " + ((end - start) / 1000000) + " ms");
			logger.info("time: " + ((end - start) / 1000000000) + " seconds");
			logger.info("ProductoAPI: Termina getAllProducts");
			return new ResponseEntity<>(producto.get(), HttpStatus.OK);
		} else {
			final long end = System.nanoTime();
			logger.info("time: " + ((end - start) / 1000000) + " ms");
			logger.info("time: " + ((end - start) / 1000000000) + " seconds");
			logger.info("ProductoAPI: Termina getAllProducts");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
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
		Optional<Producto> producto = productoService.getProductoById(id);
		if (producto.isPresent()) {
			productoService.delete(id);
			final long end = System.nanoTime();
			logger.info("time: " + ((end - start) / 1000000) + " ms");
			logger.info("time: " + ((end - start) / 1000000000) + " seconds");
			logger.info("ProductoAPI: termina getProduct");
		}
	}

	@PutMapping("/actualizaProducto/{id}")
	public void updateProducto(@PathVariable String id, @RequestBody Producto newProducto) {
		final long start = System.nanoTime();
		logger.info("ProductoAPI: inicia updateProducto");
		Optional<Producto> producto = productoService.getProductoById(id);
		if (producto.isPresent()) {
			productoService.save(newProducto);
			final long end = System.nanoTime();
			logger.info("time: " + ((end - start) / 1000000) + " ms");
			logger.info("time: " + ((end - start) / 1000000000) + " seconds");
			logger.info("ProductoAPI: termina updateProducto");
		}
	}

}
