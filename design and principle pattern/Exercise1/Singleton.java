public class Singleton {
    public static void main(String[] args) {

        ABC obj1 = ABC.getInstance();
        ABC obj2 = ABC.getInstance();

        System.out.println(obj1 == obj2); 
    }
}

class ABC {

    private static ABC obj = new ABC();

    private ABC() {
    }

    public static ABC getInstance() {
        return obj;
    }
}