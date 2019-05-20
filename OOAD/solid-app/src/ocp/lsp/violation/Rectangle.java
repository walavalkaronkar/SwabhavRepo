package ocp.lsp.violation;

public class Rectangle {

	protected int width;
	protected int height;
	
	Rectangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateArea()
	{
		int area;
		area=height*width;
		return area;
	}
}
