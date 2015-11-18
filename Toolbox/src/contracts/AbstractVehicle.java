package contracts;

public abstract class AbstractVehicle implements Vehicle{

	private String firstName;
	private String lastName;
	private String plateNumber;

	@Override
	public String getPlateNumber(){
		return plateNumber;   
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	@Override
	public String getOwnerName() {

		return null;
	}

	@Override
	public String getOwnerLastName() {
		return null;
	}

	@Override
	public boolean equals(Object other){
		if(((Vehicle)other).getOwnerName().equals(firstName) && ((Vehicle)other).getOwnerLastName().equals(lastName) && ((Vehicle)other).getPlateNumber().equals(plateNumber))
			return true;
		return false;
	}

	//String's hash code is unmodifiable and portable across releases
	@Override
	public int hashCode(){
		return (firstName.hashCode()*31+plateNumber.hashCode()*31);
	}

}
