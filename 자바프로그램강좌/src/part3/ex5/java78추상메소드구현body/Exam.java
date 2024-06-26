package part3.ex5.java78추상메소드구현body;

public abstract class Exam {
	int kor1;
	int eng1;
	int math1;
	
	
	// 오버로드 생성자가 있는 경우, 기본 생성자를 별도로 작성해야 함
	public Exam() {
		this(0,0,0);	//Exam(0,0,0)
	}
	
	// 오버로드 생성자 : 오보로드 생성자를 작성하면 기본생성자가 생성되지 않음
	public Exam(int kor, int eng, int math) {
		kor1 = kor;
		eng1 = eng;
		math1 = math;
	}
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
		
	
	public abstract int total();
	public abstract float avg();
	
	// 자식메소드에게만 공개
	protected int onTotal() {
		return kor1 + eng1 + math1;
	}
}
