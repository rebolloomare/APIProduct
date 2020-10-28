/**
 * Producto.java Fecha de creación: 22/10/2020, 04:34:18 PM Copyright (c) 2020
 * 3LineDevelopment.com Todos los derechos reservados. Este software es información
 * confidencial, propiedad de 3LineDevelopment.com. Esta información confidencial no deberá ser
 * divulgada y solo se podrá utilizar de acuerdo a los términos que determine la propia
 * empresa.
 */
package omare.com.mx.producto.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Document(collection = "producto")
public class Producto implements Serializable {

	/**
	 * TODO [Agregar documentación del atributo]
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String nombre;

	private String descripcion;

	private String tipo;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */

	public Producto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param nombre
	 * @param descripcion
	 * @param tipo
	 * @param fechaInicial
	 * @param fechaFinal
	 */

	public Producto(String nombre, String descripcion, String tipo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
	}

	/**
	 * @return el atributo id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id parametro id a actualizar
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return el atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre parametro nombre a actualizar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el atributo descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion parametro descripcion a actualizar
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return el atributo tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo parametro tipo a actualizar
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
