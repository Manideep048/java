class animal {
    void walks() {
        System.out.println ("I AM WALKING");
    }
}
class Bird extends animal {
    void fly() {
        System.out.println("I AM FLYING");
    }
}
class p2{
    public static void main(String Args[]){
    Bird bird = new Bird();
    bird.walks();
    bird.fly();
}
}
