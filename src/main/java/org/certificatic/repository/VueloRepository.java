package org.certificatic.repository;

import java.util.List;
import org.certificatic.model.Vuelo;

public interface VueloRepository {
	/**
	 * Crear un vuelo nuevo
	 * @param vuelo
	 * @return
	 */
	Vuelo crearVuelo(Vuelo vuelo);
	
	/**
	 * Obtener todos los vuelos
	 * @return
	 */
	List<Vuelo> obtenerVuelos();
	

}
