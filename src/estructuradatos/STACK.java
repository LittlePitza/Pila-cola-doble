package estructuradatos;

public class STACK {
    private int top;
    private int[] data;
    public STACK(){
        top=-1;
        data=new int[1002];
    }
    public void Push(int newData){
        data[++top]=newData;
    }
    public int Pop(){
        return data[top--];
    }
    public int Top(){
        return data[top];
    }
    public boolean Empty(){
        if(top==-1) return true;
        else return false;
    }
}
