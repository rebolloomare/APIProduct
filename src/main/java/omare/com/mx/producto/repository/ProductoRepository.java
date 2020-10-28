/**
 * ProductoRepository.java Fecha de creación: 22/10/2020, 04:58:31 PM Copyright (c) 2020
 * 3LineDevelopment Todos los derechos reservados. Este software es información confidencial,
 * propiedad de 3LineDevelopment. Esta información confidencial no deberá ser divulgada y solo
 * se podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package omare.com.mx.producto.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import omare.com.mx.producto.model.Producto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since
 */
@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {

	List<Producto> findByNombre(String nombre);

	void deleteByTipo(String tipo);

}
