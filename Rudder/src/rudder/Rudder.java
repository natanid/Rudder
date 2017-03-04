//�������� ���� �����, ������, ����� - ������� ��� ����� (���� �������, �����������,
//������� � �������, �� �����). �� ���� ������ ���� ����������. 
//������ ������ �� � ���������� ���� ������� � ������, ����� ���������� ����� ������ � ������� ����, ��
//�������� ������ ����� � ���� ������. 

package rudder;
//kermo
public class Rudder {

	private int size;
	private int width;
	
	public Rudder(int size, int width) {
		this.size = size;
		this.width = width;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rudder [size=" + size + ", width=" + width + "]";
	}
	
	public int grownSize() {
		return size*2;
	}
	
}
