package mt.logistics.tensorflow.usecase.models;

public class StorageItem {
    private Integer id = 0;
    private String item;
    private Integer amount;
    private String date;

    public StorageItem() {
        super();
        id = 0;
        item = "containerB";
        amount = 3;
        date = "16:36:22";
    }

    public StorageItem(Integer id, String item, Integer amount, String date) {
        this.id = id;
        this.item = item;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "id: " + id + " | " +
                "item: " + item + " | " +
                "amount: " + amount + " | ";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
