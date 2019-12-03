package day43;

public class ChildrenBook extends Books {

    private String length;







    public ChildrenBook(String name, int pages, boolean goodCondition, String length){
        super(name, pages,goodCondition);
        this.length = length;
        price();
    }

    @Override
    public void price(){
        System.out.println("Children books are little bit expensive");
    }
}
