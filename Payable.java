public interface Payable {

    void pay(double amount);//دالة تستقبل مبلغ الدفع

    String getPaymentMethod();//دالة ترجع اسم طريقة الدفع
}
