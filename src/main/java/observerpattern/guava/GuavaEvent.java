package observerpattern.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: google的观察者模式
 * @Author: whx
 * @Create: 2019-05-24 14:09
 **/
public class GuavaEvent {
	
	@Subscribe
	public void subscribe(String str) {
		System.out.println("执行subscribe方法，传入的参数是：" + str);
	}
	
}
