package decoratorpattern.battercake;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 煎饼装饰类
 * @Author: whx
 * @Create: 2019-05-21 10:17
 **/
public class EggDecorator extends BattercakeDecorator {
	public EggDecorator(Battercake battercake) {
		super(battercake);
	}
	
	public void doSomething() {
	
	}
	
	@Override
	public String getMsg() {
		return super.getMsg() + " + 1个鸡蛋";
	}
	
	@Override
	public int getPrice() {
		return super.getPrice() + 1;
	}
}
