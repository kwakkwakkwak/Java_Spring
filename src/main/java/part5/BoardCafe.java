package part5;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardCafe implements Board {
    private Write write;

    @Autowired
    public void setWrite(Write write) {
        this.write = write;
    }
//
//    public BoardCafe(){
//        this.setWrite(Factory.getWriteInstance());
//    }



    public void boardWrite() {
        write.doWrite();
    }
}
