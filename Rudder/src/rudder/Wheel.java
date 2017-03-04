package rudder;

//koleso
public class Wheel {

	private int radius;
	private int length;

	public Wheel(int radius, int length) {
		this.radius = radius;
		this.length = length;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", length=" + length + "]";
	}

	public int longerRadius() {
		return radius+radius;
	}
}
