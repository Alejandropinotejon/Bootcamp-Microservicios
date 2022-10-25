/**
 * 
 */
package com.example.nttdata.bootcampdia2;

import com.example.nttdata.bootcampdia2.Motor.Tipo;

/**
 * @author apinotej
 *
 */
public class Coche {
	private Tipo tipo;
	private Integer asientos;
	private Integer ruedas;
	private Motor motor;

	public Coche(Tipo tipo, Integer asientos, Integer ruedas, Motor motor) {
		this.tipo = tipo;
		this.asientos = asientos;
		this.ruedas = ruedas;
		this.motor = motor;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * @param asientos the asientos to set
	 */
	public void setAsientos(Integer asientos) {
		this.asientos = asientos;
	}

	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Integer getRuedas() {
		return ruedas;
	}

	public Motor getMotor() {
		return motor;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Integer getAsientos() {
		return asientos;
	}
}
