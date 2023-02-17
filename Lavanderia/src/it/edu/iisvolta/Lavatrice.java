package it.edu.iisvolta;

import java.time.LocalTime;

public class Lavatrice {
	private int capacità;
	private int livelloAcqua;
	private int temperatura;
	private int velocitàRotazione;
	private boolean detersivo;
	private int stato;
	private float credito;
	private LocalTime dataOraAvvio;
	
	public Lavatrice(int capacità) {
		super();
		this.capacità = capacità;
		
		//inizializzazione attributi
		livelloAcqua=0;
		temperatura=0;
		velocitàRotazione=0;
		stato=0;
		credito= 0;
		detersivo= false;
	}
	
	
	
	
}
