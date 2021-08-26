package B2;

public class IceCream {
    public static void main(String[] args) {
        int myMonth;
        String myPromotion;

        Promotion pro = new Promotion();
        myMonth = pro.getMonth();
        myPromotion = pro.getPromotion();

        System.out.println("Promotion in this month [ " + pro.monthString(myMonth) + " ]");
        System.out.println("\t" + myPromotion);

        pro.setMonth(12);
        pro.setMonth(13);
        pro.setPromotion("Buy 1 cup of Banana Split, Free Ice Tea");

        myMonth = pro.getMonth();
        myPromotion = pro.getPromotion();

        System.out.println("Promotion in this month [ " + pro.monthString(myMonth) + " ]");
        System.out.println("\t" + myPromotion);



    }
}
