package az.babayev.javarush.javacore.task.task3.task1328;

public abstract class AbstractRobot implements Attackable, Defensable {

    private int hitCount;

    public BodyPart attack() {
        BodyPart attackBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackBodyPart = BodyPart.LEG;
        } else {
            hitCount = 0;
            attackBodyPart = BodyPart.CHEST;
        }
        return attackBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;

        hitCount = hitCount + 2;
        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;

        }
        return defendedBodyPart;
    }

}
