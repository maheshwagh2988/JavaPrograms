package String_Concept;

public class StringBasic1 {

	
	public static void main(String[] args) {
		String ta="A";
		ta=ta.concat("B");
		System.out.println(ta);
		String tb="C";
		ta=ta.concat(tb);
		System.out.println(ta);
		ta.replace('C', 'D');
		System.out.println(ta);
		ta=ta.concat(tb);
		System.out.println(ta);
		
		String str=" ";
		str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());
		

		String s="DURGA SOFT";
		int len=s.trim().length();
		System.out.println(len);
		
		
		String s1="Hello World";
		s1.trim();
		int i1=s1.indexOf(" ");
		System.out.println(i1);
		
		
		String s2="Java";
		String s3= new String("java");
		if(s2.equalsIgnoreCase(s3))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		
		
		StringBuilder sb=new StringBuilder("xyz");
		sb.capacity();
		System.out.println("Size is "+sb.capacity());
		//sb.append("Shasnank").capacity();
		//sb.capacity();
		//System.out.println("Size is after append :"+sb.capacity());
		String mr="xyz";
		
		if(sb.equals(mr))
		{
			System.out.println("Match 1");
		}
		
		else if(sb.toString().equals(mr.toString()))
		{
			System.out.println("Match 2");
			System.out.println("StringBuilder sb="+sb);
			System.out.println("sb="+sb.toString());
			System.out.println("mr="+mr.toString());
		}
		else
		{
			System.out.println("No Match");
		}
		System.out.println("StringBuilder capicity sb="+sb);
		
		
		
		
		StringBuilder sb1= new StringBuilder("Durga");
		String str1=sb1.toString();
		String str2=str1;
		System.out.println(""+str1==str2);
	}

}
