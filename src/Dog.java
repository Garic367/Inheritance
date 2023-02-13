class Dog extends Animal{
    private String color;

    public Dog(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String color) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void speak(){
        System.out.println("hufhufhufhufhuf");
    }


}
