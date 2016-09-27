package spring.autowiring.src;

import org.springframework.beans.factory.annotation.Autowired;

public class Outer {

	private final Inner inner;

	@Autowired
	public Outer(Inner inner){
		this.inner = inner;
	}

	public Inner getInner(){
		return inner;
	}
}
