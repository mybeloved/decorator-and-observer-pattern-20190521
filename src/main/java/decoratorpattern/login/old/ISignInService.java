package decoratorpattern.login.old;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 服务接口
 * @Author: whx
 * @Create: 2019-05-21 12:29
 **/
public interface ISignInService {
	
	/**
	 * 注册方法
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	ResultMsg regist(String username, String password);
	
	/**
	 * 登录方法
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	ResultMsg login(String username, String password);
}
