/**
 * 
 */
package com.example.nttdata.bootcampdia2;

/**
 * @author apinotej
 *
 */
public class Motor {

	private Integer CapacidadMotor;

	public Integer getCapacidadMotory() {
		return CapacidadMotor;
	}

	public void setCapacidadMotor(Integer CapacidadMotor) {
		this.CapacidadMotor = CapacidadMotor;
	}

	public Motor(Integer CapacidadMotor) {
		this.CapacidadMotor = CapacidadMotor;
	}

	public enum Tipo {
		LUJO, SPORT, COMPACTO
	}

}
