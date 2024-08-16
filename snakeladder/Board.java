package snakeladder;

import java.util.*;

public class Board{
    int grid;
    Map<Integer, Integer> snake = new HashMap<>();
    Map<Integer, Integer> ladder = new HashMap<>();
    int winningPoint;

    public void addSnake(int tail, int head){
        snake.put(head, tail);
    }
    public void addLadder(int tail, int head){
        ladder.put(tail, head);
    }
    void setWinningPoint(int position){
        winningPoint = position;
    }
    void gridSize(int size){
        grid = size;
    }

    public Board(){
        grid = 100;
        winningPoint = 100;
    }

    public void advanced(User user, int value){
        if(user.position + value > grid){
            System.out.println(user.name + " need " + (grid - user.position) + " to win");
            return;
        }
        user.position += value;
        if(user.position == winningPoint){
            System.out.println(user.name + " has reached the winning point!");
            return;
        }
        if(snake.get(user.position) != null){
            System.out.println(user.name + " bitten by snake");
            user.position = snake.get(user.position);
        }
        if(ladder.get(user.position) != null){
            System.out.println(user.name + " climbed ladder");
            user.position = ladder.get(user.position);
        }
    }

}