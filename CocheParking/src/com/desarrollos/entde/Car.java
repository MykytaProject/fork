package com.desarrollos.entde;

import java.util.Arrays;
import java.awt.Color;
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */
public class Car
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        car.accelerate();
        slowDown(); 	// hacemos Static los 3 métodos de abajo para poder acceder a ellos.
        moveDown(); 	//
        accelerate();	//
        Garage.printGarage(); // printGarage no es un metodo de la clase car sino de la clase Garage y hay que llamarlp de forma adecuada
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    
	/**
     * Accelerate the car
     * @throws InterruptedException 
     */
    	static public void accelerate() throws InterruptedException{
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    	static public void slowDown() throws InterruptedException{
    	String c = new String("     *"); //Correccion sintactica, String va con mayuscula
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    	static public void moveDown() throws InterruptedException{
    	String c = new String("\t\t\t\t  *"); // Correccion sintactica, String va con mayuscula, sobra paréntesis.
    	for(int i=0; i<5; i++) //Cambiamos comas por punto y comas
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
