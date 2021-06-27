
public class NativeEg {
	public static native void printText();

	static {
		System.loadLibrary("cClass");
	}

	public static void main(String args[]) {
		new NativeEg().printText();
	}
}
