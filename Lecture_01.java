class box{
    int height;
    int width;
    int depth;
}

class Lecture_01{
    
    public static void main(String args[])
    {
        box obj = new box();
        obj.height = 100;
        obj.width = 100;
        obj.depth = 50;
        System.out.println("Hight = "+ obj.height);
        System.out.println("Width = "+ obj.width);
        System.out.println("Depth = "+ obj.depth);
        
    }
}