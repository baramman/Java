package ch09;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)
@interface UserAnnot {
	String value();
	int number() default 5;
}

class UserClass {
	
	@UserAnnot (value="A")
	public void methodA() {
		System.out.println("methodA() 실행");
	}
	
	@UserAnnot (value="B", number=10)
	public void methodB() {
		System.out.println("methodB() 실행");
	}
	
}

public class p249 {

}
