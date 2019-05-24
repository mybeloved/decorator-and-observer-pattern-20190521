package decoratorpattern.login.old;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 结果集
 * @Author: whx
 * @Create: 2019-05-21 12:29
 **/
public class ResultMsg {
	
	private int code;
	private String msg;
	private Object data;
	
	public ResultMsg(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}
