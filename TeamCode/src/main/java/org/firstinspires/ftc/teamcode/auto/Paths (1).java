import static com.pedropathing.api.Paths.*;

import com.pedropathing.api.PoseFactory;
import com.pedropathing.math.Pose;
import com.pedropathing.paths.Path;

public class Paths {

    private final PoseFactory poseFactory = PoseFactory.degrees();

    private final Pose start = poseFactory.of(8.2438, 130.9281, 90);
    private final Pose point1Start = poseFactory.of(8.2438, 130.9281, 0);
    private final Pose point1 = poseFactory.of(9.2094, 80.8146, 0);
    private final Pose point2 = poseFactory.of(13.7115, 12.9948, 0);
    private final Pose point2Control1 = poseFactory.of(20.926, 59.024, 0);
    private final Pose point3 = poseFactory.of(58.2375, 23.7229, -90.1502);
    private final Pose point3Control1 = poseFactory.of(58.4229, 8.724, 0);
    private final Pose point4 = poseFactory.of(10.1396, 105.774, -89.9621);
    private final Pose point4Control1 = poseFactory.of(9.9437, 35.0521, 0);

    public Path path1() {
        return line(point1Start, point1).linear(point1Start, point1);
    }

    public Path path2() {
        return curve(point1, point2Control1, point2).linear(point1, point2);
    }

    public Path path3() {
        return curve(point2, point3Control1, point3).reverseTangent();
    }

    public Path path4() {
        return curve(point3, point4Control1, point4).reverseTangent();
    }
}