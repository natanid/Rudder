//Створити клас Кермо, Колесо, Кузов - описати дані класи (поля приватні, конструктор,
//геттери і сеттери, ту стрінг). Всі поля повинні бути приватними. 
//Додати методи які б виконували певні функції з полями, тобто збільшували розмір колеса у декілька разів, чи
//змінювали діаметр керма і тому подібне. 

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
