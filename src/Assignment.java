import java.util.Date;

public class Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task noArgTask = new Task();
		Task singleArgTask = new Task("Single Argument Task", new Date(), true, true);
		
		System.out.println(noArgTask);
		System.out.println(singleArgTask);
	}
	
	public static String getElement(String[] values, int index) {
		if (index >= values.length)
			return null;
		
		return values[index];
	}
}
class Task {
	String name;
	Date date;
	boolean completed;
	boolean recurring;
	
	public Task(String name, Date date, boolean completed, boolean recurring) {
		this.name = name;
		this.date = date;
		this.completed = completed;
		this.recurring = recurring;
	}
	
	public Task() {
		this.name = "No Argument Task";
		this.date = new Date();
		this.completed = false;
		this.recurring = false;
	}
	
	public String toString() {
		return "Task, " + this.name + ", was " + ((completed) ? "" : "not ") + "completed on " + date.toString();
	}
	
}