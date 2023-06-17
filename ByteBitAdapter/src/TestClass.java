public class TestClass {
    public static void main(String args[]) {
        ByteEater byteEater=new ByteEater(
                new BitsToByteAdapter(new BitSpitter()));
        byteEater.eatByte();
    }
}