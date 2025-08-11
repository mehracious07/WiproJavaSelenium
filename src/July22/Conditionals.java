package July22;

public class Conditionals {
 
	//if-else
	public static void main(String[] args) {
		int age=18;
		if(age>=18) {
			System.out.println("You can drive");
		}else {
			System.out.println("You can drive");
		}
		
		//if - else if- else
		if(age>16 && age <=18) {
			System.out.println("You are in high School");
		}else if(age>18 && age <=20) {
			System.out.println("You are in intermediate School");
		}else {
			System.out.println("You are in college");
		}
		
		
		//switch 
		int num =5;
		  switch(num) {
          case 1:
              System.out.println("You entered: One");
              break;
          case 2:
              System.out.println("You entered: Two");
              break;
          case 3:
              System.out.println("You entered: Three");
              break;
          case 4:
              System.out.println("You entered: Four");
              break;
          case 5:
              System.out.println("You entered: Five");
              break;
          default:
              System.out.println(num);
      }

	}
	
}
