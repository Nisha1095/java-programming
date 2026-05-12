class Encapsulations {
    public static void main(String[] args) {
        Encapsulation1 encapsulation = new Encapsulation1("Hello, World!");
        System.out.println("Message: " + encapsulation.getMessage());
    }
}

class Encapsulation1 {
    // Private variables prevent direct external modification
    private String message;

    // Constructor to initialize data
    public Encapsulation1(String message) {
        this.message = message;
    }

    // Public getter to safely read data
    public String getMessage() {
        return message;
    }
}
