package com.mock.ito;

public class CustomerReader {
    private EntityManagerDemo entityManager;

    public void setEntityManager(EntityManagerDemo entityManager) {
        this.entityManager=entityManager;
    }

    public String findFullName(long id) {
        Customer customer = this.entityManager.find(Customer.class, id);
        return customer.fname+ " "+customer.lname;
    }
}
