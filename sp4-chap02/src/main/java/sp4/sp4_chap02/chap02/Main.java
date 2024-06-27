package sp4.sp4_chap02.chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Greeter greeter = new Greeter();
		//greeter.setFormat("%s, 안녕하세요!");
		// GenericXmlApplicationContext 클래스는 xml 파일로부터 설정 정보를 읽어 빈 객체를 생성하고 관리
		//1. 컨테이너 초기화
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// 2. 컨테이너 사용
		Greeter greeter1 = ctx.getBean("greeter", Greeter.class);
		Greeter greeter2 = ctx.getBean("greeter", Greeter.class);
		
		System.out.println(greeter1 == greeter2); 
		// 스프링은 디폴트로 한 개의 객체만을 생성하고 싱글톤의 범위를 갖는다
		
		//String msg = greeter1.greet("스프링");
        //System.out.println(msg);
		
		//3. 컨테이너 종료
		ctx.close();
	}

}
