package constructor;

public class Primitive_to_Wrappper {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=null; Error
		String s=null;
//		Long l=null;
//		boolean b=null; CE
		Integer i=null;
		int a=5;
		Long l=(long)a;
		System.out.println("String s : "+s);
		System.out.println("value of Long is : "+l);
		System.out.println("Value of Integer is : "+ i);

	}

}
