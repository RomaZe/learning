package utils;

public class CustomRound {

    private double boundary = 0.5;

    public CustomRound(double boundary) {
        this.boundary = boundary;
    }

    public void setBoundary(double boundary) {
        this.boundary = boundary;
    }

    public double getBoundary() {
        return boundary;
    }

    public double customRound(double number) {
        double value = ((number % 1) >= boundary) ? Math.ceil(number) : Math.floor(number);
        return value;
    }
}
