public class MyThread extends Thread{
    BigBowl shared;
    TheCook cook;
    int number;

    public MyThread(BigBowl shared, TheCook cook, int number) {
        this.shared = shared;
        this.cook = cook;
        this.number=number;
    }

    public void processFood(String food){
        System.out.println("Thread "+number+" got: " + food);
    }

    public void getsFood(){
        String food = shared.getFood();
        if(food.equals("-1")){
            cook.emptyBowl = true;
            //cook.askForRefill();
            getsFood();}
        else
            processFood(food);
    }

    @Override
    public void run() {
        getsFood();
    }
}
