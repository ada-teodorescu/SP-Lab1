public class Table extends Elements{
    private String title;

    public Table(String t){
        this.title = t;
    }

    public void print(){
        System.out.println(this.title);
    }
}