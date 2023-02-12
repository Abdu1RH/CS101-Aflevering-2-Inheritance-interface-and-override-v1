public class Pizza implements FastFood{

    private String dishType;
    private String dishName;
    private double dishPrice;

    public Pizza (String dishType, String dishName, double dishPrice){
        this.dishType = dishType;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }
    @Override
    public String dishType() {
        return this.dishType;
    }

    @Override
    public String dishName() {
        return this.dishName;
    }

    @Override
    public double dishPrice() {
        return this.dishPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dishType='" + dishType + '\'' +
                ", dishName='" + dishName + '\'' +
                ", dishPrice=" + dishPrice +
                '}';
    }
}
