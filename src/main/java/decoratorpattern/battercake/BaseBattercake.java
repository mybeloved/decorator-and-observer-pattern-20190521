package decoratorpattern.battercake;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 基础煎饼
 * @Author: whx
 * @Create: 2019-05-21 10:12
 **/
public class BaseBattercake extends Battercake {
	public String getMsg() {
		return "煎饼";
	}
	
	public int getPrice() {
		return 5;
	}
}
