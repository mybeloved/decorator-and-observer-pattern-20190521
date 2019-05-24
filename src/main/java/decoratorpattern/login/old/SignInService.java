package decoratorpattern.login.old;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 服务实现类
 * @Author: whx
 * @Create: 2019-05-21 12:29
 **/
public class SignInService implements ISignInService {
	
	/**
	 * 注册方法
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	public ResultMsg regist(String username, String password) {
		return new ResultMsg(200, "注册成功", new Member());
	}
	
	/**
	 * 登录方法
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	public ResultMsg login(String username, String password) {
		return null;
	}
}
