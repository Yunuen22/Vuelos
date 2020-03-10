package org.certificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.model.Vuelo;
import org.certificatic.repository.VueloRepository;
import org.certificatic.repository.VueloRepositoryImpl;

@WebService(endpointInterface = "org.certificatic.service.VueloService")
public class VueloServiceImpl implements VueloService{

	VueloRepository vueloRepo = new VueloRepositoryImpl();
			
	@Override
	public Vuelo crearVuelo(Vuelo vuelo) {
		
		return vueloRepo.crearVuelo(vuelo);
	}

	@Override
	public List<Vuelo> obtenerVuelos() {
		
		return vueloRepo.obtenerVuelos();
	}

	
	
}
