public class TripleEx <T,V,U>extends Pair<T,V>{
    U third;
    public U getThird(){
        return third;
    }
    public TripleEx(U third){
        super();
        this.third= third;
    }
    public TripleEx(T first,V second , U third){
        super(first, second);
        this.third= third;
    }


}