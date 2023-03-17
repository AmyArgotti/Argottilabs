public class GenericEx0_Var {
    public static void main(String[] args) {
        var a =140;
        var x= 1+39% a+Math.PI;
        var y= x+"Hello";
        var bArr=new double[]{12,37,89.6,-4};

        System.out.println(x);
        System.out.println(y);
        for (var b :bArr)
            System.out.println(b);
    }
}