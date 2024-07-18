package sel.bootcamp.part1_DifficultSection;

public class JavaQ_Rectangle implements JavaQ_InterfaceShape{
	    private double length;
	    private double width;

	    public JavaQ_Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double calculateArea() {
	        return length * width;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return 2 * (length + width);
	    }
}
