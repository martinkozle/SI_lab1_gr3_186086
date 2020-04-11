import java.util.LinkedList;

class Receipt {
    private List<Item> articles;
    
    public Receipt() {
        this.articles = new LinkedList<>();
    }

    public void addItem(Item item) {
        this.articles.add(item);
    }

    public void remove(int id) {
        this.articles.removeIf(x -> x.getID() == id);
    }

    public double totalPrice() {
        double total = 0;
        for (Item item : this.articles) {
            total += item.getPrice();
        }
        return total;
    }

    public double totalTaxReturn() {
        double total = 0;
        for (Item item : this.articles) {
            total += item.taxReturn();
        }
        return total;
    }
}
