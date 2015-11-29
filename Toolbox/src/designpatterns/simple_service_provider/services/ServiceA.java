package designpatterns.simple_service_provider.services;

public class ServiceA implements Service{

	private static ServiceA serviceA;
	private final String name;

	private ServiceA(String name){
		//no external instantiation	
		this.name=name;
	}

	public static ServiceA getInstance() {
		if(serviceA==null)
			serviceA=new ServiceA("ServiceA");
		return serviceA;
	}

	@Override
	public String getName() {
		return name;
	}

}
