package hibernate.pojos;

public class Permissions {

	private final int userId;
	private final String permissionName;
	private final int permissionLevel;

	public Permissions(int userId,String permissionName,int permissionLevel){
		this.userId=userId;
		this.permissionName=permissionName;
		this.permissionLevel=permissionLevel;
	}


	public int getUserId() {
		return userId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public int getPermissionLevel() {
		return permissionLevel;
	}

}
