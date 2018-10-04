package Java8Examples;
import Interface.Interface1;
import Interface.Interface2;

/**
 * 
 * @author Afaq Ahmed Khan
 * @since Oct 4, 2018
 * 
 *
 */

public class Java8DefaultAndStaticMethodsInterfacesExample implements Interface1, Interface2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Java8DefaultAndStaticMethodsInterfacesExample ob = new Java8DefaultAndStaticMethodsInterfacesExample();
		ob.log("Afaq");

		Interface1 i1 = (s) -> System.out.println(s);

		i1.method1("Liverpool");
	}

	@Override
	public void log(String str) {
		System.out.println("Must be implemented");
		Interface2.super.log(str);
	}

	@Override
	public void method1(String str) {
		System.out.println("Must be implemented");
	}

}
