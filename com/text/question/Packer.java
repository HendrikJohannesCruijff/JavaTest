package com.text.question;


import kotlin.io.path.PathsKt;

public class Packer {
    private   static int pencilCount;
    private static int eraserCount;
    private static int ballPointPencount;
    private static int rulerCount;
    void packing(Pencil pencil) {
        if (pencil.getHardness().equals("4B") ||
                pencil.getHardness().equals("3B") ||
                pencil.getHardness().equals("2B") ||
                pencil.getHardness().equals("B") ||
                pencil.getHardness().equals("HB") ||
                pencil.getHardness().equals("H") ||
                pencil.getHardness().equals("2H") ||
                pencil.getHardness().equals("3H") ||
                pencil.getHardness().equals("4H")) {
            Packer.pencilCount++;
            System.out.println("포장 완료");
        } else {
            System.out.println("포장 실패");
        }

    }
    void packing(Eraser eraser) {
        if (eraser.getSize().equals("Large") ||
                eraser.getSize().equals("Medium") ||
                eraser.getSize().equals("Small")) {
            Packer.eraserCount++;
            System.out.println("포장 완료");
        } else {
            System.out.println("포장 실패");
        }
    }
    void packing(BallPointPen ballPointPen) {
        if (ballPointPen.getThickness().equals("0.3") ||
                ballPointPen.getThickness().equals("0.5") ||
                ballPointPen.getThickness().equals("0.7") ||
                ballPointPen.getThickness().equals("1") ||
                ballPointPen.getThickness().equals("1.5")) {
            Packer.ballPointPencount++;
            System.out.println("포장 완료");
        } else {
            System.out.println("포장 실패");
        }


    }
    void packing(Ruler ruler) {
        if (ruler.getLength() == 30 || ruler.getLength() == 50 || ruler.getLength() == 100 &&   (ruler.getShape().equals("줄자") ||
                ruler.getShape().equals("운형자") ||
                ruler.getShape().equals("삼각자")) ) {
            Packer.rulerCount++;
            System.out.println("포장 완료");
        } else {
            System.out.println("포장 실패");
        }
    }


    public void countPacking(int i) {
        switch (i) {
            case 0:
                System.out.println("=====================");
                System.out.println("       포장결과");
                System.out.println("=====================");

                System.out.printf("연필 %d회\n", pencilCount);
                System.out.printf("지우개 %d회\n", eraserCount);
                System.out.printf("볼펜 %d회\n", ballPointPencount);
                System.out.printf("자 %d회\n", rulerCount);
                break;
            case 1:
                System.out.println("=====================");
                System.out.println("       포장결과");
                System.out.println("=====================");
                System.out.printf("연필 %d회\n", pencilCount);
                break;
            case 2:
                System.out.println("=====================");
                System.out.println("       포장결과");
                System.out.println("=====================");
                System.out.printf("지우개 %d회\n", eraserCount);
                break;
            case 3:
                System.out.println("=====================");
                System.out.println("       포장결과");
                System.out.println("=====================");
                System.out.printf("볼펜 %d회\n", ballPointPencount);
                break;
            case 4:
                System.out.println("=====================");
                System.out.println("       포장결과");
                System.out.println("=====================");
                System.out.printf("자 %d회\n", rulerCount);
                break;

        }
    }
}  // Packer class


class Pencil{
    private String hardness;

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {

            this.hardness = hardness;
        }

    @Override
    public String toString() {
        return "Pencil{" +
                "hardness='" + hardness + '\'' +
                '}';
    }
}






class Eraser{


    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

            this.size = size;
        }

    @Override
    public String toString() {
        return "Eraser{" +
                "size='" + size + '\'' +
                '}';
    }
}




class BallPointPen{


    private String thickness;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("red") ||
                color.equals("blue") ||
                color.equals("green") ||
                color.equals("black")) {
            this.color = color;
        }
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {

            this.thickness = thickness;

    }

    @Override
    public String toString() {
        return "BallPointPen{" +
                "thickness='" + thickness + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
class Ruler{


    private int length;
    private String shape;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {

            this.length = length;

    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
            this.shape = shape;

    }

    @Override
    public String toString() {
        return "Ruler{" +
                "length=" + length +
                ", shape='" + shape + '\'' +
                '}';
    }
}

