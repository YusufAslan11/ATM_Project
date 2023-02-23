package atmproject;

public class Bank {

    private String name;
    private String lastName;
    private String identity;
    private String accountNumber;
    private String cardNo;

    public Bank(String name, String lastName, String identity, String accountNumber, String cardNo) {
        this.name = name;
        this.lastName = lastName;
        this.identity = identity;
        this.accountNumber = accountNumber;
        this.cardNo = cardNo;
    }

    public Bank(String name, String lastName, String identity) {
        this.name = name;
        this.lastName = lastName;
        this.identity = identity;
    }

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identity='" + identity + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
