package java200;

import java.io.IOException;

/* 객체 직렬화, 제네릭을 이용하여 객체 저장하기 (/4) */
public class ObjectStudentReadMain {
	public static void main(String[] args) {
		ObjectStudentRWG<Student> osw = new ObjectStudentRWG<Student>();
		try {
			osw.read("stu.obj");	//읽어올 파일
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
