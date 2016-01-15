/**
 * 
 */
package com.headfirst.test;

import com.headfirst.behavioursImpl.RocketPoweredFly;
import com.headfirst.behavioursImpl.Squeak;
import com.headfirst.classes.Duck;
import com.headfirst.classes.MallardDuck;

/**
 * @author Rajni
 *
 * @date 10-Jan-2015 1:48:14 pm
 */
public class MainClass {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.display();
		
		duck.setFlyBehaviour(new RocketPoweredFly());
		duck.setQuackBehaviour(new Squeak());
		
		duck.performFly();
		duck.performQuack();
	}
}
