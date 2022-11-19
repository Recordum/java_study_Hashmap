import java.util.*;

class HashMapEx {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	HashMap<String, Student> login = new HashMap<String, Student>();
	
	while (true)
	{
		
		System.out.println("이름, ID(학번), PW(문자) 를 빈칸으로 나누어 입력하시오");
		
		String name = scanner.next();
		if(name == "종료")
			{break;}
		int id = scanner.nextInt();
		String pw = scanner.next();
		login.put(name, new Student(id, pw));
		
		
	}
	
	
}
}
