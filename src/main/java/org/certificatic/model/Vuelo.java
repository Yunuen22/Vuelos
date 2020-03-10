package org.certificatic.model;

public class Vuelo {

		private String numVuelo;
		private Aeropuerto destino;
		private Aeropuerto salida;
		private String piloto;
		private String fecha;
		
		public String getNumVuelo() {
			return numVuelo;
		}
		public void setNumVuelo(String numVuelo) {
			this.numVuelo = numVuelo;
		}
		public Aeropuerto getDestino() {
			return destino;
		}
		public void setDestino(Aeropuerto destino) {
			this.destino = destino;
		}
		public Aeropuerto getSalida() {
			return salida;
		}
		public void setSalida(Aeropuerto salida) {
			this.salida = salida;
		}
		public String getPiloto() {
			return piloto;
		}
		public void setPiloto(String piloto) {
			this.piloto = piloto;
		}
		public String getFecha() {
			return fecha;
		}
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		
		
}
