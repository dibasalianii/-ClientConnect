import java.util.*;

class Client {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String preferences;
    private String sizes;
    private String linesOfInterest;
    private String communicationMethod;
    private String purchaseHistory;
    private String lastVisitDate;
    private String lastContactDate;

    public Client(String firstName, String lastName, String phoneNumber, String email,
                  String preferences, String sizes, String linesOfInterest,
                  String communicationMethod, String purchaseHistory,
                  String lastVisitDate, String lastContactDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.preferences = preferences;
        this.sizes = sizes;
        this.linesOfInterest = linesOfInterest;
        this.communicationMethod = communicationMethod;
        this.purchaseHistory = purchaseHistory;
        this.lastVisitDate = lastVisitDate;
        this.lastContactDate = lastContactDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getLinesOfInterest() {
        return linesOfInterest;
    }

    public void setLinesOfInterest(String linesOfInterest) {
        this.linesOfInterest = linesOfInterest;
    }

    public String getCommunicationMethod() {
        return communicationMethod;
    }

    public void setCommunicationMethod(String communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public String getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(String lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public String getLastContactDate() {
        return lastContactDate;
    }

    public void setLastContactDate(String lastContactDate) {
        this.lastContactDate = lastContactDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", preferences='" + preferences + '\'' +
                ", sizes='" + sizes + '\'' +
                ", linesOfInterest='" + linesOfInterest + '\'' +
                ", communicationMethod='" + communicationMethod + '\'' +
                ", purchaseHistory='" + purchaseHistory + '\'' +
                ", lastVisitDate='" + lastVisitDate + '\'' +
                ", lastContactDate='" + lastContactDate + '\'' +
                '}';
    }
}

class ClientManager {
    private Map<String, Client> clients;

    public ClientManager() {
        clients = new HashMap<>();
    }

    public void addClient(Client client) {
        String key = client.getFirstName() + " " + client.getLastName();
        clients.put(key, client);
    }

    public Client getClient(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return clients.get(key);
    }

    public void updateClient(Client updatedClient) {
        String key = updatedClient.getFirstName() + " " + updatedClient.getLastName();
        clients.put(key, updatedClient);
    }

    public void deleteClient(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        clients.remove(key);
    }

    @Override
    public String toString() {
        return "ClientManager{" +
                "clients=" + clients +
                '}';
    }
}

public class ClientManagementProgram {
    public static void main(String[] args) {
        ClientManager clientManager = new ClientManager();

        // Create and add sample clients
        Client client1 = new Client("Diba", "Saliani", "555-123-4567", "diba@example.com",
                "Preferences 1", "Sizes 1", "Lines of Interest 1",
                "Email", "Purchase History 1", "2023-08-01", "2023-08-10");
        Client client2 = new Client("Deena", "Saliani", "555-987-6543", "deena@example.com",
                "Preferences 2", "Sizes 2", "Lines of Interest 2",
                "Phone", "Purchase History 2", "2023-07-15", "2023-07-20");

        clientManager.addClient(client1);
        clientManager.addClient(client2);

        // Retrieve and print client details
        String searchFirstName = "Diba";
        String searchLastName = "Saliani";
        Client searchedClient = clientManager.getClient(searchFirstName, searchLastName);

        if (searchedClient != null) {
            System.out.println("Client details:\n" + searchedClient);
        } else {
            System.out.println("Client not found.");
        }

        // Update a client's details
        Client updatedClient = new Client("Diba", "Saliani", "555-123-4567", "newemail@example.com",
                "Updated Preferences", "Updated Sizes", "Updated Lines of Interest",
                "Updated Communication", "Updated Purchase History", "2023-08-15", "2023-08-20");
        clientManager.updateClient(updatedClient);

        // Delete a client
        String deleteFirstName = "Deena";
        String deleteLastName = "Saliani";
        clientManager.deleteClient(deleteFirstName, deleteLastName);

        // Print updated client manager
        System.out.println("\nUpdated Client Manager:\n" + clientManager);
    }
}
