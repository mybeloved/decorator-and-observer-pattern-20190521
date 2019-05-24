package decoratorpattern.login.update;

import decoratorpattern.login.old.ISignInService;
import decoratorpattern.login.old.ResultMsg;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 服务实现类
 * @Author: whx
 * @Create: 2019-05-21 16:18
 **/
public class SignInForThirdService implements ISignInForThirdService {
	
	private ISignInService signinService;
	
	public SignInForThirdService(ISignInService signinService) {
		this.signinService = signinService;
	}
	
	public ResultMsg regist(String username, String password) {
		return signinService.regist(username, password);
	}
	
	public ResultMsg login(String username, String password) {
		return signinService.login(username, password);
	}
	
	public ResultMsg loginForQQ(String id) {
		return null;
	}
	
	public ResultMsg loginForWechat(String id) {
		return null;
	}
	
	public ResultMsg loginForToken(String token) {
		return null;
	}
	
	public ResultMsg loginForTelephone(String telephone, String code) {
		return null;
	}
	
	public ResultMsg loginForRegist(String username, String passport) {
		return null;
	}
}
