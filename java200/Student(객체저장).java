package java200;

import java.io.Serializable;

/* 객체 직렬화, 제네릭을 이용하여 객체 저장하기 (/4) */
public class Student implements Cloneable, Serializable {	//객체 직렬화(Serializable), 깊은 복사(Cloneable)
	private static final long serialVersionUID = 12234214234L;
	private String name;
	private int age;
	private String addr;
	
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public String getAddr() { return addr; }
	public int getAge() { return age; }
	public String getName() { return name; }
	public void setAddr(String string) { addr = string; }
	public void setAge(int i) { age = i; }
	public void setName(String string) { name = string; }
	
	public String toString() {
		return name+" "+age+" "+addr;
	}
	
	public Object clone() {
		try {
			return super.clone();	//Object의 protected Object clone() 메서드로 JVM을 이용하여 멤버필드의 값은 같지만 새로운 객체를 만듦.
									//기본 타입과 String 타입인 멤버필드만 대상으로 깊은 복사.
		} catch(CloneNotSupportedException e) {	//복사 실패
			return this;
		}
	}
	
	public boolean equals(Object obj) {	//멤버필드의 값을 일대일로 비교했을 때 모두 같으면 같은 객체로 만들기 위해서 equals() 오버라이딩.
		boolean isE = false;
		Student temp = (Student)obj;
		if(temp.getName().equals(name) && temp.getAge()==age && temp.getAddr().equals(addr)) {
			isE = true;
		}
		return isE;
	}
	
	public int hashCode() {
		int temp = 0;
		temp = name.hashCode() + addr.hashCode() + age + 37;
		return temp;
	}
}
