/**
 * 
 */
package com.example.nttdata.bootcampdia2;

import com.example.nttdata.bootcampdia2.Motor.Tipo;

/**
 * @author apinotej
 *
 */
public interface Builder {
	
	void setTipo(Tipo tipo);

	void setAsientos(Integer asientos);

	void setMotor(Motor motor);

	void setRuedas(Integer ruedas);
}
