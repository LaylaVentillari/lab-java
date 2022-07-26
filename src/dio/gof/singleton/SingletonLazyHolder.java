package dio.gof.singleton;

/**
 * Singleton "lazy holder"
 * 
 * @author darknite
 *
 */

public class SingletonLazyHolder{
	
	private static class InstanceHolder {
	public static SingletonLazyHolder instance = new SingletonLazyHolder();
	
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstance() {
		
		return InstanceHolder.instance;
	}
}
