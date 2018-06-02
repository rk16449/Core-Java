class A{
	
}
class A2{
	
}
interface B{
	
}
interface C{
	
}


// A must be specified first, one class then multiple interfaces is allowed
public class MultipleBounds <T extends A & B & C> {

}


// public class MultipleBounds <T extends B & C & A> {} // compiler error, A after interfaces