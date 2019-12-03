package day43;

public class Comics extends Books {

    private String picture;

    public Comics(String name, int pages, boolean condition, String picture){
        super(name, pages, condition);
        this.picture = picture;
    }

    @Override
    public void price(){
        System.out.println("comics price is acceptable");
    }
    public void picture(){
        System.out.println("comics have so many picture in them");
    }


}
