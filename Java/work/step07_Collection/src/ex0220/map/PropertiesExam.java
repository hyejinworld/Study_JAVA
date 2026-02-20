package ex0220.map;

import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExam {
	Properties pro = new Properties(); //자료구조에 담아놓는다. 
	public PropertiesExam() {
		
		pro.setProperty("id", "jang");
		pro.setProperty("age", "10");
		
		//모든 key 정보 가져오기
		for(String key: pro.stringPropertyNames()) {
			
			String value = pro.getProperty(key);
		
			System.out.println(key + "=" +value );
		}
//		pro.stringPropertyNames()
	//	pro.getProperty(null);
	} //생성자 끝
	
	/////////////////////////////////////////////
	//외부의 ~.properties 파일 로딩하는 방법
	
	// 1 )IO를 이용한 방법
	public void test01() throws Exception {

		 pro.clear(); // 초기화 
		 
		 
		// pro.load(new FileInputStream("src/ex0220/map/info.properties"));
		 
		 //2. 클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
		 //PropertiesExam.class 클래스가 있는 위치가 기준이 된다. 
//		    InputStream inputStream =
//		     PropertiesExam.class.getResourceAsStream("info.properties"); //src에서는 클래스 파일이 없어서 
//		     pro.load(inputStream);
		
			 //3.클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
			 //InputStream inpupStream = 
			//this.getClass().getResourceAsStream("dbInfo.properties"); 
			// pro.load(inpupStream);
			  
		
			 //4.ClassLoader의 모든 경로에서 파일 읽음. 보통 resources 폴더의 파일 읽을때 사용.
			InputStream inpupStream = 
			this.getClass().getClassLoader().getResourceAsStream("a.properties"); 
			//this.getClass().getClassLoader().getResourceAsStream("ex0220/map/info.properties"); 
			 pro.load(inpupStream);
			 
			 //5. ClassLoader의 Class내에 파일존재하는 경우
			/*InputStream inpupStream =
		this.getClass().getClassLoader().getResourceAsStream("ex0726/list/b.properties"); // 경로에 '/' 붙지않음. ClassLoader의 모든 경로에서 파일 읽음.
			 pro.load(inpupStream);*/
		 
		 for(String key : pro.stringPropertyNames()) {
			 String value = pro.getProperty(key);
			 System.out.println(key + "= "+ value);
		 }
		
	}
	//2) ResourceBundle을 이용한 방법

	public void test02() {
		
		System.out.println("------------------test02----------------");
		ResourceBundle rb = ResourceBundle.getBundle("a"); //classes폴더 기준으로 a.properties
		for(String key : rb.keySet()){
			String value = rb.getString(key);
			System.out.println(key + value);
		}
	}
	
	public static void main(String[] args) throws Exception {
		PropertiesExam pe = new PropertiesExam();
		//pe.test01();
			pe.test02();
		
		System.out.println("--------------------------------");
		
	}

}
