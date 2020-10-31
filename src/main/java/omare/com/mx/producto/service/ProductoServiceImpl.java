/**
 * ProductoServiceImpl.java Fecha de creación: 22/10/2020, 05:13:02 PM Copyright (c) 2020
 * 3LineDevelopment Todos los derechos reservados. Este software es información confidencial,
 * propiedad de 3LineDevelopment. Esta información confidencial no deberá ser divulgada y solo
 * se podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package omare.com.mx.producto.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import omare.com.mx.producto.model.Producto;
import omare.com.mx.producto.repository.ProductoRepository;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since
 */
@Service
public class ProductoServiceImpl implements ProductoService {

	private final Logger logger = LoggerFactory.getLogger(ProductoServiceImpl.class);

	@Autowired
	private ProductoRepository productoRepository;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * omare.com.mx.producto.service.ProductoService#save(omare.com.mx.producto.model.Producto)
	 */
	@Override
	public Producto save(Producto producto) {
		logger.info("ProductoServiceImpl: inicia save");
		Producto newProducto = productoRepository.save(producto);
		logger.info("ProductoServiceImpl: termina save");
		return newProducto;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see omare.com.mx.producto.service.ProductoService#getProducto(java.lang.String)
	 */
	@Override
	public List<Producto> getProducto(String nombre) {
		logger.info("ProductoServiceImpl: inicia getProducto");
		List<Producto> productos = productoRepository.findByNombre(nombre);
		logger.info("ProductoServiceImpl: termina getProducto");
		return productos;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see omare.com.mx.producto.service.ProductoService#getAllProducts()
	 */
	@Override
	public List<Producto> getAllProducts() {
		logger.info("ProductoServiceImpl: inicia getAllProducts");
		List<Producto> products = productoRepository.findAll();
		logger.info("ProductoServiceImpl: termina getAllProducts");
		return products;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see omare.com.mx.producto.service.ProductoService#delete(omare.com.mx.producto.model.
	 * Producto)
	 */
	@Override
	public void delete(String id) {
		logger.info("ProductoServiceImpl: inicia delete");
		productoRepository.deleteById(id);
		logger.info("ProductoServiceImpl: termina delete");

	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see omare.com.mx.producto.service.ProductoService#getProductoById(java.lang.String)
	 */
	@Override
	public Optional<Producto> getProductoById(String id) {
		logger.info("ProductoServiceImpl: inicia delete");
		Optional<Producto> producto = productoRepository.findById(id);
		logger.info("ProductoServiceImpl: termina delete");
		return producto;
	}

}
