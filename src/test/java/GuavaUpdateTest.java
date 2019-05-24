import com.google.common.eventbus.EventBus;
import observerpattern.gperadvice.Question;
import observerpattern.gperadviceupdate.GPer;
import observerpattern.gperadviceupdate.Teacher;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: guava升级版GPer社区提问通知测试类
 * @Author: whx
 * @Create: 2019-05-24 14:10
 **/
public class GuavaUpdateTest {
	
	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		GPer gper = GPer.getInstance();
		gper.setQuestion(new Question("小明", "观察者设计模式适用于哪些场景？"));
		Teacher teacher = new Teacher("Tom");
		eventBus.register(teacher);
		eventBus.post(gper);
	}
}
