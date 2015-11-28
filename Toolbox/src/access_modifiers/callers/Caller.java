package access_modifiers.callers;

import access_modifiers.entities.PackagePrivate;
import access_modifiers.entities.Public;

public class Caller {
	public static void main(String[] args){
		Public publique=new Public();
		PackagePrivate pp=new PackagePrivate();
	}
}
