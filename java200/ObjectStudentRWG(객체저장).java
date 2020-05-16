package java200;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/* 객체 직렬화, 제네릭을 이용하여 객체 저장하기 (/4) */
public class ObjectStudentRWG<T> { // 파라미터화된 타입인 ObjectStudentRWG를 선언.
									// 타입을 제한하는 제네릭<> 중에서 객체를 생성할 때 타입을 정할 수 있는 방법.
	public int write(String fname, Vector<T> v) throws IOException { // write() 메서드를 호출할 때 T타입이 결정됨.
																		// Vector는 아직 타입이 정해지지 않는 타입 T를 저장.
		int objectNumber = 0; // 저장하려는 객체의 개수 저장
		try {
			FileOutputStream fos = new FileOutputStream(fname); // 빨대. 생성자에 파일 이름을 대입.
			ObjectOutputStream oos = new ObjectOutputStream(fos); // throw //호스. 객체를 파일로 저장.
			objectNumber = v.size(); // 객체의 개수 저장.
			oos.writeInt(objectNumber); // 객체의 개수를 파일에 저장.
			System.out.println(objectNumber + "개의 Data가 입력됨");
			for (int i = 0; i < objectNumber; i++) { // Vector에 저장된 객체(Serializable을 구현한 객체)를 저장.
				oos.writeInt(i+1);
				oos.writeObject(" "+v.get(i));
				oos.flush();
				System.out.println(i+1 + "번째의 Data가 입력됨");
			}
			oos.close(); fos.close(); // 파일로 저장했다면 닫음
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다.");
		} catch (Exception ee) {
			throw new IOException("타입이 이상합니다." + ee);
		}
		return objectNumber;
	}

	public void read(String fname) throws IOException {
		try {
			FileInputStream fis = new FileInputStream(fname);	//빨대. 생성자에 파일 이름 대입.
			ObjectInputStream ois = new ObjectInputStream(fis); // throws	//호스. 저장된 객체 파일을 읽음.
			int objectNumber = ois.readInt();	//파일에 저장한 객체의 개수를 얻음.
			System.out.println(objectNumber + "개의 Data를 읽음");
			for (int i = 0; i < objectNumber; i++) {	//파일에 저장한 객체를 읽어서 출력.
				try {
					System.out.print(ois.readInt() + "번째");
					System.out.println(ois.readObject());
				} catch (ClassNotFoundException e1) {
					System.out.println("잘못된 타입입니다.");
				}
			}
			ois.close(); fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다.");
		}
	}
}