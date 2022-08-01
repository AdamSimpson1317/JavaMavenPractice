public class HelloMaven {


    private String name;

    public HelloMaven(String name) {
        this.name = name;

    }
    public String greet(){

        return String.format("Hello %s, I'm Maven", this.name);
    }
}
