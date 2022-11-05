public class Paragraph extends AbstractElement {
    private final String text;
    private AlignStrategy textAlignment=null;

    public Paragraph(String t){
        this.text = t;
    }

    @Override
    public void print() {
        if(this.textAlignment == null)
            System.out.println("Paragraph: " + this.text);
        else{
            this.textAlignment.render("Paragraph: " + this.text, new Context());
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.textAlignment = alignStrategy;
    }
}