//В класі Мейн, в мейн методі, створити об*Єкт Машина, запустити всі його методи.
package rudder;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("comfort", "mazda", new Rudder(4, 40), new Wheel(20, 50), new Body("Square", "Sedan"));

		car.changeSit();
		System.out.println("new brend:"+car.newBrend());
		System.out.println(car.rudderChange());
		System.out.println(car.toString());
	}

}
