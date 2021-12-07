Output:
String
Rajii
78723675
RajiiMehra
-625437084
RajiiMehraGowsy
-1107914959

StringBuffer
Rajii
110718392
RajiiMehra
110718392
RajiiMehraGowsy
110718392
StringBuffer Methods
Insert Method Rajii
Replace Method Rajee
Reverse Method eejaR
---------------
public class Practice {

	public static void main(String[] args) {

		Practice obj = new Practice();
		String s1[] = { "Rajii", "Mehra", "Gowsy" };
		
		System.out.println("String");
		obj.combine(s1);		
		System.out.println();
		
		System.out.println("StringBuffer");
		obj.combine1(s1);	
		
		System.out.println("StringBuffer Methods");
		obj.sbMethod();

	}

	public void combine(String s[]) {
		String s2 = "";

		for (int i = 0; i < s.length; i++) 
		{
			s2 = s2 + s[i];
			System.out.println(s2);
			System.out.println(s2.hashCode());
		}
	
	}
	
	public void combine1(String s[]) {
		StringBuffer sb = new StringBuffer("");

		for(String name:s) 
		{
			sb.append(name);
			System.out.println(sb);
			System.out.println(sb.hashCode());
		}
	}
	
	public void sbMethod()
	{
		StringBuffer sb = new StringBuffer("Raji");
		
		System.out.println("Insert Method " + (sb.insert(3, 'i')));
		System.out.println("Replace Method " + (sb.replace(3,5,"ee")));
		System.out.println("Reverse Method " + sb.reverse());
	}
}