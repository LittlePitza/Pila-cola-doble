package estructuradatos;

public class DEQUE extends QUEUE {
    public DEQUE(){
        super();
    }
    public int PopBack(){
        int ret=data[back];
        if(--back<0) back=data.length-1;
        return ret;
    }
    public int Back(){
        return data[back];
    }
    public void PushFront(int newData){
        front--;
        if(front<0) front=data.length-1;
        data[front]=newData;
    }
}
