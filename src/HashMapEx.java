
import java.util.*;


class HashMapEx {
	
	
	public static void main(String[] args) {

	
	Scanner scanner = new Scanner(System.in);
	HashMap<String, Student> login = new HashMap<String, Student>();
	String name;
	String test;

	while (true)
	{
		
		System.out.println("이름, ID(학번), PW(문자) 를 입력하세요");
		
		name = scanner.next();
		if(name.equals("종료")) {
			break;}
		else {
		int id = scanner.nextInt();
		String pw = scanner.next();
		login.put(name, new Student(id, pw));
		System.out.println("다음과 같이 학생정보가 등록되었습니다");
		System.out.println("이름 : " +name);
		System.out.println("학번 : " +login.get(name).getId());
		System.out.println("비밀번호 : " +login.get(name).getPassword());
		}
		
	}
	
	while(true) {
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		String nameTest = "오민규";
		
		if(name.equals("종료")) 
		{
			break;
		}
		
		if(login.get(name)== null) // login.get(name) name(key)에 value를 stack메모리에 리턴하기 때문에 null과 레퍼
		{
			System.out.println("등록되지 않은 학생입니다 이름을 다시 입력해주세요");
			
			
		}
		else {
					
			System.out.println("학번 : " +login.get(name).getId());
			System.out.println("비밀번호 : " +login.get(name).getPassword());
			}
		}	
}
}