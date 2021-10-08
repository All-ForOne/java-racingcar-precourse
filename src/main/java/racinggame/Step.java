package racinggame;

public class Step {
    private int count;

    public Step(int step) {
        this.count = step;
    }

    public int getCount(){
        return this.count;
    }

    public void plusStep(){
        this.count++;
    }

    public String printStep(){
        String strStep = "";
        for(int i = 0; i < this.count; i++){
            strStep += "-";
        }
        return strStep;
    }
}
