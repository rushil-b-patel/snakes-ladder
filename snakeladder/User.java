package snakeladder;

public class User{
    String name;
    int position;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPosition(){
        return position;
    }
    public User(String name, int position){
        this.name = name;
        this.position = position;
    }
}