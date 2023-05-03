package Task1;

/**
 * Базовый интерфейс - Бегун
 */
public interface Runner {

    String getName();

    int getMaxRun();

    int getMaxJump();

    /**
     * Прыжок
     *
     * @param height высота прыжка
     * @return результат прыжка. (удалось перепрыгнуть или нет)
     */
    default boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s successfully jumped over the wall %d m.\n", getName(), height);
            return true;
        } else {
            System.out.printf("%s did not jumped over the wall %d m.\n", getName(), height);
            return false;
        }
    }

    /**
     * Бег
     *
     * @param distance дистанция
     * @return результат забега. (удалось преодолеть дистанцию или нет)
     */
    default boolean run(int distance) {
        if (distance <= getMaxRun()) {
            System.out.printf("%s successfully ran over the track %d m.\n", getName(), distance);
            return true;
        } else {
            System.out.printf("%s did not ran over the track %d m.\n", getName(), distance);
            return false;
        }
    }

}
