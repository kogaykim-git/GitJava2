public interface UserRepository {
    /**
     * Метод findById находит нужного user по id
     * @param id
     * @return user
     * @author Kogay Kostya
     * @version 1.0
     */
    User findById(int id);

    /**
     * Метод total находит общую сумму балансов всех юзеров
     * @return total
     * @author Kogay Kostya
     * @version 1.0
     */
    int total();

    /**
     * Метод findMax находит User с максимальным balance и возвращает этого User
     * @return User
     * @author Kogay Kostya
     */
    User findMax();

    /**
     * Метод findMin находит User с минимальным balance и возвращает этого User.
     * @return User с минимальным balance
     * @author Kogaykim
     */
    User findMin();

    /**
     * Метод findTotal находит общую сумму balance User-ов в диапазоне аргументов
     * @param min минимальный аргумент
     * @param max максимальный аргумент
     * @return сумма всех балансов юзеров из диапазона аргументов
     * @author Kogaykim
     */
    int findTotal(int min, int max);
}
