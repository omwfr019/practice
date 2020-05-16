package java200;

import java.io.IOException;
import java.util.Vector;

/* 객체 직렬화, 제네릭을 이용하여 객체 저장하기 (/4) */
public class ObjectStudentWriteMain {
	public static void main(String[] args) {
		ObjectStudentRWG<Student> osw = new ObjectStudentRWG<>();	//파라미터화된 타입 T에 Student를 넣음.
																	//제네릭 <Student>는 객체 타입을 Student로 제한.
		Vector<Student> v = new Vector<>();	//여러 Student를 저장하기 위해 리스트(Vector)를 생성.
		v.add(new Student("학생A", 17, "서울"));
		v.add(new Student("학생B", 15, "부산"));
		v.add(new Student("학생C", 20, "경기"));
		v.add(new Student("학생D", 18, "강원"));
		try {
			osw.write("stu.obj", v);	// 저장할 파일
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}