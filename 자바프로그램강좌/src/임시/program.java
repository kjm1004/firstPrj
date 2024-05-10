package 임시;

public class program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();	// 학생단위 참조변수 생성(stack), current=0, exams=null 변수 주소만 생성 ==> 학생들 배열
		list.exams = new Exam[3];		// list.exams ==> exam[3] ==> exam : 국,영,수
		list.current=0;
		
		/*
		 * ExamList list = new ExamList();		==>		ExamList (exams, current) 형식의 list 선언 (주소만 생성)
		 * list.exams = new Exam[3];			==>		생성된 list 객체 중 exams 배열에 대해 크기 선언. exams는 Exam[] 형식이므로 new Exam[3] 사용
		 * list.current=0;						==>		생성된 list 객체 중 current에 대해 값 등록
		 * */
		
		list.input();							// 매개변수명을 앞으로, 함수명은 뒤로 oldStyle: input(list);
		list.output();
		
	}

}
