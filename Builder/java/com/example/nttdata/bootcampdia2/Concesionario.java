/**
 * 
 */
package com.example.nttdata.bootcampdia2;

import com.example.nttdata.bootcampdia2.Motor.Tipo;

/**
 * @author apinotej
 *
 */
public class Concesionario {
	
	public void crearCocheDeLujo(Builder builder) {
		builder.setTipo(Tipo.LUJO);
		Motor motor = new Motor(2700);
		builder.setAsientos(4);
		builder.setMotor(motor);
	}

	public void crearCocheCompacto(Builder builder) {
		builder.setTipo(Tipo.COMPACTO);
		Motor motor = new Motor(1200);
		builder.setMotor(motor);
		builder.setAsientos(4);
	}

	public void crearCocheSport(Builder builder) {
		builder.setTipo(Tipo.SPORT);
		Motor motor = new Motor(5400);
		builder.setAsientos(2);
		builder.setMotor(motor);
	}
}
