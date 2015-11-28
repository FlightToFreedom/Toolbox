package inheritance.force_constructor;

public class Entity {

	private final String name;
	private final String type;
	private final int number;

	//3 args
	public Entity(String name,String type,int number){
		this.name=name;
		this.type=type;
		this.number=number;
	}
	//2args
	public Entity(String name,String type){
		this.name=name;
		this.type=type;
		this.number=0;
	}
	//1 arg
	public Entity(String name){
		this.name=name;
		this.type="type";
		this.number=0;
	}

	void print(){
		System.out.println(name+"-"+type+"-"+number); 	
	}
}
