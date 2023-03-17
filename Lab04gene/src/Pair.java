public class Pair <T,U>{
    private T first;
    private U second;

    public Pair(){
    }
    public Pair(T first, U second){
        this.first= first;
        this.second= second;
    }


    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
    public static <T,U>Pair of(T t ,U u){return new Pair<T,U>(t,u);}
    public <T,U>Pair[]arrayof(int n){
        Pair<T,U>[]res=(Pair<T, U>[]) new Object[n];
        for (int i = 0; i <n ; i++) {
            res[i]= new Pair<T,U>((T)first, (U)second);

        }
        return res;
    }


    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}