package observerpattern.gperadviceupdate;

import com.google.common.eventbus.Subscribe;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: guava升级版GPer社区提问通知
 * @Author: whx
 * @Create: 2019-05-24 14:28
 **/
public class Teacher {
	private String name;
	
	public Teacher(String name) {
		this.name = name;
	}
	
	@Subscribe
	public void update(Object object) {
		GPer gper = (GPer) object;
		System.out.println("===============================");
		System.out.println(name + "老师，你好！\n" +
				"您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
				gper.getQuestion().getContent() + "\n" +
				"提问者：" + gper.getQuestion().getUserName());
	}
}
