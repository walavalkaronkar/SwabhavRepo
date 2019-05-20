package ocp.lsp.violation;

public class Square extends Rectangle{

	Square(int side) {
		super(side,side );
	}
	
	@Override
	public void setWidth(int side) {
		super.width = side;
		super.height=side;
	}
	
	@Override
	public void setHeight(int side) {
		super.width = side;
		super.height=side;
	}
	
	

}
