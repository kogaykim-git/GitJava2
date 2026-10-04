public interface UserRepository {
    /**
     * Метод findById находит нужного user по id
     * @param id
     * @return user
     * @author Kogay Kostya
     * @version 1.0
     */
    User findById(int id);
}
