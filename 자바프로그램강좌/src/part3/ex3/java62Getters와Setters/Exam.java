package part3.ex3.java62Getters와Setters;

public class Exam {
	int kor1;
	int eng1;
	int math1;
	
	public int getKor() {
		return kor1;
	}
	public int getEng() {
		return eng1;
	}
	public int getMath() {
		return math1;
	}
	
	public void setKor(int kor) {
		this.kor1 = kor;
	}
	public void setEng(int eng) {
		this.eng1 = eng;
	}
	public void setMath(int math) {
		this.math1 = math;
	}
	public int total() {
		return kor1 + eng1 + math1;
	}
	public float avg() {
		return this.total()/3.0f;
	}
}
