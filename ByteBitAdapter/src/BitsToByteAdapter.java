public class BitsToByteAdapter implements ByteSpitterIntf {
    BitSpitter bitSpitter;
    public BitsToByteAdapter(BitSpitter bitSpitter) {
        this.bitSpitter=bitSpitter;
    }
    public byte nextByte() {
        String bitString="";
        for(int i=0;i<8;i++)
            bitString+=bitSpitter.nextBit();
        System.out.println(bitString);
        return (byte)Integer.parseInt(bitString,2);
    }
}