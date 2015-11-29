package designpatterns.simple_service_provider.services;

public class NoSuchServiceException extends Exception{

	public NoSuchServiceException(String serviceName){
		super("Such service "+serviceName+" does not exist");
	}
}
