package org.certificatic.repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.model.Vuelo;

public class VueloRepositoryImpl implements VueloRepository{
	
	private static List<Vuelo> vuelosLista = new ArrayList<Vuelo>();
	

	@Override
	public Vuelo crearVuelo(Vuelo vuelo) {
		System.out.println("Crear vuelo:::");
		vuelosLista.add(vuelo);
		return vuelo;
	}

	@Override
	public List<Vuelo> obtenerVuelos() {
		System.out.println("Obtener todos los vuelos");
		return vuelosLista;
	}
	

}
