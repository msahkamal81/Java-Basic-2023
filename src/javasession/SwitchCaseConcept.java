package javasession;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String name = "Tom";
				switch (name) {
		case "Harsh":
			System.out.println("100 marks");
			break;
			
		case "Ravi":
			System.out.println("90 marks");
	        break;
	        
		case "Naveen":
			System.out.println("80 marks");
			break;
			
		case "Vicky":
			System.out.println("70 marks");
			break;

		default:
			System.out.println("student is not found " + name);
			break;
		}
				
				int marks = 100;
				
				switch (marks){
				case 90: System.out.println("science");
					break;
					
				case 80:
					System.out.println("commerce");
					break;
					
				case 70:
					System.out.println("Arts");
					break;
					
				
					 

				default:
					System.out.println("Failed");
					break;
				}
				
				//
				
				char m = '1';
				switch (m) {
				case '1':
					System.out.println("pass");
					break;

				default:
					System.out.println("Fail");
					break;
				}
				
				//
				String browser = " Chr ome ";
				switch (browser.toLowerCase().trim().replace(" ", "")) {
				case "chrome":
					System.out.println("launch chrome");				
					break;
							
					
				case "FireFox":
					System.out.println("ff");				
					break;
					
				case "ie":
					System.out.println("ie");				
					break;
				case "safari":
					System.out.println("safari");				
					break;
					
 
				default:
					System.out.println("please pass the right browser " + browser);
					break;
				}
				
				//
				
				String emp = "Naveen";
				int salary = 0;
				
				switch (emp) {
				case "Naveen":
					salary = 20;				
				    break;
				    
				case "Karim":
					salary = 30;				
				    break;
				    
				case "Rahim":
					salary = 40;				
				    break;

				default:
					System.out.println("Employee is not found.....");
					break;
				}
				
				System.out.println("emp : " + emp + " having salary : " + salary);
				
				
	}   

}   
