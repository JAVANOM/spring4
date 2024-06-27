package sp4.sp4_chap02.chap02;

public class Greeter {
    
	private String format;
	
	public String greet(String guest) {
		return String.format(format, guest);
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
}
