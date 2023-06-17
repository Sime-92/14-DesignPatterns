public class ByteEater {
    ByteSpitterIntf byteSpitter;
    public ByteEater(ByteSpitterIntf byteSpitter) {
        this.byteSpitter=byteSpitter;
    }
    public void eatByte() {
        byte b = byteSpitter.nextByte();
        //Process byte
        System.out.print("byte: " + b);
    }

}