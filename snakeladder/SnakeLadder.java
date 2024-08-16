package snakeladder;

import java.util.*;

public class SnakeLadder{
    public Board board;
    List<User> users = new ArrayList<>();
    List<User> winners = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
    }
    public SnakeLadder(Board board, List<User> users){
        this.board = board;
        this.users = users;
    }
    public int rollDice(){
        return (int)(Math.random() * 6) + 1;
    }
    public void simulate(){
        int current = -1;
        int ite = 0;
        while(winners.size() < users.size()){
            current = (current + 1) % users.size();

            User currUser = users.get(current);

            if(winners.contains(currUser)){
                continue;
            }

            int dice = rollDice();
            System.out.println(currUser.name + " rolled " + dice);
            board.advanced(currUser, dice);
            
            if(currUser.position == board.winningPoint){
                System.out.println(currUser.name + " wins");
                winners.add(currUser);
            }
            for(User user: users){
                System.out.println(user.name + " is at " + user.position);
            }
            ite++;
        }
        System.out.println("Total moves: " + ite);
    }
}