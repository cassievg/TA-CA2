class Animal {
    int legs;
    public void speak(){
        System.out.println("...");
    }
    public void breathe(){
        System.out.println("Inhale. Exhale.");
    }
}

class Monkey extends Animal {
    int legs = 2;
    String size;
    public void speak(){
        System.out.println("Hoo.");
    }

    // Getter
    public String getSize(){
        return size;
    }

    // Setter
    public void setSize(String newSize) {
        this.size = newSize;
    }
}

class Dog extends Animal {
    int legs = 4;
    String size;
    public void speak() { System.out.println("Bark."); }

    // Getter
    public String getSize() {
        return size;
    }

    // Setter
    public void setSize(String newSize) {
        this.size = newSize;
    }
}

class Bird extends Animal {
    int legs = 2;
    String size;
    public void speak(){
        System.out.println("Chirp.");
    }

    // Getter
    public String getSize() {
        return size;
    }

    // Setter
    public void setSize(String newSize) {
        this.size = newSize;
    }
}