package day43;

public class Books {

    private String name;
    private int pages;
    private boolean goodCondition;

    public void price(){
        System.out.println("you can increase price by condition");
    }

    public Books(String name, int pages, boolean goodCondition) {
        this.name = name;
        this.pages = pages;
        this.goodCondition = goodCondition;
    }



}
