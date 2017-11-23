package pl.akademiakodu;

public class MessagePrinter {
    private MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public MessageProducer getMessageProducer() {
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage(){
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
