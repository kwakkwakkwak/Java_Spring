package part8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class BoardCafe implements Board {


    @Resource(name = "freeWrite")
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
