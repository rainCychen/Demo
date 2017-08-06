package Tetris;

public class TestO {
	public static void main(String[] args) {
        O o=new O(0,5);
        //测试print方法
        System.out.println("原始坐标为：");
        o.print();
        
        //测试drop方法
//        o.drop();
//        System.out.println("调用drop方法后的坐标：");
//        o.print();
        
        //测试moveLeft方法
//        o.moveLeft();
//        System.out.println("调用moveLeft方法后的坐标：");
//        o.print();
        
        //测试moveRight方法
        o.moveRight();
        System.out.println("调用moveRight方法后的坐标：");
        o.print();
    }
}
