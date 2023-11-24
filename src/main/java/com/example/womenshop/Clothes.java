package com.example.womenshop;
public class Clothes extends Product{

  private int size;

  public Clothes(String name, double purchasePrice, double price, int nbItems, int size) {
    super(name, purchasePrice, price, nbItems);
    setSize(size);
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) throws IllegalArgumentException {
    if(size>=36 && size <=50){
      this.size = size;
    }else throw new IllegalArgumentException("Size is not valid");
  }

  @Override
  public String toString() {
    return "Clothes{" +super.toString()+
            " size=" + size +
            '}';
  }

  @Override
  public void applyDiscount() {
    this.setPrice(this.getPrice()*(1-DISCOUNT_CLOTHES));
  }


}
