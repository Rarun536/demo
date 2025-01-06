class Computer {
    public void playMusic() {
        System.out.println("Playing Music Via Java playMusic Method");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";

        return "Nothing";
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(9);
        System.out.println(str);
    }
}
