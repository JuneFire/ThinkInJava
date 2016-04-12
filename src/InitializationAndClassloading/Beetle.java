package InitializationAndClassloading;

class Insect {
	int i = 9;
	int j;

	Insect() {
		prt("i = " + i + ", j = " + j);
		j = 39;
	}

	static int x1 = prt("static Insect.x1 initialized");

	static int prt(String s) {
		System.out.println(s);
		return 47;
	}
}
/**
 * static初始化
 * 衍生类的初始化可能要依赖于对基础类成员的正确初始化
 */
public class Beetle extends Insect {
	int k = prt("Beetle.k initialized");

	Beetle() {
		prt("k = " + k);
		prt("j = " + j);
	}

	static int x2 = prt("static Beetle.x2 initialized");

	static int prt(String s) {
		System.out.println(s);
		return 63;
	}

	public static void main(String[] args) {
		prt("Beetle constructor");
		Beetle b = new Beetle();
	}
}
