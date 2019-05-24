import observerpattern.events.mouseevent.Mouse;
import observerpattern.events.mouseevent.MouseEventCallback;
import observerpattern.events.mouseevent.MouseEventType;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 观察者模式测试类
 * @Author: whx
 * @Create: 2019-05-22 10:57
 **/
public class MouseEventTest {
	public static void main(String[] args) {
		
		MouseEventCallback callback = new MouseEventCallback();
		
		Mouse mouse = new Mouse();
		
		//@谁？  @回调方法
		mouse.addLisenter(MouseEventType.ON_CLICK, callback);
		mouse.addLisenter(MouseEventType.ON_FOCUS, callback);
		
		mouse.click();
		
		mouse.focus();
		
		
	}
}
