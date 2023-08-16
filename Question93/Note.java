package Question93;

public class Note {
    private String size;
    private String color;
    private int page;
    private String owner;
    private int price;

    //setter, getter 구현

    public void setSize(String size) {
        if ((size.equals("A3")  || size.equals("A4")  || size.equals("A5")  || size.equals("B3")  || size.equals("B4")  || size.equals("B5") )) {
        this.size = size;
        }
    }

    public void setColor(String color) {
        if (color .equals("검정색") || color .equals("흰색") || color .equals("노란색") || color .equals("파란색")) {
        this.color = color;

            if (color.equals("검정색")) {
                this.price += 100;
            } else if (color.equals("노란색") || color.equals("파란색")) {
                price += 200;
            }

        }
    }

    public void setPage(int page) {
        if (page > 9 && page < 201) {
        this.page = page;
        }
    }

    public void setOwner(String owner) {
        if (owner.length() < 2 || owner.length() > 5) {
            return;
        }
        for (int i = 0; i < owner.length(); i++) {
            char c = owner.charAt(i);

            if (c < '가' || c > '힣') {
                return;
            }
        }
        this.owner = owner;
    }


    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }


    public String getOwner() {
        return owner;
    }



    public String info() {
        String str = "";
        price = 500;
        if (page > 9 && page < 51) {
             str ="얇다";
        } else if (page > 50 && page < 101) {
             str ="보통";
        } else {
             str ="두껍다";
        }



        if (size.equals("A3")) {
            price += 400;
        } else if (size.equals("A4")) {
            price += 200;
        } else if (size.equals("B3")) {
            price += 500;
        } else if (size.equals("B4")) {
            price += 300;
        } else if (size.equals("B5")) {
            price += 100;
        }

        if (page > 9) {
            price += page * 10;
        }

        String result = "";
        result += "■■■■■■ 노트 정보 ■■■■■■\n";
        if (owner != null) {
            result += String.format("소유자 : %s\n", owner);
            result += String.format("특성 : %s %s %s노트\n", color, str, size);
            result += String.format("가격 : %s\n", price);
            result += "■■■■■■■■■■■■■■■■■■■■■■\n";
        } else {
            result += "주인 없는 노트\n";
            result += "■■■■■■■■■■■■■■■■■■■■■■";
        }
        return result;

    }
}
