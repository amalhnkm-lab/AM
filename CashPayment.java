public class CashPayment extends Payment {//وراثة من الكلام Payment

    @Override //إعادة تعريف الدالة
    public void pay(double amount) {//تنفيذ طريقة الدفع النقدي

        setPaidAmount(amount);//تخزين مبلغ الدفع

        System.out.println("Paid by Cash: " + amount);
    }

    @Override
    public String getPaymentMethod() {//ترجع كلمة Cash
        return "Cash";
    }
}
