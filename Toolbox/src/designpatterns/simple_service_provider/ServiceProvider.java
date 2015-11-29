package designpatterns.simple_service_provider;

import java.util.HashMap;
import java.util.Map;

import designpatterns.simple_service_provider.services.NoSuchServiceException;
import designpatterns.simple_service_provider.services.Service;
import designpatterns.simple_service_provider.services.ServiceA;
import designpatterns.simple_service_provider.services.ServiceB;
import designpatterns.simple_service_provider.services.ServiceC;

//Provides single instance of Service
public final class ServiceProvider implements Provider{

	private Map<String, Service> services;

	private ServiceProvider(){
		//No instantiation allowed!
	}

	@Override
	public Service provideService(String serviceName) throws NoSuchServiceException{
		if(services==null)
			services=loadServices();
		Service service=services.get(serviceName);
		if(service==null)
			throw new NoSuchServiceException(serviceName);
		return service;
	}

	/**
	 * This should be enhanced, it looks bad to me to instantiate services manually, we 
	 * can better use another way "Reflection??" and get all services available from the services package
	 */
	@Override
	public Map<String, Service> loadServices() {

		Map<String,Service> services=new HashMap<String,Service>();
		ServiceA a=ServiceA.getInstance();
		ServiceB b=ServiceB.getInstance();
		ServiceC c=ServiceC.getInstance();
		services.put("A", a);
		services.put("B", b);
		services.put("C", c);
		return services;
	}


}
