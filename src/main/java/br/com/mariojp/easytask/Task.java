package br.com.mariojp.easytask;

public class Task {

	private String name;
	private Boolean isComplete;
	
	public Task(String name) {
		this.name = name;
		this.isComplete = false;
	}
	
	public String getName() {
		return name;
	}

	public Boolean getIsComplete() {
		return isComplete;
	}

	public void complete() {
		this.isComplete = true;
	}
	
	@Override
	public String toString() {
		return "Task{" + "Name = '" + name + '\'' + ", isComplete = " + isComplete + '}';
	}
	
}
