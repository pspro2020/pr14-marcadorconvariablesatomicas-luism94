package codes;

import java.util.concurrent.atomic.AtomicLong;

public class ScoreBoard {
	//Clase Marcador que contiene los resultados de las tiradas de dado de los hilos secundarios
	
	//Variables contador de cada cara del dado
	private AtomicLong oneThrows = new AtomicLong(0);
	private AtomicLong twoThrows = new AtomicLong(0);
	private AtomicLong threeThrows = new AtomicLong(0);
	private AtomicLong fourThrows = new AtomicLong(0);
	private AtomicLong fiveThrows = new AtomicLong(0);
	private AtomicLong sixThrows = new AtomicLong(0);

	//Metodos get de cada contador
	private int numberOneScore() {
		return oneThrows.intValue();
	}
	private int numberTwoScore() {
		return twoThrows.intValue();
	}
	private int numberThreeScore() {
		return threeThrows.intValue();
	}
	private int numberFourScore() {
		return fourThrows.intValue();
	}
	private int numberFiveScore() {
		return fiveThrows.intValue();
	}
	private int numberSixScore() {
		return sixThrows.intValue();
	}
	
	/* Metodo que se encarga de añadir una tirada mas al contador del valor recibido del dado
	** Las variables AtomicLong se encargan de leer el valor previo e incrementarlo de forma atomica
	** independientemente de cuantos hilos quieran acceder a la misma variable
	*/
	void updateScores(int throwScore) {
		switch (throwScore) {
		case 1:
			oneThrows.addAndGet(1);
			break;
		case 2:
			twoThrows.addAndGet(1);
			break;
		case 3:
			threeThrows.addAndGet(1);
			break;
		case 4:
			fourThrows.addAndGet(1);
			break;
		case 5:
			fiveThrows.addAndGet(1);
			break;
		case 6:
			sixThrows.addAndGet(1);
			break;
		}
	}
	
	//Metodo que muestra el resultado de la ejecucion de todos los hilos mostrando el valor de cada contador
	public void showNumberThrows() {
		System.out.println(Messages.ANNOUNCE_SCORES);
		System.out.println(String.format(Messages.NUMBER_1_SCORE, numberOneScore()));
		System.out.println(String.format(Messages.NUMBER_2_SCORE, numberTwoScore()));
		System.out.println(String.format(Messages.NUMBER_3_SCORE, numberThreeScore()));
		System.out.println(String.format(Messages.NUMBER_4_SCORE, numberFourScore()));
		System.out.println(String.format(Messages.NUMBER_5_SCORE, numberFiveScore()));
		System.out.println(String.format(Messages.NUMBER_6_SCORE, numberSixScore()));
		
		System.out.println(String.format(Messages.TOTAL_THROWS, numberOneScore(), numberTwoScore(),
				numberThreeScore(), numberFourScore(), numberFiveScore(), numberSixScore(),
				numberOneScore() + numberTwoScore() + numberThreeScore() 
				+ numberFourScore() + numberFiveScore() + numberSixScore()));
	}
}
