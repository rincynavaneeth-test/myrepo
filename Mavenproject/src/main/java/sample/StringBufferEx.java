package sample;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1= new StringBuffer("hello");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("hi");
		System.out.println(s2);
		
	//append
		s1.append("world");
		System.out.println(s1);
		
    //insert
	   s1.insert(5, "my");
		System.out.println(s1);
   //replace
		 s1.replace(5, 7, "new");
			System.out.println(s1);
  //reverse
	s1.reverse();
	System.out.println(s1);
	
	//delete
	s1.delete(1, 3);
	System.out.println(s1);
	
		
	}

}
