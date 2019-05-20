package ocp.lsp.solution;

import ocp.lsp.solution.Rectangle;
import ocp.lsp.solution.Square;

public class TestPolygon {

	public static void main(String[] args) {
		shouldNotChangeHeightIfWidthChanges(new Rectangle(50, 10));
	}

	public static void shouldNotChangeHeightIfWidthChanges(Rectangle rectangle) {
		int before = rectangle.getHeight();
		rectangle.setWidth(100);
		int after = rectangle.getHeight();
		System.out.println(before);
		System.out.println(after);
		if (before == after) {
			System.out.println("passed");
		} else {
			System.out.println("Failed");
		}
	}

}
