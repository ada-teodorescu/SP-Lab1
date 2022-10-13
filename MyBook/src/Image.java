public class Image extends Elements{
    private String imageName;

    public Image(String im){
        this.imageName = im;
    }
    public void print() {
        System.out.println(this.imageName);
    }
}