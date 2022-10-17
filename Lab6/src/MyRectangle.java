// INFSCI0017 Lab 6 - Created by Dr. John Ramirez
// Fill in the indicated code sections to complete this class.  Then test it
// by compiling and executing Lab6.java.
public class MyRectangle {
	// Declare instance variables here.  See toString() method below for names.
	private int width;
	private int height;
	private int startX;
	private int startY;

		public MyRectangle()
		{
			// Default constructor -- initialize all instance variables
			// to 0
			this.width=0;
			this.height=0;
			this.startX=0;
			this.startY=0;
		}

		public MyRectangle(int x, int y, int w, int h)
		{
			// Initialize instance variables based on parameters shown.
			this.startX=x;
			this.startY=y;
			this.width=w;
			this.height=h;		
		}

		public int area()
		{
			// Return the area of this Rectangle
			int a;
			a=this.width*this.height;
			return a;
		}

		// I have written this method for you.  Note how a StringBuilder is
		// utilized, since (as we discussed in lecture) it can be modified
		// without having to create a new object each time (unlike a String).
		public String toString()
		{
			StringBuilder S = new StringBuilder();
			S.append("Width: " + width);
			S.append(" Height: " + height);
			S.append(" X: " + startX);
			S.append(" Y: " + startY);
			return S.toString();
		}

		public boolean isInside(int x, int y)
		{
			//test if (x,y) is inside MyRectangle
			boolean i;
			if((x>=this.startX && x<=this.startX+this.width) && (y>=this.startY && y<=this.startY+this.height)) {
				i = true;
			}else {
				i = false;
			}
			return i;
		}

		public void setSize(int w, int h)
		{
			// Update width and height as shown
			this.width=w;
			this.height=h;
		}

		public void setPosition(int x, int y)
		{
			// Update startX and startY as shown
			this.startX=x;
			this.startY=y;
		}

}
