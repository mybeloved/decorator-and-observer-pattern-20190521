import com.google.common.eventbus.EventBus;
import observerpattern.guava.GuavaEvent;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 被观察者(JDK提供的一种观察者的实现方式)
 * @Author: whx
 * @Create: 2019-05-24 14:10
 **/
public class GuavaEventTest {
	
	public static void main(String[] args) {
		//消息总线
		EventBus eventBus = new EventBus();
		GuavaEvent guavaEvent = new GuavaEvent();
		eventBus.register(guavaEvent);
		eventBus.post("Tom");
		
		//从Struts到SpringMVC的升级
		//因为Struts面向的类，而SpringMVC面向的是方法
		
		//前面两者面向的是类，Guava面向是方法
		
		//能够轻松落地观察模式的一种解决方案
		//MQ
	}
}
