/**
 * ProductoServiceImpl.java
 * Fecha de creación: 22/10/2020, 05:13:02 PM
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

	/* La documentación de este método se encuentra en la clase o interface que
	 * lo declara  (non-Javadoc)
	 * @see omare.com.mx.producto.service.ProductoService#save(omare.com.mx.producto.model.Producto)
	 */
	@Override
	public int save(Producto producto) {
		logger.info("inicia service: registra producto");
		productoRepository.save(producto);
		logger.info("termina service: registra producto");
		return 1;
	}

	/* La documentación de este método se encuentra en la clase o interface que
	 * lo declara  (non-Javadoc)
	 * @see omare.com.mx.producto.service.ProductoService#getProducto(java.lang.String)
	 */
	@Override
	public Producto getProducto(String nombre) {
		return null;
		// TODO [codificar el cuerpo del método]
	}

	/* La documentación de este método se encuentra en la clase o interface que
	 * lo declara  (non-Javadoc)
	 * @see omare.com.mx.producto.service.ProductoService#getAllProducts()
	 */
	@Override
	public List<Producto> getAllProducts() {
		return null;
		// TODO [codificar el cuerpo del método]
	}

	/* La documentación de este método se encuentra en la clase o interface que
	 * lo declara  (non-Javadoc)
	 * @see omare.com.mx.producto.service.ProductoService#delete(omare.com.mx.producto.model.Producto)
	 */
	@Override
	public int delete(Producto producto) {
		return 0;
		// TODO [codificar el cuerpo del método]
	}

}
