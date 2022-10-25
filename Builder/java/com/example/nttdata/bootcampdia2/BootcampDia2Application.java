package com.example.nttdata.bootcampdia2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BootcampDia2Application implements CommandLineRunner{
	

	public static void main(String[] args) { SpringApplication.run(BootcampDia2Application.class, args);}

	@Override
	public void run(String... args) throws Exception {
		
		Concesionario concesionario = new Concesionario();
	    ConstructorCoche builder = new ConstructorCoche();
	    concesionario.crearCocheCompacto(builder);
	    Coche coche1 = builder.getCoche();
	    System.out.println("Mi: " + coche1.getTipo() + " coche");
		
		
	}

}
