package Fabrica;

public class FabricaAgenda {
	
	public IAgenda getContacto(String p) {
		if(p.equalsIgnoreCase("belgica")) {
			return new AgendaBelgica("936664789","c/mayor n�5");
		}else if(p.equalsIgnoreCase("Grecia")) {
			return new AgendaGrecia("5687412","c/camelias n33");
		}else if(p.equalsIgnoreCase("Espa�a")) {
			return new AgendaEspa�a("9366600000","c/constitucion 44");
		}else {
			return null;
		}
	}

	
	
}
