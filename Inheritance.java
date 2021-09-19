class A 
{
    private int x;
    public void setData(int a)
    {
        x=a;
    }
    public void getData()
    {
        System.out.println("X = "+x);
    }
}

class B extends A
{
    private int y;
    public void setData(int b)
    {
        y=b;
    }
    public void getData()
    {
        System.out.println("Y = "+y);
    }
}

Public class Inheritance
{
    public static void main(String []args)
    {
        B obj=new B();
        obj.setData(4);
        obj.getData();
    }
}