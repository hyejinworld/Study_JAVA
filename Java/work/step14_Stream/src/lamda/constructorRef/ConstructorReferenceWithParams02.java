package lamda.constructorRef; 
import java.util.function.Function;
import java.util.function.Supplier; 
 
class User { 
    String name; 
    
    public User() {
    	System.out.println();
    }
    public User(String name) { 
        this.name = name; 
    } 
     
    public void printName() { 
        System.out.println("User 이름: " + name); 
    } 
} 
 //////////////////////////////////////////////////
public class ConstructorReferenceWithParams02 { 
    public static void main(String[] args) { 
    
    	//기존방식
    	Function<String, User> beforeUser = new Function<String, User>() {
			@Override
			public User apply(String name) {
				return new User(name);
			}
		};
		
		//1. 람다식으로 변경해보자
		Function<String, User> lambdaUser = name -> new User(name);
		
		//2. 생성자 참조로 변경해보자
		Function<String, User> methodRefUser = User :: new;
    	
		
		
        //3. 호출해보자  
		
		System.out.println(beforeUser.apply("훈훈"));
		System.out.println(lambdaUser.apply("훈제"));
		System.out.println(methodRefUser.apply("막맏"));
		
		User user1 = beforeUser.apply("푸바오");
		User user2 = lambdaUser.apply("루이바오");
		User user3 = methodRefUser.apply("후이바오");
       
		user1.printName();
		user2.printName();
		user3.printName();
//		user1.printName();
		
		Supplier<User> s = User :: new;
		s.get();
		
    } 
}