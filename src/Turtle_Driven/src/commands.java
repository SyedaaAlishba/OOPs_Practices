public class commands {
    public point setterForward(line other) {
        // Step 1: Update newX/newY from other.end
        other.newX = other.end.x+ 50;
        other.newY = other.end.y ; // move down 50px

        // Step 2: Return new point using updated values
        return new point(other.newX, other.newY);
    }
    public point setterBackward(line other) {
        // Step 1: Update newX/newY from other.end
        other.newX = other.end.x- 50;
        other.newY = other.end.y ; // move down 50px

        // Step 2: Return new point using updated values
        return new point(other.newX, other.newY);
    }

    public point setterUp(line other) {
        // Step 1: Update newX/newY from other.end
        other.newX = other.end.x;
        other.newY = other.end.y + 50 ; // move down 50px

        // Step 2: Return new point using updated values
        return new point(other.newX, other.newY);
    }

    public point setterDown(line other) {
        // Step 1: Update newX/newY from other.end
        other.newX = other.end.x;
        other.newY = other.end.y - 50 ; // move down 50px

        // Step 2: Return new point using updated values
        return new point(other.newX, other.newY);
    }

}
