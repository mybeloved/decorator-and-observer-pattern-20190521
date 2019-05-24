import decoratorpattern.login.old.SignInService;
import decoratorpattern.login.update.ISignInForThirdService;
import decoratorpattern.login.update.SignInForThirdService;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 服务实现类
 * @Author: whx
 * @Create: 2019-05-21 16:32
 **/
public class DecoratorTest {
	
	public static void main(String[] args) {
		
		//满足一个is-a
		ISignInForThirdService signInForThirdService = new SignInForThirdService(new SignInService());
		signInForThirdService.loginForQQ("49437822");
		
	}
	
	
}
