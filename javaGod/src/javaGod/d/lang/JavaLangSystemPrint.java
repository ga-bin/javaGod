package javaGod.d.lang;

public class JavaLangSystemPrint {

	public static void main(String[] args) {
		JavaLangSystemPrint sample = new JavaLangSystemPrint();
		sample.printStreamCheck();
		sample.printNull();
		sample.printNullToString();
	}

	
	private void printStreamCheck() {
		byte b = 127;
		short s = 32767;
		System.out.println(b);
		System.out.println(s);
		printInt(b);
		printInt(s);
	}

	private void printInt(int value) {
		System.out.println(value);
	}

	
	public void printNull() {
		Object obj = null;
		System.out.println(obj);
		System.out.println(obj + " is object's value");
	}
	
	private void printNullToString() {
		Object obj = null;
		System.out.println(obj.toString());
	}
	
}
