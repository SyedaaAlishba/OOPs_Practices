public interface HERBIVORE {
    static void eating_grass() {
        System.out.println("cow is eating grass");
    }
    default void green(){
        System.out.println("only eating green stuff");
    }
}

