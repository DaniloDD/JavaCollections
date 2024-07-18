package sel.bootcamp.part1_DifficultSection;


public class JavaQ_InterfaceMain {
	public static void main(String[] args) {
		JavaQ_InterfaceShape circle = new JavaQ_InterfaceCircle(5.0);
		JavaQ_InterfaceShape rectangle = new JavaQ_Rectangle(4.0, 3.0);

		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
	}

}
