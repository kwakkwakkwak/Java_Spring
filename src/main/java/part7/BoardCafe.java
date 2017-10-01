package part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board {


    @Qualifier("freeWrite")
    @Autowired
    private Write write;

    public void setWrite(Write write) {
        this.write = write;
    }

//    public BoardCafe(){
//        this.setWrite(Factory.getWriteInstance());
//    }



    public void boardWrite() {
        write.doWrite();
    }
}
