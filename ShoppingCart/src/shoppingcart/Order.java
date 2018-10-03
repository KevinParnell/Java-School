package shoppingcart;

public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
        switch (custType) {
            case NONPROFIT:
                discount = (total > 900) ? 10.00 : 5.00;
                break;
            case PRIVATE:
                discount = (total > 500) ? 7.00 : 4.00;
                break;
            case CORP:
                discount = (total > 1000) ? 3.00 : 5.00;
                break;
            default:
                System.out.println("Invalid customer type.");
        }

        /* if (custType == NONPROFIT) {
            if (total > 900) {
                discount = 10.00;
            } else discount = 5.00;
        } else if (custType == PRIVATE) {
            if (total > 900) {
                discount = 7.00;
            } else discount = 0;
        } else if (custType == CORP) {
            if (total < 500) {
                discount = 8.00;
            } else discount = 5.00;
        } */
    }
}
