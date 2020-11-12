public class Haski extends Dog{
    private String name = "Dog";

    public Haski(String name) {
        this.name = name;
        home();
    }

    public void Dog_in_home(){
        System.out.println(name);
    }

    @Override
    public void home() {
    }
}
