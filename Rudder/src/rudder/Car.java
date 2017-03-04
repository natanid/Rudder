//+Створити клас Машина який матиме декі свої поля
//+та об*єкти класу Кермо, Колесо, Кузов - як поля класу. 
//додати методи які б змінювали стан  полів класу, для виконання певних функцій,
//+описати даний клас (констрyктор, геттери ісеттери, ту стрінг). 
//+Всі поля повинні бути параметрами в конструкторі. 

package rudder;

public class Car {

	private String sit;
	private String brend;
	private Rudder rudder;
	private Wheel wheel;
	private Body body;
	
	public Car(String sit, String brend, Rudder rudder, Wheel wheel, Body body) {
		this.sit = sit;
		this.brend = brend;
		this.rudder = rudder;
		this.wheel = wheel;
		this.body = body;
	}
	public String getSit() {
		return sit;
	}
	public void setSit(String sit) {
		this.sit = sit;
	}
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	public Rudder getRudder() {
		return rudder;
	}
	public void setRudder(Rudder rudder) {
		this.rudder = rudder;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Car [sit=" + sit + ", brend=" + brend + ", rudder=" + rudder + ", wheel=" + wheel + ", body=" + body
				+ ", getSit()=" + getSit() + ", getBrend()=" + getBrend() + ", getRudder()=" + getRudder()
				+ ", getWheel()=" + getWheel() + ", getBody()=" + getBody() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void changeSit(){
		System.out.println("Sit is changed");
	}
	
	public String newBrend(){
		return brend = brend + " brend is updated";
	} 
	
	public Rudder rudderChange() {
		return new Rudder(5, 50);
		
	}
}
