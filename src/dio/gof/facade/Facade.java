package dio.gof.facade;

import subsystem.crm.CrmService;
import subsystem1.cep.CepApi;

public class Facade {
	
	public void migrateClient(String name, String zipcode) {
		String city = CepApi.getInstance().recoverCity(zipcode);
		String state = CepApi.getInstance().recoverState(zipcode);
		
		CrmService.savedClient(name, zipcode, city, state);
		
	}

}
