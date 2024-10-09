package in.sbp.collections.entities;

import java.util.Objects;

public class Exam {
	private int questionNo;
	private String question;
	private int marks;

	public Exam() {}

	public Exam(int questionNo, String question, int marks) {
		this.questionNo = questionNo;
		this.question = question;
		this.marks = marks;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(questionNo, question, marks);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Exam temp = (Exam)obj;
		return (temp.questionNo==this.questionNo 
				&& temp.question.equals(this.question) 
				&& temp.marks==this.marks);
	}

	@Override
	public String toString() {
		return "Exam [questionNo=" + questionNo + ", question=" + question + ", marks=" + marks + "]";
	}

}
