package ocp.lsp.solution;

public class Square implements Polygon{

	private int side;
	Square(int side)
	{
		this.side=side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	@Override
	public int calculteArea() {
		int area=side*side;
		return area;
	}
	
}
