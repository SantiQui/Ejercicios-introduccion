package POO;


public class personaMain {
    public static void main(String[] args) {
        Persona user = new Persona();
        user.setName("Carlos");
        user.setSurname("Rodriguez");
        user.setAge(20);
        user.setPhone(416629);
        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getAge());
        System.out.println(user.getPhone());
    }
}
