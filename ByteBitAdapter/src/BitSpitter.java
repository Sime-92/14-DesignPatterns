public class BitSpitter {
    //each bit is represented using a string for this example
    public String nextBit() {
        //some logic returning a bit
        int num = (int)(Math.random()*2);
        return String.valueOf(num);
    }
}