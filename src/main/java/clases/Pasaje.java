package clases;
// Generated 08-ene-2020 19:06:12 by Hibernate Tools 4.3.1.Final

/**
 * Pasaje generated by hbm2java
 */
public class Pasaje implements java.io.Serializable {

	private PasajeId id;
	private Pasajero pasajero;
	private Vuelo vuelo;
	private Short numasiento;
	private String clase;
	private Float pvp;

	public Pasaje() {
	}

	public Pasaje(PasajeId id, Pasajero pasajero, Vuelo vuelo) {
		this.id = id;
		this.pasajero = pasajero;
		this.vuelo = vuelo;
	}

	public Pasaje(PasajeId id, Pasajero pasajero, Vuelo vuelo, Short numasiento, String clase, Float pvp) {
		this.id = id;
		this.pasajero = pasajero;
		this.vuelo = vuelo;
		this.numasiento = numasiento;
		this.clase = clase;
		this.pvp = pvp;
	}

	public PasajeId getId() {
		return this.id;
	}

	public void setId(PasajeId id) {
		this.id = id;
	}

	public Pasajero getPasajero() {
		return this.pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Vuelo getVuelo() {
		return this.vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Short getNumasiento() {
		return this.numasiento;
	}

	public void setNumasiento(Short numasiento) {
		this.numasiento = numasiento;
	}

	public String getClase() {
		return this.clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Float getPvp() {
		return this.pvp;
	}

	public void setPvp(Float pvp) {
		this.pvp = pvp;
	}

}
