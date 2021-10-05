import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Bin bin = new Bin(10);
        int count = 0;
        ArrayList<Ball> balls = bin.getBin();
        for (int i = 0; i < balls.size(); i++) {
            if(balls.get(i).getColor() == "Blue"){
                count++;
            }
        }
	    System.out.println("Кол-во синих мячей: " + count);
	    System.out.println("Вес мячей: " + bin.getWeight());
    }
}

class Ball{
    private String color;
    private double weight;
    Ball(int color, double weight){
        newBall(color, weight);
    }

    void newBall(int color, double weight){
        this.weight = weight;
        switch (color){
            case 1:
                this.color = "Red";
                break;
            case 2:
                this.color = "Blue";
                break;
            default:
                this.color = "White";
                break;
        }
    }

    String getColor(){
        return color;
    }

    double getWeight(){
        return weight;
    }
}

class Bin{
    private ArrayList<Ball> bin = new ArrayList<>();
    private double weight = 0;

    Bin(int count){
        for(int i = 0; i < count; i++){
            addBall(count);
        }
    }

    ArrayList<Ball> getBin(){
        return bin;
    }

    void addBall(int count){
        Random rand = new Random();
        Ball ball = new Ball(rand.nextInt((2-0)+1), 2.5);
        bin.add(ball);
        weight += ball.getWeight();
    }

    double getWeight(){
        return weight;
    }
}