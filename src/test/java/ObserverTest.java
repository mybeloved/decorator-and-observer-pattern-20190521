import observerpattern.gperadvice.GPer;
import observerpattern.gperadvice.Question;
import observerpattern.gperadvice.Teacher;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: 观察者模式测试类
 * @Author: whx
 * @Create: 2019-05-22 10:57
 **/
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");


        //小明没有@Tom老师
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        gper.addObserver(tom);
        gper.addObserver(mic);
        gper.publishQuestion(question);


    }

}
