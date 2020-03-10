package org.certificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.model.Vuelo;

@WebService
public interface VueloService {

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
