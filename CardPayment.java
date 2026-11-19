public class CardPayment extends Payment { //يرث من Payment

    @Override
    public void pay(double amount) { //ينفذ عملية الدفع بالبطاقة

        setPaidAmount(amount);

        System.out.println("Paid by Card: " + amount);
    }

    @Override
    public String getPaymentMethod() { // ترجع Card
        return "Card";
    }
}
