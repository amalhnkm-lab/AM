import java.util.ArrayList;//انشاناArrayList لنخزين عدة فواتير

public class BillingSystem {

    private ArrayList<Invoice> invoices;

    // Constructor هنا يتم إنشاء قائمة فواتير فارغة
    public BillingSystem() {

        invoices = new ArrayList<>();
    }

    // Add invoice تستقبل هذه الدالة كائن فاتورة وتضيفه الى القائمة
    public void addInvoice(Invoice invoice) {

        invoices.add(invoice);

        System.out.println("Invoice Added Successfully");
    }

    // Find invoice
    public Invoice findInvoice(int invoiceID) {

        for (Invoice invoice : invoices) {//تمر على جميع الفواتير

            if (invoice.getInvoiceID() == invoiceID) {//تتحقق من رقم الفاتورة

                return invoice;//ترجع كائن الفاتورة إذا وجدته
            }
        }

        return null;//إذا لم تجد الفاتورة
    }

    // Display all invoices تمر على جميع الفواتير و تعرضها
    public void displayAllInvoices() {

        for (Invoice invoice : invoices) {

            invoice.displayInvoice();
        }
    }
}
