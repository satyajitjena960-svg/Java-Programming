package Experiments;


   public abstract class animal{
        protected int leg;
        protected animal(int legs) {
            this.leg = legs;
        }
        public abstract void eat();
        public void walk() {
            System.out.println("This animal walks on " + leg + " legs");
        }

       public static void main(String[] args) {
           fish f =new fish("Nemo");
           animal c=new cat("tom");
           animal s=new spider();
           pet p=new cat();
           c.eat();
           f.walk();
       }
    }
    class spider extends animal {
        public spider() {
            super(8);
        }
        public void eat() {
            System.out.println("Spider eats insects");
        }
    }
     interface pet{
       String getName();
       void setName(String name);
       void play();
    }
    class cat extends animal implements pet{
       private String name;
       public cat(String name){
           super(4);
           this.name=name;
       }
        public void eat() {
            System.out.println("Cat eat fish");
        }
        public cat(){
           this("cat");
        }
        public String getName(){
           return name;
        }
         public void setName(String name){
            this.name=name;
        }
        public void play(){
            System.out.println(name+"is playing");
        }

    }
    class fish extends animal implements pet{
       private String name;
        public fish(String name){
            super(0);
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public void play(){
            System.out.println(name+"is playing");
        }
        public void eat() {
            System.out.println("fish eat darymilk");
        }
        public void walk(){
            System.out.println("fish can not walk");
        }


    }

