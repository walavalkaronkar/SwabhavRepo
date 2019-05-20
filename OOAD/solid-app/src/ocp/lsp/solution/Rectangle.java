package ocp.lsp.solution;

public class Rectangle implements Polygon {

	private int height;
	private int width;
	Rectangle(int width,int height)
	{
		this.height=height;
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public int calculteArea() {
		int area=width*height;
		return area;
	}
	
}
