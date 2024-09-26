package src;
public class DataTypeExamples {
	public static void main(String[] args) {
		int nt = 12;
		double d = 12.2234234;
		char c = 'a';
		boolean b = true;
		float f = 23.32f;
		long l = 1131345343453L;
		byte bt = 110;
		short s = 12345;
		System.out.println(nt + " type is " + ((Object) nt).getClass().getSimpleName());
		System.out.println(d + " type is " + ((Object) d).getClass().getSimpleName());
		System.out.println(c + " type is " + ((Object) c).getClass().getSimpleName());
		Boolean wrapbool = Boolean.valueOf(b);
		System.out.println(b + " type is " + wrapbool.getClass().getSimpleName());
		System.out.println(f + " type is  " + ((Object) f).getClass().getSimpleName());
		System.out.println(l + " type is " + ((Object) l).getClass().getSimpleName());
		System.out.println(bt + " type is " + ((Object) bt).getClass().getSimpleName());
		System.out.println(s + " type is " + ((Object) s).getClass().getSimpleName());
//		12 type is Integer
//		12.2234234 type is Double
//		a type is Character
//		true type is Boolean
//		23.32 type is  Float
//		1131345343453 type is Long
//		110 type is Byte
//		12345 type is Short
	}
}
