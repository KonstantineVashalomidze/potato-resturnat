
package com.resturant.potato;
public class PotatoResturant {

    public Orders[] orders = new Orders[0];


    public PotatoResturant(){

    }

    public void addOrder(Orders order){
        // Make temp array to store main array values and new order value
        Orders[] tempArray = new Orders[this.orders.length + 1];
        // Iterate over the main array and put all the values from it into the temparray
        for (int i = 0; i < this.orders.length - 1; i++) {
            tempArray[i] = this.orders[i];
        }
        // put given order on the last index
        this.orders[this.orders.length - 1] = order;
        // change main array with tempArray
        this.orders = tempArray;
    }


    public void addOrder(Orders... orders){
        // Generate temp array to merge main and new array it should be sum of lengths of main and taken array
        Orders[] tempArray = new Orders[this.orders.length + orders.length];
        // Fetch the old values from the main array and put them into the temp array
        for (int i = 0; i < this.orders.length; i++) {
            tempArray[i] = this.orders[i];
        }
        // Fetch the values of taken array and put them into tempArray
        for (int i = this.orders.length; i < this.orders.length + orders.length; i++) {
            tempArray[i] = orders[i];
        }
        // Change main array with tempArray
        this.orders = tempArray;
    }

    public void serve(){
        // Make temp array to store elements within it
        Orders[] orders = new Orders[this.orders.length - 1];

        // Reduce the length of the main array with one, first element
        for(int i = 1; i < this.orders.length; i++){
            orders[i - 1] = this.orders[i];
        }

        System.out.println(this.orders[0].name + " " + this.orders[0].quantity + " Served");

    }

}
