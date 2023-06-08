package lab3;
/**
 *  ласс јвтомобиль - базвый класс дл€ объектов транспорта
 * @author —лива ћ.¬.
 */
public class pr1 {
	/** ѕоле дл€ хранени€ названи€ фирмы автомобил€ */
	private String firm;
	/**ѕоле дл€ хранени€ максимальной скорости автомобил€*/
	private int maxSpeed;
	/**
	 * 
	 * @param firma - название фирмы автомобил€ */
	public void setFirm(String firma) {
	firm=firma;
	}
	/**
	 * ”станавливает значение пол€ (@link Auto#maxSpeed)
	 * @param speed - значение - максимальной скорости автомобил€ */
	public void setMaxSpeed(int speed) {
	maxSpeed = speed;
	}
	/**
	 * ¬озвращает значение пол€ (@link Auto#firm)
	 * @return целое значение максимальной скорости автомобил€ */
	public int getMaxSpeed() {
	return maxSpeed;
	}
	/** 
	 * ¬озвращает значение пол€ (@link Auto#firm)
	 * @return строку с названием фирмы автомобил€ */
	public String getFirm() {
	return firm;
	}
	/**
	 * —оздает автомобиль с фирмой "Ѕез названи€" и максимальной скоростью равной 0*/
	public void Auto() {
		firm= "Ѕез названи€";
		maxSpeed = 0;
	}
	/**
	 * —оздает автомобиль с заданными значени€ми фирмы и максимальной скорости
	 * @param firma - название фирмы автомобил€
	 * @param speed - значение максимальной скорости автомобил€*/
	public void Auto(String firma, int speed) {
		firm = firma;
		maxSpeed=speed;
	}
}
