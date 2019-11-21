package estructuradatos;

public class QUEUE {
    protected int front,back;
    protected int[] data;
    public QUEUE(){
        front=back=0;
        data=new int[1002];
    }
    public void PushBack(int newData){
        data[back++]=newData;
        if(back==data.length) back=0;
    }
    public int PopFront(){
        int ret;
        ret=data[front];
        if(++front==data.length) front=0;
        return ret;
    }
    public int Front(){
        return data[front];
    }
    public boolean Empty(){
        if(front==back) return true;
        else return false;
    }
}
