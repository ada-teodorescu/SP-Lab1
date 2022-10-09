public class Book {
    private String name;
    private String content;
    public Book(String n){
        this.name = n;
        this.content = "";
    }
    public void createNewParagraph(String p){
        this.content += p + "\n";
    }
    public void createNewImage(String i){
        this.content += i + "\n";
    }
    public void createNewTable(String t){
        this.content += t + "\n";
    }
    public void print(){
        System.out.println(this.content);
    }

}
