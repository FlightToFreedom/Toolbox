package designpatterns.simple_service_provider.services;

public class ServiceB implements Service {

	private static ServiceB serviceB;
	private final String name;

	private ServiceB(String name){
		this.name=name;
	}

	public static ServiceB getInstance() {
		if(serviceB==null)
			serviceB=new ServiceB("ServiceB");
		return serviceB;
	}

	@Override
	public String getName() {
		return name;
	}

}
