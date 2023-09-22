package org.example.Class2_ConstructorChaining;

public class Constructor_ConstChaining_This_Super {
    int tyre;
    String color;
    int seater;
    String brand;
    int powerOfEngine;
    int price;

    //Constructor: It is used to intiaize the attributes,Constructor name is same as class name,It has no
    //return type.

    //This keyword:- It refers to attirbute/method

    //Super keyword:- It refers to parent attribute/method



    //Constructor Chaining: Constructor calling another constrcutor to intialize  the attributes is called
    //Constructor chaining

    //Below example is Constructor chaining

    //First constructor we initialize the two attributes
    // [We can reuse the First constructor attributes in second Constructor using this(tyre, color); this() keyword]
    //because we already used in first constructor so we are using to intialize values in 2nd Constructor.

    //Second constructor we initialize the Three attributes
    //  [We can reuse the Second constructor attributes in 3rd Constructor using this(tyre, color, seater);
    //  this() keyword]
    //To Create Third constructor we initialize the left over attributes but we called second constructor  attributes
  // which we used to create older constrcutors.We Reused  2nd Constrcutor taking 1st Constrcutor,3rd taking help of
    //2nd Constrcutor to initailize values this is called Constrcutor chaining.
    public Constructor_ConstChaining_This_Super(int tyre, String color) {
        this.tyre = tyre;
        this.color = color;
    }

    public Constructor_ConstChaining_This_Super(int tyre, String color, int seater) {

        this(tyre, color);
        this.seater = seater;
    }

    public Constructor_ConstChaining_This_Super(int tyre, String color, int seater, String brand, int powerOfEngine, int price) {

        //I can avoid reinitializing the attributes
        //as they are already defined above
        //i can reuse the above  constructor using this() keyword
        this(tyre, color, seater);

        this.brand = brand;
        this.powerOfEngine = powerOfEngine;
        this.price = price;
    }
}
