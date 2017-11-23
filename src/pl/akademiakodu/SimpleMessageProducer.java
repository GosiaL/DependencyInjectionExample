package pl.akademiakodu;

/**
 * Created by Inspiron on 2017-02-01.
 */
public class SimpleMessageProducer implements MessageProducer {
    @Override
    public String getMessage(){
        return "Example message " + System.currentTimeMillis();
    }
}
