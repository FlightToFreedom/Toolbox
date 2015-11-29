package designpatterns.simple_service_provider.services;

public class ServiceC implements Service {

	private static ServiceC serviceC;
	private final String name;

	private ServiceC(String name){
		this.name=name;
	}

	public static ServiceC getInstance() {
		if(serviceC==null)
			serviceC=new ServiceC("ServiceC");
		return serviceC;
	}

	@Override
	public String getName() {
		return name;
	}

}
