package decoratorpattern.login.update;

import decoratorpattern.login.old.ISignInService;
import decoratorpattern.login.old.ResultMsg;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 服务实现类
 * @Author: whx
 * @Create: 2019-05-21 16:08
 **/
public interface ISignInForThirdService extends ISignInService {
	
	/**
	 * QQ登录
	 *
	 * @param id
	 * @return
	 */
	ResultMsg loginForQQ(String id);
	
	/**
	 * 微信登录
	 *
	 * @param id
	 * @return
	 */
	ResultMsg loginForWechat(String id);
	
	/**
	 * 记住登录状态后自动登录
	 *
	 * @param token
	 * @return
	 */
	ResultMsg loginForToken(String token);
	
	/**
	 * 手机号登录
	 *
	 * @param telephone
	 * @param code
	 * @return
	 */
	ResultMsg loginForTelephone(String telephone, String code);
	
	/**
	 * 注册后自动登录
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	ResultMsg loginForRegist(String username, String password);
}
