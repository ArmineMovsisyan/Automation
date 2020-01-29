package exam;

public class Animal {
    private String type;
    private boolean climb;


    public Animal(String type,boolean climb) {
        this.type = type;
        this.climb= climb;
    }

    public boolean getClimb() {
        return climb;
    }



    public String getType() {
        return type;
    }


}
