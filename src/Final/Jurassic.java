package Final;

import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

/**
 * 
 * 如果说整个类都是final（在它的定义前冠以final 关键字），
 * 就表明自己不希望从这个类继承，或者不允 许其他任何人采取这种操作
 */
/**
 * 
 * @author 程志康
 *
 */
public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 30;
		System.out.println(++n.j);
		
		Vector<String> v =new Vector<>();
		v.addElement("china");
		
		Hashtable h = new Hashtable();
		h.isEmpty();
		
	}
}

class SmallBrain {
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {
	}
}