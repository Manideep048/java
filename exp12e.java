class printNum{
    volatile Boolean runF = true;
    volatile Boolean runS = true;
synchronized void first(){
    System.out.println("FIRST");runF = false;
    notifyAll();
}

synchronized void second(){
    try{while(runF) wait ();}catch(Exception e){}
    System.out.println("SECOND");runS=false;notifyAll();}
    
synchronized void third(){
    try{while(runS) wait ();}catch(Exception e){}
    System.out.println("THIRD");notifyAll();}
}
class NT implements Runnable{
    String call;
    printNum p;
    Thread t;
    NT (printNum p,String s){
        t = new Thread (this);
        this.p = p;
        call = s;
        t.start();
    }
    public void run(){
        if(call == "1"){p.first(); p.runF=false;}
        else if(call=="2")
        {p.second();
        p.runS=false;}
        else if (call == "3"){p.third();}
    }
}
class seqDemo{
    public static void main(String [] Args){
        printNum p = new printNum();
        NT t2 = new NT(p,"2");
        NT t3 = new NT(p,"3");
        NT t1 = new NT(p,"1");
    }
}
