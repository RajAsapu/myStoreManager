package com.mystoremanager.service.dto;

public class Store {
    String name;
    String owner;
    Address address;
    String approximateRevenuePerAnnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", address=" + address +
                ", approximateRevenuePerAnnum='" + approximateRevenuePerAnnum + '\'' +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getApproximateRevenuePerAnnum() {
        return approximateRevenuePerAnnum;
    }

    public void setApproximateRevenuePerAnnum(String approximateRevenuePerAnnum) {
        this.approximateRevenuePerAnnum = approximateRevenuePerAnnum;
    }
}
