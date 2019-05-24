package decoratorpattern.battercake;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 煎饼装饰类
 * @Author: whx
 * @Create: 2019-05-21 10:14
 **/
public abstract class BattercakeDecorator extends Battercake {
	
	//静态代理，委派
	private Battercake battercake;
	
	BattercakeDecorator(Battercake battercake) {
		this.battercake = battercake;
	}
	
	public abstract void doSomething();
	
	@Override
	public String getMsg() {
		return this.battercake.getMsg();
	}
	
	@Override
	public int getPrice() {
		return this.battercake.getPrice();
	}
}
