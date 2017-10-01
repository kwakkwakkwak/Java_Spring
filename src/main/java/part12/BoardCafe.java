package part12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("board")
public class BoardCafe implements Board {


    @Resource(name = "qnaWrite")
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
