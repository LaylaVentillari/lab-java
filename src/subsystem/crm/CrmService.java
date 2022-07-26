package subsystem.crm;

public class CrmService {
	
	private CrmService(){
		super();
	}
	
	public static void savedClient(String name, String zipcode, String state, String city) {
		System.out.println("client saved in CRM system:");
		System.out.println(name);
		System.out.println(zipcode);
		System.out.println(city);
		System.out.println(state);
	}

}
