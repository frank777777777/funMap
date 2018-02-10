package me.funmap;

public class test {
    public static class something{
        static int a = 1;
        int b = 2;
        public void add(){
            System.out.println(a + b);
        }
    }

    public static void main(String[] args){
        something sm = new something();
        sm.add();

    }
}
