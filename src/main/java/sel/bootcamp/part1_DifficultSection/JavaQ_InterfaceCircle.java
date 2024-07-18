package sel.bootcamp.part1_DifficultSection;

public class JavaQ_InterfaceCircle implements JavaQ_InterfaceShape{
	    private double radius;

	    public JavaQ_InterfaceCircle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
}
