
public class Apple {
String color;
	
	Apple(String color)
	{
		this.color=color;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple greenApple = new Apple("green");
		String color = greenApple.getColor();
		System.out.println("color of apple is " + color);
	}
	private String getColor() {
		// TODO Auto-generated method stub
		return null;
	}
} 



