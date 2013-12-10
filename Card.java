//Card class - R. T.

public class Card {
	private int id, value;
	private String name, text;
	
	//Main constructor
	Card(int id, String name, int value, String text){
		this.id = id;
		this.name = name;
		this.value = value;
		this.text = text;
	}
	
	//Getters for the class
	public int getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getValue(){
		return value;
	}
	
	public String getText(){
		return text;
	}
	
    public static void main(String[] args) {

    }
}
