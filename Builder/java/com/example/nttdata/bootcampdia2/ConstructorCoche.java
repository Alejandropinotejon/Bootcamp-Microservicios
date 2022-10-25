/**
 * 
 */
package com.example.nttdata.bootcampdia2;

import com.example.nttdata.bootcampdia2.Motor.Tipo;

/**
 * @author apinotej
 *
 */
public class ConstructorCoche implements Builder {
	private Integer asientos;
	private Tipo tipo;
	private Integer ruedas;
	private Motor motor;

	@Override
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public void setAsientos(Integer asientos) {
		this.asientos = asientos;
	}

	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}


	public Coche getCoche() {
		return new Coche(tipo, asientos, ruedas, motor);
	}
}
