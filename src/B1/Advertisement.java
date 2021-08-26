package B1;

public class Advertisement {
    public static void main(String[] args) {
        String adverText;

        Banner banner = new Banner();
//        banner.text;
        adverText = banner.getText();
        System.out.println("Old banner is " + adverText);

        banner.setText("OOP Class to 2nd Student");

        System.out.println("New banner is " + banner.getText());
    }
}
