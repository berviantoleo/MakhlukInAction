package makhlukinaction.model;
/**
 * @author Jeremia Jason Lasiman - 13514021
 */

abstract public class Makhluk {
	/**
	 * type : each makhluk has different type to differentiate their appearance
	 */
	protected int type;
	/**
	 * age : maximum age / lifespan of makhluk.
	 */
	protected int age;
	/**
	 * agenow : current age of makhluk (counted by cycle)
	 */
	protected int ageNow;
	/**
	 * powerlevel : strength of makhluk to survive battles
	 */
	protected int powerLevel;
	/**
	 * time (per cycle) needed for makhluk to move
	 */
	protected int deltaT;
	/**
	 * x : x position of makhluk
	 */
	protected int x;
	/**
	 * y : y position of makhluk
	 */
	protected int y;

	/**
	 * this procedure is to change the makhluk position (x,y) each deltaT cycle.
	 */
	public abstract void move();

	/**
	 * this function is to get makhluk's strength
	 * 
	 * @return powerlevel,
	 */
	public int getPowerLevel() {
		return powerLevel;
	}

	/**
	 * this function is to get maximum age of makhluk
	 * 
	 * @return age,
	 */
	public int getAge() {
		return age;
	}

	/**
	 * this function is to get current age of makhluk
	 * 
	 * @return agenow,
	 */
	public int getAgeNow() {
		return ageNow;
	}

	/**
	 * this function is to get time needed for makhluk to move
	 * 
	 * @return deltaT,
	 */
	public double getDeltaT() {
		return deltaT;
	}

	/**
	 * this function is to return makhluk's type for appearance
	 * 
	 * @return type,
	 */
	public int getType() {
		return type;
	}

	/**
	 * this function is to get X position of makhluk
	 * 
	 * @return x,
	 */
	public int getX() {
		return x;
	}

	/**
	 * this function is to get Y position of makhluk
	 * 
	 * @return y,
	 */
	public int getY() {
		return y;
	}

}
