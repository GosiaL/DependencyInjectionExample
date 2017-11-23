package pl.akademiakodu;

public class Main {

    public static void main(String[] args) {
	    MessagePrinter printer = new MessagePrinter(new SimpleMessageProducer());
        printer.printMessage();
    }
}
