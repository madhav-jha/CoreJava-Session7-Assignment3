package session7.assignment3;

public class ExceptionNullPointer {

	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("cannot find length of an empty string\n" + e);
		}

		System.out.println("Control flow continues...");
	}

}
