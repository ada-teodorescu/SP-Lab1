public class Paragraph extends Elements {
    private String text;

    public Paragraph(String t){
        this.text = t;
    }

    public void print() {
        System.out.println(this.text);
    }
}