package dio.gof.singleton;

/**
* Singleton "eager"
*
* @author darknite
* 
*/

public class SingletonEager{
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	public static SingletonEager getInstance() {
		return instance;
		
	}
}

