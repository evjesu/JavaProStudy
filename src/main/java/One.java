public class One {
    public static void main(String args[]){
        System.out.println("Hello!");
        Two test = new Two(1,5);
        System.out.println(test.getA()+" + "+test.getB()+" = "+test.sum());
    }
}
