package subsystem1.cep;


public class CepApi {
	
	private static CepApi instance = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstance() {
		return instance;
		
	}
	public String recoverCity(String zipcode) {
		return "Floripa";
		
	}
	public String recoverState(String zipcode) {
		return "SC";
	}

}
