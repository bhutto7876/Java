public class Encapsulation {

    private String name;
    private int id;

    public String getName() {
        return name = name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public static void main(String a[]) {
        Encapsulation enc = new Encapsulation();
        enc.setName(("Sohail"));
        String name = enc.getName();
        StringBuffer str = new StringBuffer();
        str.append("nisar");
        str.charAt(2);
        str.append(23);
        // str.deleteCharAt (1);
        str.substring(3);
        str.setLength(3);
        System.out.println("Name :::::::::  " + str);
    }
}