package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.AggressiveBehavior;
import dio.gof.strategy.Behavior;
import dio.gof.strategy.DefensiveBehavior;
import dio.gof.strategy.NormalBehavior;
import dio.gof.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstance();
		System.out.println(lazyholder);
		lazyholder = SingletonLazyHolder.getInstance();
		System.out.println(lazyholder);
		
		//Strategy
		
		Behavior normal = new NormalBehavior();
		Behavior defensive = new DefensiveBehavior();
		Behavior aggressive = new AggressiveBehavior();
		
		Robot robot = new Robot();
		robot.setBehavior(normal);
		
		robot.move();
		robot.move();
		
		robot.setBehavior(aggressive);
		
		robot.move();
		robot.move();
		
		robot.setBehavior(defensive);
		
		robot.move();
		robot.move();

		//Facade
		
		Facade facade = new Facade();
		facade.migrateClient("nite", "2222777");


	}

}
