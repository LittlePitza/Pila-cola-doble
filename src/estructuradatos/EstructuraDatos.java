package estructuradatos;
import java.util.Scanner;
public class EstructuraDatos {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DEQUE deque=new DEQUE();
        STACK pila=new STACK();
        QUEUE cola=new QUEUE();
        for(int i=1;i<=20;i++) pila.Push(i);
        System.out.println("Pila: ");
        while(!pila.Empty()) System.out.print(pila.Pop()+ " ");
        System.out.println();
        for(int i=1;i<=20;i++) cola.PushBack(i);
        System.out.println("Cola: ");
        while(!cola.Empty()) System.out.print(cola.PopFront()+ " ");
        System.out.println();
        deque.PushFront(1);
        deque.PushBack(10);
        deque.PushBack(11);
        deque.PushFront(5);
        System.out.println("Cola doble: ");
        while(!deque.Empty()) System.out.print(deque.PopFront()+" ");
    }
}
