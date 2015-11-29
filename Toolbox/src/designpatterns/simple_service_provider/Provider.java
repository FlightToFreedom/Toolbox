package designpatterns.simple_service_provider;

import java.util.Map;

import designpatterns.simple_service_provider.services.NoSuchServiceException;
import designpatterns.simple_service_provider.services.Service;

public interface Provider {

	public Service provideService(String serviceName) throws NoSuchServiceException;
	public Map<String,Service> loadServices();
}
