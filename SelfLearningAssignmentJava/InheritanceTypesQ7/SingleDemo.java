package InheritanceTypesQ7;

//7. Create demo applications to illustrate different types of inheritance.



	class Animal {
	    void eat() {
	        System.out.println("Animal eats");
	    }
	}

	class Dog extends Animal {
	    void bark() {
	        System.out.println("Dog barks");
	    }
	}


	class SingleDemo {
	    public static void main(String[] args) {
	        Dog d = new Dog();
	        d.eat();   // inherited
	        d.bark();
	    }
	}
