public class AlignLeft implements AlignStrategy{
    @Override
    public void render(String text, Context context) {
        while(text.length()>context.width){
            String subtext = text.substring(0,context.width);
            System.out.println(subtext);
            text = text.substring(context.width);
        }
        System.out.println(text);
    }
}
