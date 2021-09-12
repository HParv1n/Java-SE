package questions;

public class PhilosophyBook extends Book {

    @Override
    public String getName(String string) {
       String st = "This book`s name is "+string;
        return st;
    }


    @Override
    public String page(int page) {
        String st ="This book`s pages is "+page;
        return st;
    }

    @Override
    public void bookReader() {
        System.out.println("I reading Philosophy book");
    }

    public void yazar(){
        System.out.println("Imanuel Kant");
    }

}
