package MarketInterface;
class Student implements Cloneable {
    int id = 1;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}