import java.util.*;
import snakeladder.*;


public class Main {
    public static void main(String []args) {
        Board board = new Board();
        List<User> users = new ArrayList<>();
        User u1 = new User("Demo 1", 0);
        User u2 = new User("Demo 2", 0);
        users.add(u1);
        users.add(u2);
        SnakeLadder obj = new SnakeLadder(board, users);
        
        obj.board.addLadder(20, 39);
        obj.board.addLadder(3, 45);
        obj.board.addLadder(45, 46);
        obj.board.addLadder(69, 95);
        obj.board.addLadder(9, 33);
        obj.board.addLadder(51, 69);
        obj.board.addLadder(42, 59);
        obj.board.addLadder(59, 61);
        obj.board.addSnake(39, 25);
        obj.board.addSnake(67, 35);
        obj.board.addSnake(97, 63);
        obj.board.addSnake(63, 44);
        obj.board.addSnake(89, 73);
        obj.board.addSnake(89, 73);
        obj.board.addSnake(35, 15);
        obj.board.addSnake(31, 7);
        obj.board.addSnake(34, 27);
        obj.simulate();
    }
}