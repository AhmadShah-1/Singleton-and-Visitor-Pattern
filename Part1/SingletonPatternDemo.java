package Part1;

public class SingletonPatternDemo {
    public static void main(String[] args) {
//illegal construct
//Compile Time Error: The constructor Part1.SingleObject() is not visible
//Part1.SingleObject object = new Part1.SingleObject();
//Get the only object available
        SingleObject object = SingleObject.getInstance();
//show the message
        object.showMessage();
    }
}