public class ArrayStack implements StackInterface {

    int size;
    Object[] array;
    int top;

    public ArrayStack(int size) {
        this.size = size;
        this.array = new Object[size];
        this.top = -1;
        clear();
    }
    @Override
    public void clear() {
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public Object peek(){
        return array[top];
    }

    @Override
    public Object pop(){
        if(top == -1){
            return null;
        }

        Object object = array[top];
        top--;

        return object;
    }


    @Override
    public boolean push(Object object){
        if(top < size - 1){
            array[++top] = object;
            return true;
        }

        return false;
    }

    @Override
    public int size(){
        return top+1;
    }

    @Override
    public boolean search(Object object){
        if(top == -1){
            return false;
        }
        if(array[top].equals(object)){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String str = "";
        for(int i = top; i >= 0; i--){
            str += array[i];
        }
        return str;
    }

}
