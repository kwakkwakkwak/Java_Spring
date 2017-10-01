package part11;

import org.springframework.stereotype.Component;

@Component("qnaWrite")
public class QnABoardWrite implements Write {

    private String sBoardName;

    public QnABoardWrite(){
        init();
    }

    private void init() {
        this.setsBoardName("Q&A Board");
    }

    private void setsBoardName(String sBoardName) {
        this.sBoardName = sBoardName;
    }

    @Override
    public void doWrite() {
        System.out.println(this.getsBoardName() + "Write down!!");
    }

    public String getsBoardName() {
        return sBoardName;
    }
}
