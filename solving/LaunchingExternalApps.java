package solving;

import java.io.IOException;

// Launch External Applications Through Java Program.
public class LaunchingExternalApps {

	public static void main(String[] args) throws InterruptedException {
		Runtime runtime = Runtime.getRuntime(); //getting Runtime object
		/*String[] s = new String[] {"C:\Program Files (x86)\Google\Chrome\Application\chrome.exe"
								, "https://javaconceptoftheday.com/"};*/  //크롬 브라우저에서 https://javaconceptoftheday.com/ 열기
		/*String[] s = new String[] {"C:\Program Files\VideoLAN\VLC\vlc.exe", "F:\sample.mp3"};
		Process process = runtime.exec(s);*/  //VLC Media Player에서 "sample.mp3"파일 열
		
		try {
			//runtime.exec("notepad.exe");	//opens new notepad(메모장) instance
			//runtime.exec("notepad I:\sample.txt");	//opens "sample.txt" in notepad
			
			Process process = runtime.exec("notepad.exe"); //메모장 열기
			Thread.sleep(5000);
			process.destroy(); //메모장을 5초 뒤에 종료
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-launch-external-applications-through-java-program/