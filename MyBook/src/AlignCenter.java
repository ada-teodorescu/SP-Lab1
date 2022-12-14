public class AlignCenter implements AlignStrategy{
    @Override
    public void render(String text, Context context) {
        while(text.length()>context.width){
            String subtext = text.substring(0,context.width);
            System.out.println(subtext);
            text = text.substring(context.width);
        }
        for(int i = 0 ; i<(context.width-text.length())/2;i++){
            System.out.print(" ");
        }
        System.out.println(text);
    }
}
