// Access levels:
// 	Modifier    | Class | Package | Subclass |  World 
// ----------------------------------------------------
//  public      |   Y   |    Y    |    Y     |    Y      --> Can be accessed, even if it's different package.
//  protected   |   Y   |    Y    |    Y     |    N      --> Can be accessed, even if it's different package, but only if it's its subclass.
//  no modifier |   Y   |    Y    |    N     |    N      --> Cannot be accessed here, because it's different package. 
//  private     |   Y   |    N    |    N     |    N      --> Cannot be accessed, even if it's in the same package.

package package1;
import package2.*;

public class A {

	public static void main(String[] args) {
		C c = new C();
		//System.out.println(c.defaultMessage); --> This cannot be accessed here, because it's different package. It would be accessible from Asub class.
		System.out.println(c.publicMessage);
		
		B b = new B();
		// System.out.println(b.privateMessage); --> This cannot be accessed.
	}
}
