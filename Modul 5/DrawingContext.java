import java.util.Vector;
import java.util.Enumeration;

public class DrawingContext {
	private DrawingContext DrawingContext;
	private Vector assignments;
	DrawingContext() {
		assignments=new Vector();
	}
	public point setPoint() {
		return point;
	}
	public void clearScreen(point s) {
		point = s;
	}
	public void getVerticalSiza(DrawingContext a) {
		DrawingContext.addElement(a);
	}
	public Enumeration getHorizontalSize() {
		return DrawingContext.elements();
	}
}
