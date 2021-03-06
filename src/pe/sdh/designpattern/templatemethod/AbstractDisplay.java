package pe.sdh.designpattern.templatemethod;

/**
 * Created by seongdonghun on 2016. 7. 28..
 */
public abstract class AbstractDisplay {
    public final void display(){
        open();

        for (int i=0; i<5; i++)
            print();

        close();
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();

}
