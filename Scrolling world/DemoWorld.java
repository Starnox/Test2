import greenfoot.*;


public class DemoWorld extends ScrollWorld
{
    public DemoWorld()
    {
        super(800, 600, 1, 2000, 2000);

        prepare();
    }

    private void prepare()
    {

        Lumber lumber = new Lumber();
        addObject(lumber,400,300);
        addObject(new orizontal(),0,100);
        addObject(new vertical(),150,0);
    }
}