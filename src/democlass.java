
public class democlass {

	
	public static void main(String[] args) {
		 child c=new child();
		 c.show();
	}
}

class parent
{
	
 public void show()
 {
	 
	 System.out.println("parents class");
 }
}
class child extends parent
{
public void show()
{
	
System.out.println("child class");
}

}
