package swea.D2;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Scanner;

// 1928. Base64 Decoder
public class SWEA1928 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		String str;
		for(int test_case = 1; test_case <= T; test_case++) {
			str = sc.nextLine();
			System.out.println("#"+test_case +" "+ getDecoder(str));
		}
	}
	public static String getDecoder(String str) {
		byte[] decoded = null;
		Decoder decoder = null;
		try {
			decoded = str.getBytes();
			decoder = Base64.getDecoder();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		return new String(decoder.decode(decoded));
	}

}
