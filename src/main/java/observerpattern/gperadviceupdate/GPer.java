package observerpattern.gperadviceupdate;

import observerpattern.gperadvice.Question;

import java.util.Observable;

/**
 * @Program: decorator-and-observer-pattern-20190521
 * @Description: Gper社区
 * @Author: whx
 * @Create: 2019-05-22 10:13
 **/
public class GPer {
	
	private String name = "GPer生态圈";
	private static GPer gper = null;
	private Question question;
	
	private GPer() {
	}
	
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public static GPer getInstance() {
		if (null == gper) {
			gper = new GPer();
		}
		return gper;
	}
	
	public String getName() {
		return name;
	}
	
	public void publishQuestion(Question question) {
		System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
	}
}
