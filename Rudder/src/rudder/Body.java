package rudder;

//kuzov
public class Body {

	private String form;
	private String type;

	public Body(String form, String type) {
		this.form = form;
		this.type = type;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Body [form=" + form + ", type=" + type + "]";
	}

	public String updatedForm() {
		return form + "updated";
	}
}
