package pe.sdh.designpattern.bridge;

/**
 * Created by seongdonghun on 2016. 9. 1..
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i=0; i<this.width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }


}
