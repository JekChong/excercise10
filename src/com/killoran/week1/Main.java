package com.killoran.week1;
import java.util.*;
class Contact{
    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

 class Collection implements  Iterable<Contact>{

List<Contact> contactCollection;
public Collection(List<Contact> contactCollection){
    this.contactCollection = contactCollection;
}

    @Override
    public Iterator<Contact> iterator(){
    return contactCollection.iterator();
    }
}
class Main{
    public static void main(String[] args) {
        List<Contact> contactCollection
                = Arrays.asList(new Contact("Josue","JosueHoGrajales@swcsd.us"),
                new Contact("jek","jek@swcsd.us"),new Contact("johnny","johnewnfns@swcsd.us"));
        Collection collection1 = new Collection(contactCollection);

        for(Contact con: collection1){
            System.out.println(con.getName()+ " "+con.getEmail());

        }
    }
}