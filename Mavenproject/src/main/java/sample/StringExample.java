package sample;

public class StringExample {

	public static void main(String[] args) {
		
 String s= "hello";
 System.out.println(s);
 
 String r = new String("hi world");
 System.out.println(r);
 
//convert char to string
	
	char a[] = {'a','b','c'};
	
String e = new String(a);
System.out.println(e);

//cHARat -index position

	char q =s.charAt(2);
	System.out.println(q);
	
//find out the length : string
	
   System.out.println(s.length());

   //concat : combine two strings
   
   System.out.println(s.concat(r));
   
//contains : to findout the string

String w =" how are you?";

System.out.println(w.contains("what"));

System.out.println(s.contains(r));

String t = "java";
String y ="java";
String u ="Java";
String i ="selenium";
String k="JAVA";

//equals : checking whether it contains the word

System.out.println(t.equals(y));
System.out.println(t.equals(u));
System.out.println(u.equals(i));

//equals ignore case
System.out.println(y.equalsIgnoreCase(u));

//to uppercase

System.out.println(t.toUpperCase());
System.out.println(i.toUpperCase());
//lowercase

System.out.println(k.toLowerCase());
System.out.println(u.toLowerCase());

//isempty

String j = " ";
System.out.println(j.isEmpty());

//

String l= "Rincy";
String p="Rincy";
System.out.println(l==p);


String m = new String("Rincy");
System.out.println(l==m); // new object created

	}
	
}