public class Main {

    public static void main(String[] args) {

        // Create patient إنشاء المريض
        Patient patient = new Patient(111, "Amal");

        // Create billing system إنشاء نظام الفواتير
        BillingSystem billing = new BillingSystem();

        // Create invoice إنشاء الفاتورة
        Invoice invoice = new Invoice(
                1, patient, 100, 50, 30
        );

        // Add invoice to billing system إضافة الفاتورة
        billing.addInvoice(invoice);

        // Display invoice before payment عرض الفاتورة قبل الدفع
        invoice.displayInvoice();

        // Create payment method إنشاء طريقة الدفع
        Payable payment = new CashPayment();

        // Process payment تنفيذ الدفع
        invoice.processPayment(payment); //ارسلنا كائن الدفع الى الفاتورة وهي التي تنفذ عملية الدفع

        // Display invoice after payment عرض الفاتورة بعد الدفع
        invoice.displayInvoice();

        // Search for invoice البحث عن الفاتورة
        Invoice foundInvoice = billing.findInvoice(1);

        if (foundInvoice != null) {

            System.out.println("\nInvoice Found Successfully");

            foundInvoice.displayInvoice();

        } else {

            System.out.println("Invoice Not Found");
        }
    }
}