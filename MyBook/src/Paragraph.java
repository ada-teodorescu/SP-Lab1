public class Paragraph implements Element{
    private String text;

    public Paragraph(String t){
        this.text = t;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + this.text);
    }
}